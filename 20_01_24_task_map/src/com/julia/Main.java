package com.julia;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(3);
        list.add(4);
        list.add(2);
        list.add(2);


        int q = returnRepeatedNumbers(list);
        System.out.println(q);

        int withoutAPair = returnNumberWithoutAPair(list);
        System.out.println(withoutAPair);

        int withoutAPair2 = returnNumberWithoutAPair2(list);
        System.out.println(withoutAPair2);

    }


    Map<Integer, Integer> map = new HashMap<>();


    public static int returnRepeatedNumbers(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();

        for (Integer num : list) {
            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num,++value);

            } else {
                map.put(num, 1);

            }
        }
        int res = 0;
        for (int num : map.keySet()) {
            if (map.get(num) > 1)
                res++;
        }

        return res;
    }

    public static int returnNumberWithoutAPair(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            if (map.containsKey(num)) {
                int value = map.get(num);
                map.put(num,++value);

            } else {
                map.put(num, 1);

            }
        }

        for (int num : map.keySet()) {
            if (map.get(num) % 2 == 1) {
                return num;
            }
        }

        return 0;
    }

    //1 1 1 2 2 3 3 4 4  1.
    public static int returnNumberWithoutAPair2(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer num : list) {
            if (map.containsKey(num)) {
                map.remove(num);
            } else {
                map.put(num, 1);
            }
        }

        for (int num : map.keySet()) {
                return num;
        }

        return 0;
    }
}