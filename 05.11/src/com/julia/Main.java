package com.julia;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array = fillArray_hard();
//        printArray(array);

        int[][] array1 = fillArray();
        printArray(array1);
    }

    static int[][] fillArray() {
//        int number = 99;
        int[][] array = new int[3][10];

        int num = 99;
        for (int i = 0; i < array.length; i++) {

            int[] stroka = array[i];

            for (int j = 0; j < stroka.length; j++) {
                stroka[j] = num;
                num--;
            }

        }

//        int[] stroka_0 = array[0];
//        for (int i = 0; i < stroka_0.length; i++) {
//            stroka_0[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_1 = array[1];
//        for (int i = 0; i < stroka_1.length; i++) {
//            stroka_1[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_2 = array[2];
//        for (int i = 0; i < stroka_2.length; i++) {
//            stroka_2[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_3 = array[3];
//        for (int i = 0; i < stroka_3.length; i++) {
//            stroka_3[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_4 = array[4];
//        for (int i = 0; i < stroka_4.length; i++) {
//            stroka_4[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_5 = array[5];
//        for (int i = 0; i < stroka_5.length; i++) {
//            stroka_5[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_6 = array[6];
//        for (int i = 0; i < stroka_6.length; i++) {
//            stroka_6[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_7 = array[7];
//        for (int i = 0; i < stroka_7.length; i++) {
//            stroka_7[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_8 = array[8];
//        for (int i = 0; i < stroka_8.length; i++) {
//            stroka_8[i] = num;
//            num--;
//        }
//
////        num = 1;
//        int[] stroka_9 = array[9];
//        for (int i = 0; i < stroka_9.length; i++) {
//            stroka_9[i] = num;
//            num--;
//        }


//        for (int i = 0; i < array.length; i++) {
////            for ( int j = 0; j < array[i].length; j++) {
////                array[i][j] = number;
////                number--;
////
////            }
//        }
        return array;

    }

    static int[][] fillArray_hard() {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for ( int j = 0; j < array[i].length; j++) {
                array[i][j] = ( array.length - 1 - i) * 10 + (array[i].length);


            }
        }
        return array;

    }

    static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    int a = 1;
    for (int i = 0; i < 3; i++) {
        System.out.println(a);
        a++;
    }

    int a = 1;
    // i = 0
    System.out.println(a);
    a++;

    // i = 1
    System.out.println(a);
    a++;

    //i = 2
    System.out.println(a);
    a++;

    //i = 3

}