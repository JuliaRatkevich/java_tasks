package com.julia;
import java.io.*;

public class ReceiverSecond extends Thread {

    private final Messenger messenger;
    private final PrintWriter pw;

    public ReceiverSecond(Messenger messenger, PrintWriter pw) {
        this.messenger = messenger;
        this.pw = pw;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = messenger.removeMessage();
                synchronized (Receiver.class) {
                    pw.println(message.toLowerCase() + " " + getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
