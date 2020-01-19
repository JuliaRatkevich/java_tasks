package com.julia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("How many credits did Masha?");
        System.out.println("Amount of credits:");

        Scanner scanner = new Scanner(System.in);
        int mashaCredit = scanner.nextInt();

        int annualPlan = 1150;
        int peterCredit = mashaCredit * 80 / 100;

        int percent20_anualPlan = annualPlan * 20 / 100; // 20% в числе от плана

        int vasyaAnnualPlan = annualPlan - mashaCredit - peterCredit; //сколько ему нужно сделать что б план был выполнен всеми тремя

        int vasyaCredit;
        if (vasyaAnnualPlan > percent20_anualPlan) { //если васе нужно сделать больше чем 20%
            vasyaCredit = mashaCredit * 50 / 100;
        } else {
            vasyaCredit = mashaCredit;
        }

        int mashaPeterVasyaCredits = mashaCredit + peterCredit + vasyaCredit; //сумма их трех (total)
        if (mashaPeterVasyaCredits >= annualPlan) {
            System.out.println("If Masha made " + mashaCredit + " cretids - Masha, Peter and Vasya completed the annual plan"); //маша = значение сканера
        } else {
            System.out.println("Masha, Peter and Vasya did NOT fulfill the annual plan");
        }
    }
}