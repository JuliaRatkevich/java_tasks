package com.julia;
//0. записать числа от 0-99.
//1. есть 2-мерный массив. определить есть ли в нем отрицательные эллементы.
//2.посчитать кол-во массивов,в 2мерном массиве с отрицательными эллементамию(break,continue с меткой).
//3.static int[][] fillByOnes(int m, int n)  - Заолнить двухмерный массив единицами.
//4.функция возвращает 2-мерный массив 8 на 8 в виде шахматной доски(белые 0,черные 1).
//5.функция возвращает массив 10 на 10, заполненный так: 99….90.  89….80.  9….0  (два варианта решения)


import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] result = schach();
        for (int i = 0; i < result.length; i++) {
            System.out.println(Arrays.toString(result[i]));
        }

//        int [][] result1 = massiv();
//        for (int i = 0; i < result1.length; i++) {
//            System.out.println(Arrays.toString(result1[i]));
//        }

        int [][] result2 = massiv99();
        for (int i = 0; i < result2.length; i++) {
            System.out.println(Arrays.toString(result2[i]));
        }




//        int[][] array = new int[10][10];
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                array[i][j] = i * 10 + j;
//            }
//        }
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.println(Arrays.toString(array[i]));
//        }
//
//        int[][] array1 = new int[][]{{-1, 2, 3, 4, 5}, {2, 5, 3, 4, 5}};
//        boolean result = false;
//        First:
//        for (int i = 0; i < array1.length; i++) {
//            Second:
////            if (result == true) {
////                break;
////            }
//            for (int j = 0; j < array1[i].length; j++) {
//                if (array1[i][j] < 0) {
//                    result = true;
//                    break First;
//                }
//
//            }
//        }
//        System.out.println(result);
//
//        int[][] array2 = new int[][]{{-1, 2, -3, 4, -5}, {2, 5, 3, 4, 5}, {0, 7, 3, -4, 5}, {2, 5, 2, 4, 2}};
//        int number = 0;
//        First:
//        for (int i = 0; i < array2.length; i++) {
//            for (int j = 0; j < array2[i].length; j++) {
//                if (array2[i][j] < 0) {
//                    number++;
////                    break;
//                    continue First;
//                }
//            }
//        }
//        System.out.println(number);


    }

    public static int[][] fillByOnes(int m, int n) {
        int[][] array3 = new int[m][n];
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                array3[m][n] = 1;
            }
        }

        return array3;
    }


    public static int[][] schach() {
        int[][] array4 = new int[8][8];
        for (int i = 0; i < array4.length; i++) {
            for (int j = 0; j < array4[i].length; j++) {

                array4[i][j] = j;
//                if ((i + j) % 2 == 1) {
//                    array4[i][j] = 1;
//                } else {
//                    array4[i][j] = 0;
//                }

            }

        }
        return array4;

    }


//    public static int[][] massiv() {
//        int[][] array5 = new int[10][10];
//        for (int i = 0; i < array5.length; i++) {
//            for (int j = 0; j < array5[i].length; j++) {
//                array5[i][j] = (array5.length - 1 - i) * 10 + (array5[i].length - 1 - j);
//            }
//        }
//
//        return array5;
//    }

    private static int[][] massiv99() {
        int[][] array6 = new int[10][10];
        int number = 99;
        for ( int i = 0; i < array6.length; i++) {
            for ( int j = 0; j < array6[i].length; j++) {
                array6[i][j] = number;
                number--;
            }
        }

      return array6;
    }





}