package com.julia;

public class Main {

    public static void main(String[] args) {

        int peterBeer = 4;
        int mashaBeer = peterBeer / 2;
        int consumedBeerByMasha = 0;
        --peterBeer;
        --mashaBeer;
        consumedBeerByMasha++;
        int vasyaBeer = peterBeer + mashaBeer + 1;

        int totalBeer = peterBeer + mashaBeer + vasyaBeer;

        if (totalBeer % 3 == 0 ) {
            System.out.println("Guys will be able to split the beer equally");
        } else {
        System.out.println("Guys can't split the beer equally");
    }

        peterBeer = totalBeer / 3;
        mashaBeer = totalBeer / 3;
        vasyaBeer = totalBeer / 3;

        // after they finish drinking
        peterBeer = 0;
        consumedBeerByMasha += mashaBeer;
        mashaBeer = 0;
        vasyaBeer = 0;

        if (consumedBeerByMasha >= 5) {
            System.out.println("Masha drank at least 5 beers");
        } else {
            System.out.println("Masha did not drink 5 beers");
        }

    }
}




