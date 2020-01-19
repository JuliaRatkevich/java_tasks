package com.julia;

public class Main {

    public static void main(String[] args) {
        
        // Year credit plan
        int intYearCreditPlan = 1150;

        // Productivity in %
        int intMashaHasProductivity = 100;
        int intPetjaHasProductivity = (int)(intMashaHasProductivity * 0.8);
        int intWasjaHasProductivity = (int)(intMashaHasProductivity * 0.5 * 0.8) + (int)(intMashaHasProductivity * 0.2);

        // Variant 1
        // Productivity in Credits
        int intMashaHasCredits = 450;
        int intPetjaHasCredits = intMashaHasCredits * intPetjaHasProductivity / 100;
        int intWasjaHasCredits = intMashaHasCredits * intWasjaHasProductivity / 100;
        int intAmountOfCredits = intMashaHasCredits + intPetjaHasCredits + intWasjaHasCredits;

        boolean blnDidTheyManageToFulfillThePlan = intAmountOfCredits >= intYearCreditPlan;

        System.out.println("Variant 1: Masha has " + intMashaHasCredits + " credits.");
        if (blnDidTheyManageToFulfillThePlan) {
            System.out.println("If Masha works out " + intMashaHasCredits + " credits, then all the guys will work out " +  intAmountOfCredits + " credits together.");
        } else {
            System.out.println("If Masha works out " + intMashaHasCredits + " credits, then all the guys together will not be able to fulfill the annual plan, because they worked out only " + intAmountOfCredits + " credits");
        }

        // Variant 1
        // Productivity in Credits
        intMashaHasCredits = 500;
        intPetjaHasCredits = intMashaHasCredits * intPetjaHasProductivity / 100;
        intWasjaHasCredits = intMashaHasCredits * intWasjaHasProductivity / 100;
        intAmountOfCredits = intMashaHasCredits + intPetjaHasCredits + intWasjaHasCredits;

        blnDidTheyManageToFulfillThePlan = intAmountOfCredits >= intYearCreditPlan;

        System.out.println("Variant 1: Masha has " + intMashaHasCredits + " credits.");
        if (blnDidTheyManageToFulfillThePlan) {
            System.out.println("If Masha works out " + intMashaHasCredits + " credits, then all the guys will work out " +  intAmountOfCredits + " credits together.");
        } else {
            System.out.println("If Masha works out " + intMashaHasCredits + " credits, then all the guys together will not be able to fulfill the annual plan, because they worked out only " + intAmountOfCredits + " credits");
        }

    }
}