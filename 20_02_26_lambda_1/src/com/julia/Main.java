package com.julia;

import java.util.*;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> bi = (x, y) -> x * y;

        System.out.println(bi.apply(4, 5));
        System.out.println(bi.apply(6, 7));
        calculate(4, 5);

        BiFunction<Integer,Integer,Integer> bi2 = (x, y) -> {
            Integer result = 1;
            for (Integer i = x; i <= y; i++) {
                result = result * i; //result *= i
            }
            return result;
        };
        System.out.println(bi2.apply(3, 5));


        // Unique strings
        Supplier<String> emptyStringGenerator = String::new;

        Function<List<String>, List<String>> findUniqueStrings = (list) -> {
            Set<String> uniqueStrings = new HashSet<String>();


            for (String str : list) {
                uniqueStrings.add(str);
            }

            return new ArrayList<String>(uniqueStrings);
        };

        List<String> strings = new ArrayList<>();
        strings.add("test");
        strings.add("test2");
        strings.add("test3");
        strings.add("test");
        strings.add("test");
        strings.add("test3");

        List<String> result = findUniqueStrings.apply(strings);
        System.out.println(Arrays.toString(result.toArray()));

        Predicate<Integer> lessThan100 = i -> (i < 100);
        Predicate<Integer> isEven = i -> (i % 2 == 0);
        Predicate<Integer> moreThan50 = i -> (i > 50);

        lessThan100.test(123);

        Boolean less100More50Even = lessThan100
                .and(moreThan50)
                .and(isEven)
                .test(104);

        System.out.println(less100More50Even);
    }


    static Integer calculate(Integer x, Integer y) {
        Integer result = 1;
        for (Integer i = x; i <= y; i++) {
            result = result * i; //result *= i
        }
        return result;
    }
}

