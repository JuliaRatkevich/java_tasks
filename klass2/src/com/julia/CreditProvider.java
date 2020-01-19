package com.julia;

public class CreditProvider {

    static int numberOfCredit = 0;

    CreditProvider() {
        numberOfCredit++;
    }

    public CreditProvider(String name, String surname, boolean islazy, boolean isKind) {
        this.name = name;
        this.surname = surname;
        this.islazy = islazy;
        this.isKind = isKind;
    }

    //    CreditProvider(String nameIn, String surnameIn) {
//
    String name;
    String surname;
    boolean islazy;
    boolean isKind;

    public CreditProvider(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
//    }

    boolean provideCredit(CreditUser creditUser) {
        if (this.islazy) {
            if (creditUser.annualSalary > 20000)
                return true;
            else
                return false;
        }
        if (!this.islazy) {
            if (creditUser.annualSalary > 20000 && creditUser.age > 50)
                return true;
            else
                return false;
        }
        if (creditUser.annualSalary > 2000 && creditUser.age < 70)
            return true;
        return false;
    }


    public static void main(String[] args) {
        CreditProvider vasya = new CreditProvider();
        vasya.name = "Vasya";
        vasya.surname = "Ivanov";



        CreditUser petya = new CreditUser("masha", "umm", "m", 10, 10000);
        CreditProvider masha = new CreditProvider( )
    }

    CreditUser[] users = {};
    CreditProvider[]
}

    class CreditUser {

    String name;
    String surname;
    String sex;
    int age;
    int annualSalary;

        public CreditUser(String name, String surname, String sex, int age, int annualSalary) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.age = age;
            this.annualSalary = annualSalary;

        }
    }
