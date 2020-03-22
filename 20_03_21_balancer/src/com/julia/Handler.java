package com.julia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Handler implements Runnable {
    private Balancer balancer;

    private Socket clientSocket;
    private PrintWriter clientOut;
    private BufferedReader clientIn;

    private Socket serverSocket;
    private PrintWriter serverOut;
    private BufferedReader serverIn;

    public Handler(Socket clientSocket, Balancer balancer) {
        this.clientSocket = clientSocket;
        this.balancer = balancer;
    }

    @Override
    public void run() {
        try {
            clientOut = new PrintWriter(clientSocket.getOutputStream(), true);

            clientIn = new BufferedReader(
                    new InputStreamReader(clientSocket.getInputStream()));

            String inputLine;
            while ((inputLine = clientIn.readLine()) != null) {
                if ("_done_".equals(inputLine)) {
                    break;
                }
                String response = sendToServer(inputLine);
                clientOut.println(response);
                closeServer();
            }

            clientIn.close();
            clientOut.close();
            clientSocket.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String sendToServer(String message) throws IOException {
        Integer serverPort = balancer.getTarget();
        serverSocket = new Socket("127.0.0.1", serverPort);
        serverOut = new PrintWriter(serverSocket.getOutputStream(), true);
        serverIn = new BufferedReader(new InputStreamReader(serverSocket.getInputStream()));

        serverOut.println( message);
        String resp = serverIn.readLine();
        return resp;
    }

    private void closeServer() throws IOException {
        serverOut.println("_done_");
        serverIn.close();
        serverOut.close();
        serverSocket.close();
    }

}