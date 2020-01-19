package com.julia;

public class Main {

    public static void main(String[] args) {

        int mashaCredits = 50;
        int peterCredits = mashaCredits * 80 / 100;
        int vasyaCreditsSlow = mashaCredits * 50 /100;
        int vasyaCreditsFast = mashaCredits;

        int slowSpeedCredits = 1370;

        double numberOfMonths1 = (double) slowSpeedCredits / (mashaCredits + peterCredits + vasyaCreditsSlow);
        int totalCredits = 2100;
        int creditsDifference = totalCredits - slowSpeedCredits;
        double numberOfMonths2 = creditsDifference / (mashaCredits + vasyaCreditsFast + peterCredits);
        double totalMonth = numberOfMonths1 + numberOfMonths2;
        System.out.println("number of months to issue 2100 credits: " + totalMonth);

        }
    }

