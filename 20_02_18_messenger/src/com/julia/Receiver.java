package com.julia;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Receiver extends Thread {

    private Messenger messenger;

    public Receiver(Messenger messenger) {
        this.messenger = messenger;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = messenger.removeMessage();
                writeToFile(message);
            } catch (Exception e) {
                return;
            }
        }
    }

    private void writeToFile(String message) throws IOException {
//        FileWriter fileWriter = new FileWriter("messages.txt", true);
        PrintWriter pw = new PrintWriter("messages.txt");
        String toWrite = message + ": " + getName();
        pw.println(toWrite);
        pw.close();

    }
}
