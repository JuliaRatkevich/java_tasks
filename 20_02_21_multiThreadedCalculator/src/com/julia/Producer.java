package com.julia;

import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<String> blockingQueue;
    private Scanner scanner;
    private int numberOfHandlers;

    public Producer(Scanner scanner, BlockingQueue<String> blockingQueue, int numberOfHandlers) {
        this.scanner = scanner;
        this.blockingQueue = blockingQueue;
        this.numberOfHandlers = numberOfHandlers;
    }

    @Override
    public void run() {
        try {
            while (scanner.hasNextLine()) {
                String nextOperation = scanner.nextLine();
                blockingQueue.put(nextOperation);
            }
            scanner.close();

            for (int i = 0; i < numberOfHandlers; i++) {
                blockingQueue.put("!!#EXIT#!!");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
