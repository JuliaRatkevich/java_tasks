package com.julia;
    public class Main {
    public static void main(String[] args) {

        int mashaCredit = 500;
        int peterCredit = mashaCredit * 80 / 100;
        int vasyaCredit = mashaCredit * 50 / 100;
        int vasyaCreditFast = mashaCredit;
        int annualPlan = 1150;
        int availableTime = 1;
        int annualPlan80 = annualPlan * 80 / 100;
        int annualPlan20 = annualPlan * 20 / 100;

        int allCreditsSlow = mashaCredit + peterCredit + vasyaCredit;
        int allCreditsFast = mashaCredit + peterCredit + vasyaCreditFast;

        double timehalfCredit1 = (double) annualPlan80 / allCreditsSlow;
        double timehalfCredit2 = (double) annualPlan20 / allCreditsFast;

        double timeallCredits = timehalfCredit1 + timehalfCredit2;

        if (timeallCredits > availableTime) {
            System.out.println("plan is NOT completed");
        } else {
            System.out.println("plan is completed");
      }
    }
}
