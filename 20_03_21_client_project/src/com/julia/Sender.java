package com.julia;
import java.util.concurrent.TimeUnit;


public class Sender implements Runnable {
    private Client client;
    private String message;

    public Sender(Client client, String message) {
        this.client = client;
        this.message = message;
    }

    @Override
    public void run() {
        String response = null;
        try {
            long seconds = (long)(Math.random() * 10);
            System.out.println("Sleep: " + seconds);
            TimeUnit.SECONDS.sleep(seconds);
            response = client.sendMessage(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(response);
    }
}
