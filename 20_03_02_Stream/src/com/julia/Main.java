package com.julia;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Vas");
        strings.add("Petya");

        Stream<String> stream = trickyFilter(strings);
        strings.add("Mash");

        System.out.println(stream.reduce(String::concat).orElse(""));

        String text = "I go to vam pam school the breakfast was pam I was at pam school vam pam";
        List<String> dictionary = Arrays.asList( "pam", "vam");

        List<String> badWords = censor(text, dictionary);
        System.out.println(badWords);

        List<String> test = Arrays.asList("adfasdfasdf", "qweqweqwe");
        String result = collectString(test);
        System.out.println(result);

//        IntStream.generate(() -> 100)
//                .limit(10)
//                .forEach(nbr -> System.out.println(nbr));
    }

    //Есть лист int.Найти максимальный элемент из тех чисел которые делятс яна 3
    public static int filter(List<Integer> list) {
        return list.stream().filter(val -> val % 3 == 0).max(Integer::compareTo).get();  //((val1, val2) ->val1.compareTo(val2);
    }

    public static int filter(int[] array) {
        return Arrays.stream(array).filter(val -> val % 3 == 0).max().orElseGet(() -> 0);
    }

    // Есть илст строк.Надо составить строку которая состоит из всех строк короче 4символов в апперкейс
    // каждое слово должно быть один  раз
    public static String collectString(List<String> strings) {
        return strings
                .stream()     //
                .filter(str->str.length() < 5)
                .map(s -> s.toUpperCase())  //.map(String::toUpperCase) метод референс трансформация
                .distinct()
                .reduce((s, s2) -> s.concat(s2)) //reduce((s, s2) -> s + s2);
                .orElse("");
    }

    public static Stream<String> trickyFilter(Collection<String> strings) {
        return strings
                .stream()
                .filter(str -> str.length() < 5)
                .map(String::toUpperCase)
                .distinct();
    }

    public static IntStream toLengthsStream(Collection<String> strings) {
        return strings
                .stream()
                .mapToInt(value -> value.length());
    }

    public static List<String> censor(String text, List<String> dictionary) {
        String[] textStrings = text.split(" ");
        return Arrays
                .stream(textStrings)
                .distinct()           //стрим из неповторяющихся
                .filter(str -> dictionary.contains(str))
//                .filter(dictionary::contains)
                .sorted()
                .collect(Collectors.toList());
    }
}
