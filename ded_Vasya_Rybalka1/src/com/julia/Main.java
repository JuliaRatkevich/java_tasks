package com.julia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("What is the temperature today?");

        System.out.println("Temperature today is:");

        Scanner scanner = new Scanner(System.in);
        int temperature = scanner.nextInt();
        System.out.println("Temperature today is: " + temperature);


        System.out.println("What day of the week is today?");

        System.out.println("Today is:");

        Scanner scanner1 = new Scanner(System.in);
        int day = scanner1.nextInt();
        System.out.println("Today is: " + day);

        if (day == 4 & temperature >= 19 & temperature <= 23) {
            System.out.println("Ded_Vasya will go fishing");
        } else if (day == 4 & temperature < 19) {
            System.out.println("Temperature is lower than desired");
        } else if (day == 4 & temperature > 23) {
            System.out.println("Temperature is higher than desired");
        } else if (day < 4) {
            int daysBeforeFishing = 4 - day;
            System.out.println("Days before fishing:" + daysBeforeFishing);
        } else if (day > 4 & day <= 7) {
            int daysBeforeFishing = 7 - day + 4;
            System.out.println("Days before fishing:" + daysBeforeFishing);
        } else {
            System.out.println("Incorrect day of the week: " + day);
        }
    }
}
