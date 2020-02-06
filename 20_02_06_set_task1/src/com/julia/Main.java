package com.julia;

import com.julia.collection.OurHashSet;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        OurHashSet<Integer>  nn= new OurHashSet();
        nn.add(1);
        nn.add(2);
        boolean contains = nn.contains(2);
        System.out.print(contains);
    }
}
