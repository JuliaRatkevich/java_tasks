package com.julia;
import java.io.*;

public class Receiver extends Thread {
//    private String filename;
//
//    public Receiver(Messenger messenger, String filename) {
//        this.messenger = messenger;
//        this.filename = filename;
//    }

    private final Messenger messenger;
    private final PrintWriter pw;

    public Receiver(Messenger messenger, PrintWriter pw) {
        this.messenger = messenger;
        this.pw = pw;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = messenger.removeMessage();
                synchronized (Receiver.class) {
                    int type = (int) (Math.random() * 4);
//                    String messageToWrite = message;
                    switch (type) {
                        case 0:
                            message = message.toUpperCase();
                            break;
                        case 1:
                            message = message.toLowerCase();
                            break;
                        case 2:
                            message = message.repeat(2);
                            break;
                        case 3:
                            message = message + "___redacted";
                            break;
                    }
                    pw.println(message + " " + getName());
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public void run() {
//        while (true) {
//            try (PrintStream ps = new PrintStream(new FileOutputStream(filename, true))) {
//                String message = messenger.removeMessage();
////                    System.out.println(message + " " + getName());
//                synchronized (Receiver.class) {
//                    ps.println(message + " " + getName());
//                }
//            } catch (IOException | InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//
//    public static synchronized void pampam() {
//
//    }
//
//    public static void pampam() {
//        synchronized (Receiver.class) {
//
//        }
//    }

}
