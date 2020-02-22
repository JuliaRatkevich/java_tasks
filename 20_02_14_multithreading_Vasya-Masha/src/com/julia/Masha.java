package com.julia;

import java.util.Random;

public class Masha implements Runnable {

    int credit;
    int minTime;
    int maxTime;
    long timeSpent;


    public Masha( int credit, int minTime, int maxTime) {
        this.credit = credit;
        this.minTime = (int)(minTime * 1.2);
        this.maxTime = (int)(maxTime * 1.2);
    }


    long getTimeSpent() {
        return timeSpent;
    }


    @Override
    public void run() {
        Random randomGenerator = new Random();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < credit; i++)  {
            try {
                int time = minTime + randomGenerator.nextInt((maxTime - minTime + 1));
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.timeSpent = System.currentTimeMillis() - currentTime;
    }


}


