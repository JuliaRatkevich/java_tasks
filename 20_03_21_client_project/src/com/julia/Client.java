package com.julia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;


public class Client {

    static final int PORT = 6666;

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private String id;

    public Client(String id) {
        this.id = id;
    }

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        out = new PrintWriter(clientSocket.getOutputStream(), true);
        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }

    public String sendMessage(String msg) throws IOException {
        out.println(id + ": " + msg);
        String resp = in.readLine();
        return resp;
    }

    public void stopConnection() throws IOException {
        out.println("_done_");
        in.close();
        out.close();
        clientSocket.close();
    }
}
