package com.julia;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        CharPrinter runnable = new CharPrinter('*', 100);
        CharPrinter runnable1 = new CharPrinter('+', 100);
        CharPrinter runnable2 = new CharPrinter('-', 100);
        Thread th = new Thread(runnable);
        Thread th1 = new Thread(runnable1);
        Thread th2 = new Thread(runnable2);
        th1.setDaemon(true);
        th2.setDaemon(true);
        th.setDaemon(true);



        long currentTime = System.currentTimeMillis();
        th.start();
        th1.start();
        th2.start();

        //this method forces the main thread wait for the end of th execution
//        th.join();
//        th1.join();
//        th2.join();

        long executionTime = System.currentTimeMillis() - currentTime;
        System.out.println("Time of execution is :" + executionTime);
        System.out.println("End of main");


    }
}
