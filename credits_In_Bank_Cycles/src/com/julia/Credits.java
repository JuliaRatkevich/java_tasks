package com.julia;

public class Credits {

    public static void main(String[] args) {

        int summa = 0;

        int mashaCreditsPerMonth = 50;
        for (int month = 1; month <= 18; month++) {
            summa += mashaCreditsPerMonth;
            mashaCreditsPerMonth++;
        }

        int peterCreditsPerMonth = 40;
        for (int month = 1; month <= 18; month++) {
            // полезная работа
            summa += peterCreditsPerMonth;
            System.out.println(peterCreditsPerMonth);

            // обновление
            if (month%2 == 0) {
                peterCreditsPerMonth++;
            }
        }

        int vasyaCreditsPerMonth = 50;
        for ( int month = 1; month <= 18; month++ ) {
            summa += vasyaCreditsPerMonth;
//            System.out.println("Month:" + month + " credits:" + vasyaCreditsPerMonth);

            if (month < 10) {
                vasyaCreditsPerMonth--;
            } else {
                vasyaCreditsPerMonth = 50;
            }
        }
        System.out.println("loan amount for 18 months = " + summa);
    }
}
