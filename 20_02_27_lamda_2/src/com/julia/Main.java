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

    }
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
}
