package com.julia;
//1.создать массив длинны 10.заполнить его эллементами 1-10.
//2.создать массив длинны n. заполнить его эллементами 1 -n.Функция.
//3.заполнить массив индекс - 2 * индекс из n элементов.
//4.написать функцию которая принимает массив и возвращает новый массив той же длинны но с перевернутыми элементами.
//5.заменить эллементы из массива с нечетными индексами на 0.
//6. вывести в строку все элементы из массива и пользоваться для проверки.

public class Main {

    public static void main(String[] args) {

//      ########## 1 ###########

        int[] massiv = new int[10];
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = i + 1;
        }

        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }
        System.out.println();

//        ########## 2 ###########
        int n = 53;
        int[] array = new int[n];
        for ( int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

//        ########## 3 ###########

        int n2 = 21;
        int[] array1 = new int[n2];
        for ( int i = 0; i < array1.length; i++) {
            array1[i] = i * 2;
        }

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

//        ########## 4 ###########

        int[] array2 = new int[]{2, 4, 6, 8, 10};
        int[] array3 = new int[array2.length];     // создать массив такой же длинны как array2
        int j = 0;
        for (int i = array2.length - 1; i >= 0; i--) {
            array3[j] = array2[i];
            j++;
        }

        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println();

//        ########## 5 ###########

        int[] massiv1 = new int[] {1, 8, -15, -62, 79};
        for (int i = 0; i < massiv1.length; i++) {
           if (i % 2 == 1) {
               massiv1[i] = 0;
           }
        }
        for (int i = 0; i < massiv1.length; i++) {
            System.out.print(massiv1[i] + " ");
        }
        System.out.println();
    }
}





