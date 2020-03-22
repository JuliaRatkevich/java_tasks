package com.julia;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class BalancerServer {
    private ServerSocket serverSocket;
    private Balancer balancer;

    public BalancerServer() throws Exception {
        ArrayList<Server> servers = new ArrayList<>();
        servers.add(new Server("Masha", 7000));
        servers.add(new Server("Petya", 7001));
        servers.add(new Server("Vasya", 7002));

        this.balancer = new Balancer(servers);
    }

    public void start(int port) throws Exception {
        serverSocket = new ServerSocket(port);
        ExecutorService balancerService = Executors.newSingleThreadExecutor();
        balancerService.submit(balancer);

        while (true) {
            Socket clientSocket = serverSocket.accept();
            Handler handler = new Handler(clientSocket, balancer);
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            executorService.submit(handler);
        }
    }

    public void stop() throws Exception {
        serverSocket.close();
    }
}
