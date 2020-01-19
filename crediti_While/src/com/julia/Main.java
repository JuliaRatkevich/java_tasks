package com.julia;

public class Main {

    public static void main(String[] args) {

        int mashaCreditsMonth = 50;
        int peterCreditsMonth = mashaCreditsMonth * 80 / 100;
        int vasyaCreditsMonth = mashaCreditsMonth / 2;
        int vasyaCreditsFastMonth = mashaCreditsMonth;

        int totalCredits = 0;
        int month = 0;

        while ( totalCredits < 2100) {
            if (totalCredits >= 1370) {
                totalCredits += mashaCreditsMonth + peterCreditsMonth + vasyaCreditsFastMonth;
            } else {
                totalCredits += mashaCreditsMonth + peterCreditsMonth + vasyaCreditsMonth;
            }

            month++;
        }
        System.out.println(month);
    }
}
