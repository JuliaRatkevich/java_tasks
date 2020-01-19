package com.julia;

public class Main {

    public static void main(String[] args) {
       myFunction(300);
    }

    public static void myFunction(int n) {
        int numberOfCredit = 0;
        int mashaNumOfCredit = 0;
        int peterNumOfCredit = 0;
        int vasyaNumOfCredit = 0;

        while ( numberOfCredit < n ) {
            numberOfCredit++;

            if ( numberOfCredit % 13 == 0) {

                continue;
            }

            if ( numberOfCredit % 3 == 0 ) {
                mashaNumOfCredit++;

                System.out.println("Masha gave out № " + numberOfCredit);
            }

            if ( numberOfCredit % 3 == 1) {
                peterNumOfCredit++;

                System.out.println("Peter gave out № " + numberOfCredit);
            }

            if ( numberOfCredit % 3 == 2) {
                vasyaNumOfCredit++;

                System.out.println("Vasya gave out № " + numberOfCredit);
            }

        }
        System.out.println("Total issued = " + (mashaNumOfCredit + peterNumOfCredit + vasyaNumOfCredit));
    }
}

//    for (int numberOfCredits = 1; numberOfCredits <= n; numberOfcredits++){ }