package com.julia;

public class Main {

    public static void main(String[] args) {

        int[] massiv1 = new int[10];
        for (int i = 0; i < massiv1.length; i++) {
            massiv1[i] = i + 1;
        }

        arrayPrint(massiv1);

        int n = 15;
        int[] massiv2 = new int[n];
        for (int i = 0; i < massiv2.length; i++) {
            massiv2[i] = i + 1;
        }

        arrayPrint(massiv2);

        int[] massiv3 = new int[n];
        for (int i = 0; i < massiv3.length; i++) {
            massiv3[i] = i * 3;
        }

        arrayPrint(massiv3);


        int[] massiv4 = new int[] {11, 12, 13, 14, 15};

        int[] result1 = reverse(massiv4);
        arrayPrint(result1);


    }




    public static void arrayPrint(int[] array ) {
        for (int i = 0; i < array.length; i++) {
            System.out.print( array[i] + " ");
        }
        System.out.println();

    }

    public static int[] reverse(int[] rrrrr) {
        int[] result = new int[rrrrr.length];
        int k = 0;
        for ( int i = rrrrr.length - 1; i >= 0; i--) {
            result[k] = rrrrr[i];
            k++;
        }
        return result;
    }




}
