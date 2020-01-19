package com.julia;
// 1+2+3+4...+87 вывести сумму
public class Main {

    public static void main(String[] args) {

        int number = 1;
        int summa = 0;
        while ( number <= 87){
            summa = summa + number;
            number++;
        }

        System.out.println(summa);
    }
}
