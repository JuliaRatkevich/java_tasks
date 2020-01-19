package com.julia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{8, 2, 5, -10, 4};
//        System.out.println(array);
//        sortir(array);
//        System.out.println(Arrays.toString(array));

        int[] arrayCopy = copy(array);
        arrayCopy[0] = -666;
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayCopy));

    }

    static int[] copy(int[] array) {
        int[] newArray = array;
        return array;
    }


//    static boolean blabla(int[] array1, int x){
//        for (int i = 0; i < array1.length; i++) {
//            int min = array1[i];
//            int minId = i;
//            while ( array1[i] )
//
//
//
//        }
//
//
//    }

//    сортировка лучший вариант

    static void sortir(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minIndex = i;
            for (int j = i; j < array.length; j++) {
                if ( min > array[j]) {
                    min = array[j];
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minIndex] = temp;
        }
    }
}
