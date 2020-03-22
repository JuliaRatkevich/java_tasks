package com.julia;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    // till 2^16
    static final int PORT = 2000;

    public static void main(String[] args) throws IOException {
//        ServerSocket server = new ServerSocket(PORT);
//
//        while (true) {
//            Socket socket = server.accept();
//
//            Runnable run = () -> {
//
//                try {
//                    BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//                    PrintStream ps = new PrintStream(socket.getOutputStream());
//
//                    String line;
//                    while ((line = br.readLine()) != null) {
//                        ps.println(line + " hello");
//                    }
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            };
//
//            Thread handler = new Thread(run);
//            handler.start();
//
////            socket.close();
//        }
    }
}