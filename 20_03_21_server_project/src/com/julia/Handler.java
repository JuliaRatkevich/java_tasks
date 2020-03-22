package com.julia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class Handler implements Runnable {
    private Socket clientSocket;
    private String id;
    private PrintWriter out;
    private BufferedReader in;

    // UDP
    private DatagramSocket balancerSocket;
    private InetAddress balancerAddress;
    private byte[] buf;

    public Handler(Socket clientSocket, String id) {
        this.clientSocket = clientSocket;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            connectToBalancer();
            notifyBalance("_submitted_#" + id);
            out = new PrintWriter(clientSocket.getOutputStream(), true);

            in = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                long seconds = (long)(Math.random() * 10);
                System.out.println("Sleep: " + seconds);
                TimeUnit.SECONDS.sleep(seconds);
                if ("_done_".equals(inputLine)) {
                    break;
                }
                out.println("Handled by server " + id + ": " + inputLine);
            }

            notifyBalance("_handled_#" + id);
            closeConnections();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void connectToBalancer() throws Exception {
        balancerSocket = new DatagramSocket();
        balancerAddress = InetAddress.getByName("localhost");
    }

    private void notifyBalance(String message) throws Exception {
//        System.out.println("NOTIFY: " + message);
        buf = message.getBytes();
        DatagramPacket packet
                = new DatagramPacket(buf, buf.length, balancerAddress, 6000);
        balancerSocket.send(packet);
    }

    private void closeConnections() throws Exception {
        in.close();
        out.close();
        clientSocket.close();
        balancerSocket.close();
    }
}
