package com.julia;

import java.util.Random;

public class Tarakan implements Runnable {
    String name;
    int steps;
    int minVelocity;
    int maxVelocity;
    long timeSpent;

    long getTimeSpent() {
        return timeSpent;
    }

    public Tarakan(String name, int steps, int minVelocity, int maxVelocity) {
        this.name = name;
        this.steps = steps;
        this.minVelocity = minVelocity;
        this.maxVelocity = maxVelocity;
    }


    @Override
    public void run() {
        Random randomGenerator = new Random();
        long currentTime = System.currentTimeMillis();
        for (int i = 0; i < steps; i++) {
            try {
                int stepSpeed = minVelocity + randomGenerator.nextInt((maxVelocity - minVelocity + 1));
                Thread.sleep(stepSpeed);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.timeSpent = System.currentTimeMillis() - currentTime;
        System.out.println("Done: " + this.name);
    }
}
