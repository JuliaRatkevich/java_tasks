package com.julia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server implements Runnable {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Integer port;
    private String id;

    public Server(Integer port, String id) {
        this.port = port;
        this.id = id;
    }

    @Override
    public void run() {
        try {
            serverSocket = new ServerSocket(port);
            while (true) {
                Socket clientSocket = serverSocket.accept();
                Handler handler = new Handler(clientSocket, id);
                ExecutorService executor = Executors.newSingleThreadExecutor();
                executor.submit(handler);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void stop() throws IOException {
        serverSocket.close();
    }
}