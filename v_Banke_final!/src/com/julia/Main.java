package com.julia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("How many credits did Masha?");
        System.out.println("Amount of credits:");

        Scanner scanner = new Scanner(System.in);
        int mashaPerYear = scanner.nextInt();

        int annualPlan = 1150;
        int peterPerYear = mashaPerYear * 80 /100;
        int vasyaPerYearSlow = mashaPerYear * 50 / 100;
        int vasyaPerYearFast = mashaPerYear;
        int annualPlan80 = annualPlan * 80 / 100;

        double time80 = (double) annualPlan80 / ( mashaPerYear + peterPerYear + vasyaPerYearSlow);

        if (time80 >= 1) {
            System.out.println("Plan not completed");
        } else {
            double timeLeft = 1 - time80;
            double willDoCredits = (vasyaPerYearFast + mashaPerYear + peterPerYear) * timeLeft;
            if (annualPlan80 + willDoCredits >= annualPlan) {
                System.out.println("Plan completed " + (annualPlan80 + willDoCredits));
            } else {
                System.out.println("Plan not fulfilled "+ (annualPlan80 + willDoCredits));
            }
        }
    }
}
