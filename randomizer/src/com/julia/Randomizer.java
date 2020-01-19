package com.julia;

public class Randomizer {

    private RandomRule randomRule;

    public Randomizer(RandomRule rule) {
        randomRule = rule;
    }

    int next() {
        return randomRule.getRandom();
    }
}