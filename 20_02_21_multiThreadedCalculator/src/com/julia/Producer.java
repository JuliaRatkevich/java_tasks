package com.julia;

import java.io.FileReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<String> blockingQueue;
    private Scanner scan;
    private int numberOfHandlers;

    public Producer(FileReader fileReader,
                    BlockingQueue<String> blockingQueue,
                    int numberOfHandlers) {
        this.scan = new Scanner(fileReader);
        this.blockingQueue = blockingQueue;
        this.numberOfHandlers = numberOfHandlers;
    }

    @Override
    public void run() {
        try {
            while (scan.hasNextLine()) {
                String nextOperation = scan.nextLine();
                blockingQueue.put(nextOperation);
            }

            for (int i = 0; i < numberOfHandlers; i++) {
                blockingQueue.put("!!#EXIT#!!");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
