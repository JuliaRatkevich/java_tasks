package com.julia;

import com.julia.collection.OurHashMap;

import java.awt.*;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        OurHashMap map = new OurHashMap<Integer, String>();
        map.put(1, "1");
        map.put(10001, "10001");
        map.put(20001, "20001");
        map.put(2, "2");

        String valueByKey = (String)map.get(1);
        String valueByKey2 = (String)map.get(2);
        String valueByKeyNull = (String)map.get(123);
        String valueByKeyNull2 = (String)map.get(30001);


        boolean contains = map.contains(20001);
        boolean contains2 = map.contains(2);
        boolean contains3 = map.contains(321);
        boolean contains4 = map.contains(30001);

        boolean remove = map.remove(20001);
        boolean remove2 = map.remove(2);
        boolean remove3 = map.remove(321);
        boolean remove4 = map.remove(20001);
        boolean remove5 = map.remove(30001);
    }
}
