package com.julia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        myFunc(10);
        int[] array = fillArray(10);
        System.out.println(Arrays.toString(array));
    }

    public static void myFunc(int n) {
        int number = n;
        for (int i = 0; i <= n; i++ ) {
            System.out.println("index " + i +": " + number);
            number -= 1;
        }

    }

    public static int[] fillArray(int n) {
        int number = n;
        int[] array = new  int[n];
        for ( int i = 0; i < array.length; i++ ) {
            array[i] = number;
            number--;
        }
       return array;
    }

}

