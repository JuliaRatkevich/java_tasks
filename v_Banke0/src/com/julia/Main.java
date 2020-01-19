package com.julia;

public class Main {

    public static void main(String[] args) {

//     int masha = 100;
//     int peter = masha - 20;
//     int vasya = masha - 50;
//     int annualPlan = 1150;
//     int annualPlanToday = 920;
//
//
//     if (annualPlanToday == 920) {
//
//     }


        int mashaCredit1 = 450;
        int peterCredit1 = mashaCredit1 * 80 / 100;
        int vasyaCredit1 = mashaCredit1 * 50 / 100;
        int vasyaHasMotivation1 = mashaCredit1;
        int mashaPeterVasyaCredits1 = mashaCredit1 + peterCredit1 + vasyaCredit1;
        int mashaPeterVasyaandMotivation1 = mashaCredit1 + peterCredit1 + vasyaHasMotivation1;


        int mashaCredit2 = mashaCredit1 + 50;
        int peterCredit2 = mashaCredit2 * 80 / 100;
        int vasyaCredit2 = mashaCredit2 * 50 / 100;
        int vasyaHasMotivation2 = mashaCredit2;
        int mashaPeterVasyaCredits2 = mashaCredit2 + peterCredit2 + vasyaCredit2;
        int mashaPeterVasyaandMotivation2 = mashaPeterVasyaCredits2 + peterCredit2 + vasyaHasMotivation2;

        int annualPlan = 1150;
        int annualPlanToday = 1150 * 80 / 100;


        if (mashaPeterVasyaandMotivation1 >= annualPlan) {
            System.out.println("If Masha made 450 cretids - Masha Peter and Vasya completed the annual plan" );
         } else {
            System.out.println("Masha Peter and Vasya did NOT fulfill the annual plan");
        }

        if (mashaPeterVasyaandMotivation2 >= annualPlanToday) {
            System.out.println("If Masha made 500 cretids - Masha Peter and Vasya completed the annual plan" );
        } else {
            System.out.println("Masha Peter and Vasya did NOT fulfill the annual plan");
        }
    }
}
