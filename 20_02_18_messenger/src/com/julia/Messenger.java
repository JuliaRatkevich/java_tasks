package com.julia;

public class Messenger {

    private final Object mu = new Object();         //sender

    private volatile String message;

    public void addMessage(String message) {
        synchronized (mu) {
            this.message = message;
            mu.notify();
        }
    }

    public String removeMessage() throws InterruptedException {     //receiver
        synchronized (mu) {
            if (message == null)
                mu.wait();

            String res = message;
            message = null;
            return res;
        }
    }
}