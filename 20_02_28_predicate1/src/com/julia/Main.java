package com.julia;


public class Main {

    public static void main(String[] args) {

        MyPredicate<Integer> pred = (a,b,c) -> {
            return  a != b && b != c;
        };

        boolean result = pred.test(1,2,3);
        boolean result1 = pred.test(1,2,2);
        boolean result2 = pred.test(2,2,2);

    }
}

interface MyPredicate<T> {
    boolean test(T num1, T num2, T num3);
}
