package com.julia;
//0. Написать функцию которая принимает отсортированный массив и скомый элемент.возвращает либо индекс в случае успеха
// либо индекс куда можно вставаить этот лемент с отрицательным знаком.
//1. Написать функцию, которая принимает int массив  возвращает его копию
//2. Написать функцию, которая принимает int массив и число и возвращает массив длины на 1 больше,
// чем предыдущий, состоящий из старого массива и числа в конце
//3. Написать ф-ю, которая принимает массив, число и индекс, куда это число надо вставить,
// а возвращает новый массив длины на 1 больше, как старый массив со вставленным куда надо элементом

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[]{8, 2, 5, -10, 4};
//        sortir(array);
//        System.out.println(Arrays.toString(array));
//
        int[] arrayCopy = insert(array, 123456, 0);
        System.out.println(Arrays.toString(arrayCopy));


//        sortir(array);
//        System.out.println(Arrays.toString(array));
//        int index = binarySearch(array, -9);
//        System.out.println("index: " + index);
    }
//                 ######### 1 #########

    static int[] copy(int[] array) {
        int[] newArray = new int[array.length];
        for ( int i = 0; i < newArray.length; i++) {
            newArray[i] = array[i];

        }
        return newArray;
    }

    //                 ######### 2 #########


    static int[] copyPlus1(int[] array, int number) {
        int[] newArray = new int[array.length + 1];

        //1. copy
        for ( int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        //2. add number
        int index = newArray.length - 1;
        newArray[index] = number;
        return newArray;
    }


    //                 ######### 3 #########


    static int[] insert(int[] array, int number, int index) {
        int[] newArray = new int[array.length + 1];
        for ( int i = 0; i < newArray.length; i++) {
            if ( i < index) {
                newArray[i] = array[i];
            } else if ( i == index) {
                newArray[i] = number; // приваивает элементу по индексу i значение  number;
            } else {
                newArray[i] = array[i - 1]; // все элементы после вставленного элемента перемещаются на одну позицию назад.
            }
        }
        return newArray;
    }


//                 ######## 0 ##########


    static int binarySearch(int[] array, int n) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {   // пока между двумя индексами есть хотя бы один элемент
            int middle = left + (right - left) / 2;
            if ( array[middle] == n ) {
                return middle;
            } else if (n < array[middle]) {
                right = middle - 1;  //искомый элемент находится слева от середины - обновляюет конец правой
            } else {
                left = middle + 1; //искомый элемент находится справа от середины - обновляюет левый конец
            }
        }

        return  -1;
//        return -left - 1;
    }


//    сортировка выбором лучший вариант. Selection sort.

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
            array[i] = min; // min == array[minIndex]
            array[minIndex] = temp;
        }
    }
}
