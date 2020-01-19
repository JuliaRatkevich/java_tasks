package com.julia;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        List<Integer> ints = Arrays.asList(1, 2, 3, 8, 79, 609);

        FileOperations fo = new FileOperations();
        fo.intsToFile(ints, "ints.txt");
        List<Integer> fromFile = fo.fileToInts("ints.txt");
        System.out.println(fromFile);

    }
}
