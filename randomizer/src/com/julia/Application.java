package com.julia;

public class Application {

    public static void main(String[] args) {
        MinMaxRule minMaxRule = new MinMaxRule(90, 100000000);
        Randomizer randomizer = new Randomizer(minMaxRule);

        System.out.println(randomizer.next());
    }
}
