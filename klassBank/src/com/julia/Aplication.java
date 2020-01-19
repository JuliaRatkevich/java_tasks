package com.julia;

public class Aplication {

    public static void main(String[] args) {

        // users
        CreditUser oldPoorGuy = new CreditUser("Old",
                "Poor",
                80,
                10000);
        CreditUser oldRichGuy = new CreditUser("Old",
                "Rich",
                80,
                100000);
        CreditUser youngPoorGuy = new CreditUser("Young",
                "Poor",
                30,
                10000);
        CreditUser youngRichGuy = new CreditUser("Young",
                "Rich",
                30,
                100000);
        CreditUser maturePoorGuy = new CreditUser("Mature",
                "Poor",
                60,
                10000);
        CreditUser matureRichGuy = new CreditUser("Mature",
                "Rich",
                60,
                100000);

        //providers
        CreditProvider vasya = new CreditProvider("Vasily",
                "Telranov",
                true,
                true);
        CreditProvider masha = new CreditProvider("Maria",
                "Telranec",
                false,
                true);
        CreditProvider petya = new CreditProvider("Peter",
                "Unnamed",
                false,
                false);


        CreditUser[] users = new CreditUser[]{oldPoorGuy, oldRichGuy, youngPoorGuy, youngRichGuy, maturePoorGuy, matureRichGuy};
        CreditProvider[] providers = new CreditProvider[]{vasya, masha, petya};


        for (int i = 0; i < providers.length; i++) {
            CreditProvider provider = providers[i];

            for (int j = 0; j < users.length; j++) {
                CreditUser user = users[j];
                System.out.println(provider.name + "'s decision for "
                        + user.name + " "
                        + user.surname + " is " +
                        provider.toProvide(user));
            }
        }

//        ВАРИАНт ЕвГЕНИЯ

//        for (int i = 0; i < providers.length; i++) {
//            System.out.println(providers[i].getName() + " " + providers[i].getSurname() + " works:");
//            for (int j = 0; j < users.length; j++) {
//                System.out.println(providers[i].getName() + "'s decision for "
//                        + users[j].name + " "
//                        + users[j].surname + " is " +
//                        providers[i].toProvide(users[j]));
//            }
//        }

//        System.out.println("Vasya works:");
//        System.out.println(vasya.name + "'s decision for "
//                + youngPoorGuy.name + " "
//                + youngPoorGuy.surname + " is " +
//                vasya.toProvide(youngPoorGuy));
//        System.out.println(vasya.name + "'s decision for "
//                + youngRichGuy.name + " "
//                + youngRichGuy.surname + " is " +
//                vasya.toProvide(youngRichGuy));
//        System.out.println(vasya.name + "'s decision for "
//                + oldPoorGuy.name + " "
//                + oldPoorGuy.surname + " is " +
//                vasya.toProvide(oldPoorGuy));
//        System.out.println(vasya.name + "'s decision for "
//                + oldRichGuy.name + " "
//                + oldRichGuy.surname + " is " +
//                vasya.toProvide(oldRichGuy));
//        System.out.println(vasya.name + "'s decision for "
//                + maturePoorGuy.name + " "
//                + maturePoorGuy.surname + " is " +
//                vasya.toProvide(maturePoorGuy));
//        System.out.println(vasya.name + "'s decision for "
//                + matureRichGuy.name + " "
//                + matureRichGuy.surname + " is " +
//                vasya.toProvide(matureRichGuy));

    }


}
