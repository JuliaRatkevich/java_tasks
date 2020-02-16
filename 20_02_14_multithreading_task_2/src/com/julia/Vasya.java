package com.julia;

import java.util.Random;

public class Vasya implements Runnable {
    int credit;
    int minTime;
    int maxTime;
    long timeSpent;


    long getTimeSpent() {
        return timeSpent;
    }


    public Vasya ( int credit, int minTime, int maxTime) {
        this.credit = credit;
        this.minTime = minTime;
        this.maxTime = maxTime;
    }


    @Override
    public void run() {
        Random randomGenerator = new Random();
        long currentTime = System.currentTimeMillis();
        int fastCredits = 0;
        for (int i = 0; i < credit; i++)  {
            try {
                // проверяем снизошло ли озарение (вероятность 20%)
                if (fastCredits == 0) {
                    int random = 1 + randomGenerator.nextInt(100);
                    if (random <= 20) {
                        fastCredits = 3;
                    }
                }

                int currentMinTime = minTime;
                int currentMaxTime = maxTime;
                // в случае озарения умножаем мин и макс время на 1.5
                // озарение длится только 3 кредита
                if (fastCredits > 0) {
                    currentMinTime = (int)(1.5 * minTime);
                    currentMaxTime = (int)(1.5 * maxTime);
                    fastCredits--;
                }

                int time = currentMinTime + randomGenerator.nextInt((currentMaxTime - currentMinTime + 1));
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.timeSpent = System.currentTimeMillis() - currentTime;

    }
}