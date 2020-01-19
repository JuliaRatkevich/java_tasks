package com.julia;

public class Main {

    public static void getFirstNumDividedBy_11_13_17 ( int start ) {

            while (true) {
                if (start % 11 == 0 && start % 13 == 0 && start % 17 == 0) {
                    break;
                }
                start++;

            }

     return start;

    }
}



