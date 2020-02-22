package com.julia;

public class Main {

    public static void main(String[] args) {
        Thread th1 = new DeadLockThread();
        Thread th2 = new DeadLockThread();

        th1.setName("a");
        th2.setName("b");
        th1.start();
        th2.start();


    }
}
