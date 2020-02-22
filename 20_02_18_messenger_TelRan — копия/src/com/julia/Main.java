package com.julia;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;


public class Main {

    public static void main(String[] args) throws FileNotFoundException, InterruptedException {

        Messenger messenger = new Messenger();
        PrintWriter pw = new PrintWriter("output.txt");

        Thread sender = new Sender(messenger);
        sender.start();

        Random rand = new Random();


        Thread[] receivers = new Thread[5];
        for (int i = 0; i < receivers.length; i++) {
            int random_integer = rand.nextInt(2);
            if (random_integer == 0) {
                receivers[i] = new Receiver(messenger, pw);
            }else {
                receivers[i] = new ReceiverSecond(messenger, pw);

            }
            receivers[i].setDaemon(true);
        }

        for (int i = 0; i < receivers.length; i++) {
            receivers[i].start();
        }

        sender.join();
        pw.close();
    }
}