package com.julia;
​
import java.util.Scanner;
​
public class Main {
​
    public static void main(String[] args) {
​
​
        System.out.println("What is the temperature today?");
​
        System.out.println("Temperature today is:");
​
        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        System.out.println("Temperature today is: " + temperature);
​
​
        System.out.println("What day of the week is today?");
​
        System.out.println("Today is:");
​
        Scanner scanner1 = new Scanner(System.in);
        int day = scanner1.nextInt();
        System.out.println("Today is: " + day);
​
​
        if (temperature >= 19 & temperature <= 23 & day == 4) {
            System.out.println("Ded_Vasya will going fishing");
​
        } else if (temperature <= 18) {
            System.out.println("Temperature is lower than desired");
​
        } else if (temperature >= 24) {
            System.out.println("Temperature is higher than desired");
​
        } else {
            System.out.println("Ded_Vasya will NOT going fishing");
        }
​
​
        if (day == 1) {
            System.out.println("3 days before fishing");
        } else if (day == 2) {
            System.out.println("2 days before fishing");
        } else if (day == 3) {
            System.out.println("1 days before fishing");
        } else if (day == 5) {
            System.out.println("6 days before fishing");
        } else if (day == 6) {
            System.out.println("5 days before fishing");
        } else if (day == 7) {
            System.out.println("4 days before fishing");
        }
    }
}