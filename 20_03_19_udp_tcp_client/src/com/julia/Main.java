package com.julia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class Main {

    static final int PORT = 3000;

    public static void main(String[] args) throws IOException {


        InetAddress ip = InetAddress.getByName("localhost");

        DatagramSocket socket = new DatagramSocket();

        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = consoleReader.readLine()) != null && !line.equals("exit")) {
            byte[] buf = new byte[256];
            DatagramPacket packet = new DatagramPacket(line.getBytes(),
                    line.length(),
                    ip,
                    PORT);
            socket.send(packet);

            packet = new DatagramPacket(buf, buf.length);
            socket.receive(packet);
            String received = new String(packet.getData(), 0, packet.getLength());
            System.out.println("from the server: " + received);
        }
        socket.close();
    }
}
