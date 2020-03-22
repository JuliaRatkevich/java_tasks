package com.julia;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws Exception {
	    Server server1 = new Server(7000, "Masha");
        ExecutorService executor = Executors.newFixedThreadPool(3);
        executor.submit(server1);
        Server server2 = new Server(7001, "Petya");
        executor.submit(server2);
        Server server3 = new Server(7002, "Vasya");
        executor.submit(server3);
    }
}
