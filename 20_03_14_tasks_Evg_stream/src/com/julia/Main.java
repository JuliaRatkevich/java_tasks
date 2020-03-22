package com.julia;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;



public class Main {

    public static void main(String[] args) {
        lovely(1100,1111);

        String text = "Hello world";
        String crop1 = text_crop(text, 2);
        System.out.println(crop1);
        String crop2 = text_crop(text, 10);
        System.out.println(crop2);
    }


//    1.найти все числа <=2 в промежутке a-b

    public static void lovely(int a, int b){
        IntStream.rangeClosed(a, b)
        .filter(Main::isLovely)
        .forEach(num -> System.out.println(num));
    }

    private static boolean isLovely(int a) {
        Long maxOccurrences = String.valueOf(a) //"1100"
                .chars() //IntStream codes of chars "1", "1", "0", "0"
                .boxed() // IntStream -> Stream<Integer>
                .collect(Collectors.groupingBy(digit -> digit, Collectors.counting())) //Map<key "1", value 2>
                .values() //Collection<Long>
                .stream()
                .max(Long::compareTo)
                .orElse(Long.valueOf(0));
        return maxOccurrences <= 2;
    }

//    2. есть текст, в нем встречаются слова и пробелы между ними.
//    написать функцию, которая принимает исходный текст и число k,
//    а возвращает обрезанный текст, так что он содержит <=k символов, но только слова целиком.
//    text = "Hello world"
//crop(text, 2)    ->     ""
//crop(text, 10)     ->     "Hello"


    private static String text_crop(String text, int k) {
        if (text.length() <= k) {
            return text;
        }

        char[] chars = text.toCharArray();
//        if (chars[k] == ' ') {
//            char[] newText = Arrays.copyOfRange(chars, 0, k);
//            return String.valueOf(newText);
////            int[] newTest = IntStream.range(0, k)
////                    .map(i -> chars[i])
////                    .toArray();
//        }

        while (chars[k] != ' ' && k > 0) {
            k--;
        }

        char[] newText = Arrays.copyOfRange(chars, 0, k);
        return String.valueOf(newText);
    }
}
