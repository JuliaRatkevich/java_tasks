package com.julia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello world");

        System.out.println("Enter your name:");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Your name is: " + name);
    }
}
