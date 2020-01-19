package com.julia;

import java.util.Random;

public class MinMaxRule implements RandomRule {

    private int min;
    private int max;
    private Random rnd;

    public MinMaxRule(int min, int max) {
        this.min = min;
        this.max = max;
        rnd = new Random();
    }

    @Override
    public int getRandom() {
        // для nextInt указываем диапазон равный длине отрезка от min до max
        // что-бы включить конец отрезка необходимо добавить к длине 1 т.к. диапазон должен быть от [0...
        // далее необходимо сдвинуть полученное от Random число на min (начало нашего отрезка)
        return min + rnd.nextInt((max - min + 1));
    }
}
