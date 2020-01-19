package com.julia;

public class Main {

    public static void main(String[] args) {
        int[] z = {7, 2, 4, 9};
        int[] z2 = new int[z.length];
        for (int i = 0; i < z.length; i++) {
            z2[i] = z[i] * 5;
        }
        
        printArray(z);
        printArrayMultiply(z);
    }

    static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

    static void printArrayMultiply(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] * 3 + " ");
        }

    }
}
