package com.julia;
// 5+8+11+...+83+86 вывести сумму
public class Main {

    public static void main(String[] args) {

        int number = 5;
        int summa = 0;
        while ( number <= 86) {
            summa = summa + number;
            number = number + 3;
        }
        System.out.println(summa);
    }
}
