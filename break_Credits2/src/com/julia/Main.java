package com.julia;

public class Main {

    public static void main(String[] args) {
        myFunction(300);
    }

    public static void myFunction(int n) {


        int tottalCredits = 0;

        for (int numberOfCredit = 1; numberOfCredit <= n; numberOfCredit++){

            if ( numberOfCredit % 13 == 0) {

                continue;
            }

            if ( numberOfCredit % 3 == 0 ) {
//                tottalCredits++;

                System.out.println("Masha gave out № " + numberOfCredit);
            }

            if ( numberOfCredit % 3 == 1) {
//                tottalCredits++;

                System.out.println("Peter gave out № " + numberOfCredit);
            }

            if ( numberOfCredit % 3 == 2) {
//                tottalCredits++;

                System.out.println("Vasya gave out № " + numberOfCredit);

            }
            tottalCredits++;
        }
        System.out.println("Total issued = " + tottalCredits);
    }
}


