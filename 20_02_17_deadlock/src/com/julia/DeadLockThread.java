package com.julia;

public class DeadLockThread extends Thread {

    private static Object mu1 = new Object();
    private static Object mu2 = new Object();

    private void f1() throws InterruptedException {
        System.out.println("f1: " + getName());
        synchronized (mu1) {
            sleep(100);
            synchronized (mu2) {
                sleep(100);
                System.out.println("inside f1");
            }
        }
    }

    private void f2() throws InterruptedException {
        System.out.println("f2: " + getName());
        synchronized (mu2) {
            sleep(100);
            synchronized (mu1) {
                sleep(100);
                System.out.println("inside f2");
            }
        }
    }

    @Override
    public void run() {
        try {
            if (getName() == "a") {
                f1();
            } else {
                f2();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
