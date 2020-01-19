package com.julia;

public class Main {

    public static void main(String[] args) {
        int number = 1;
        while ( number <= 1000){
           if (number%13 == 0 | number%7 ==0 | number%5 == 0){
               System.out.println( number);
           }
           number++;
        }
    }
}
