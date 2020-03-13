package com.julia;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 6, 9);
        Double median = (Double) integers.stream().collect(new MedianElementCollector());
        System.out.println(median);
    }

}
