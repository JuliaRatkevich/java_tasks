package com.julia;
//1. есть массив.определить есть ли в нем нечетное число.Вывести тру или фолз
//2. есть массив.сложить все нечетне числа из него.
//3. есть массив. написать функцию которая возвращает новый массив такой же как и старый но все положительные числа умножает на 3.
//4. вывести в массив число фиобаччи.
//5. написать функцию определеяющую есть ли в массиве опред. чсило./
//6. написать фунцуию, которая принимает int число N,которая считает считает всех четных чисел из массива, не привышающих N,и отдает ее.

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[]{0, 3, 6, 8, 9, 10, -3};

//        ################# 1 #####################

        boolean hasNe4etnoe = ne4etnoe(array1);
        if (hasNe4etnoe) {
            System.out.println("Array has ne4etnoe");
        } else {
            System.out.println("Only 4etnye in array");
        }

//         ################# 2 ####################

        int sum = sumOf(array1);
        System.out.println(sum);

//        ################# 3 ####################

        int[] result = giveArray(array1);

        printArray(result);

//        ################# 4 ###################

        int fib = fibonacci(0);
        System.out.println(fib);


//        ################# 5 ###################
        int num = 88;
        boolean result1 = hasCurrentNum(array1, num);
        if (result1) {
            System.out.println("Array has number " + num);
        } else {
            System.out.println("Array does not have number " + num);
        }
//              ############## 6 ################

        int summ = sumEven(array1, 9);
        System.out.println(summ);

    }
//        ############## для проверки массива #############

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    static boolean ne4etnoe(int[] array) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    static int[] giveArray(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                result[i] = array[i] * 3;
            } else {
                result[i] = array[i];
            }
        }
        return result;
    }

    static int sumOf(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 1) {
                sum += array[i];
            }
        }
        return sum;
    }


    public static int fibonacci(int n) {
        int[] array = new int[n + 1];
        for ( int i = 0; i < array.length; i++) {
            if ( i == 0) {
                array[i] = 0;
            } else if ( i == 1) {
                array[i] = 1;
            } else {
                array[i] = array[i - 1] + array[i - 2];
            }
        }
        return array[n];
    }



    static boolean hasCurrentNum(int[] array, int n) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return true;
            }
        }
        return false;

    }


    public static int sumEven(int[] array, int n) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] <= n && array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum;
    }
}

