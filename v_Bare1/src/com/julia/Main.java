package com.julia;

public class Main {

    public static void main(String[] args) {

        final int petyaOrdered = 4;
        int mashaOrdered = petyaOrdered / 2;

        int onTheTable = petyaOrdered + mashaOrdered;

        int mashaDrank = 1;
        int petyaDrank = 1;

        onTheTable = onTheTable - petyaDrank - mashaDrank;

        final int vasyaOrdered = onTheTable + 1;

        onTheTable += vasyaOrdered;

        if (onTheTable % 3 == 0) {
            System.out.println("The beer has been devided");
        } else {
            System.out.println("The beer has been devided");
        }

        mashaDrank += (onTheTable / 3);
        if (mashaDrank > 4) {
            System.out.println("Masha is funny");

        }else {
            System.out.println("Masha is not funny");
        }

    }
}
