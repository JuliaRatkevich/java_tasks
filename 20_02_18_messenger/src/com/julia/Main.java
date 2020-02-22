package com.julia;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        Messenger messenger = new Messenger();
        Thread sender = new Sender(messenger);

        Thread[] receivers = new Thread[5];
        for (int i = 0; i < receivers.length; i++) {
            receivers[i] = new Receiver(messenger);
            receivers[i].setDaemon(true);
        }

        for (int i = 0; i < receivers.length; i++) {
            receivers[i].start();
        }

        sender.start();
    }
}
