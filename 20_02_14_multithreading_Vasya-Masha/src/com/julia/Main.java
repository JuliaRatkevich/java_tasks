package com.julia;

public class Main {

    static int CREDITS = 20;
    static int MIN_TIME = 100;
    static int MAX_TIME = 200;


    public static void main(String[] args) throws InterruptedException {
        Masha masha = new Masha(CREDITS, MIN_TIME, MAX_TIME);
        Vasya vasya = new Vasya(CREDITS, MIN_TIME, MAX_TIME);
        Peter peter = new Peter(CREDITS, MIN_TIME, MAX_TIME);

        Thread mashaThread = new Thread(masha);
        Thread vasyaThread = new Thread(vasya);
        Thread peterThread = new Thread(peter);

        mashaThread.start();
        vasyaThread.start();
        peterThread.start();

        mashaThread.join();
        vasyaThread.join();
        peterThread.join();

        System.out.println("Masha time: " + masha.getTimeSpent());
        System.out.println("Vasya time: " + vasya.getTimeSpent());
        System.out.println("Peter time: " + peter.getTimeSpent());
    }
}
