package com.julia;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static int STEPS = 40;
    static int MIN_VELOCITY = 50;
    static int MAX_VELOCITY = 80;
    static int NUM_TARAKANS = 10;

    public static void main(String[] args) throws IOException, InterruptedException {

        List<Tarakan> tarakans = generateTarakans();

        Tarakan tormoz = new Tarakan("Tormoz", STEPS, 1000, 1500);
        tarakans.add(tormoz);

        // create threads
        List<Thread> threads = new ArrayList<>();
        for (Tarakan tarakan : tarakans) {
            Thread tarakanThread = new Thread(tarakan);
            threads.add(tarakanThread);
        }

        // start threads
        for (Thread thread : threads) {
            thread.start();
        }

        // join threads
        for (Thread thread : threads) {
            thread.join();
        }

        // sort tarakans
        tarakans.sort(Comparator.comparing(Tarakan::getTimeSpent));

        // print results
        for (Tarakan tarakan: tarakans) {
            System.out.println(tarakan.name + ": " + tarakan.timeSpent);
        }
    }

    private static List<Tarakan> generateTarakans() {
        List<Tarakan> tarakans = new ArrayList<>();
        for (int i = 0; i < NUM_TARAKANS; i++) {
            String name = "Tarakan#" + (i + 1);
            Tarakan tarakan = new Tarakan(name, STEPS, MIN_VELOCITY, MAX_VELOCITY);
            tarakans.add(tarakan);
        }

        return tarakans;
    }
}
