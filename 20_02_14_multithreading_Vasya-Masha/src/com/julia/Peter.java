package com.julia;

import java.util.Random;

public class Peter implements Runnable {
    int credit;
    int minTime;
    int maxTime;
    long timeSpent;


    long getTimeSpent() {
        return timeSpent;
    }


    public Peter (int credit, int minTime, int maxTime) {
        this.credit = credit;
        this.minTime = minTime;
        this.maxTime = maxTime;
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
