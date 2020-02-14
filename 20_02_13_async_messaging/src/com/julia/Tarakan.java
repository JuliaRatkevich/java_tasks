package com.julia;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Tarakan implements Runnable {

    int id;
    int steps;
    int minVelocity;
    int maxVelocity;



    public Tarakan(int id, int steps, int minVelocity, int maxVelocity) {
        this.id = id;
        this.steps = steps;
        this.minVelocity = minVelocity;
        this.maxVelocity = maxVelocity;

    }


    @Override
    public void run() {
        for (int i = 0; i < steps; i++) {
            System.out.println(id);
            try {
                int winRate= minVelocity + (int)(Math.random() * ((maxVelocity - minVelocity) + 1));
                Thread.sleep(winRate);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long currentTime = System.currentTimeMillis();
        List finishInfo = new ArrayList<>();
        finishInfo.add(id);
        System.out.print( finishInfo + " Finish");
    }
}
