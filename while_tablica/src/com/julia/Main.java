package com.julia;

public class Main {

    public static void main(String[] args) {

        int line = 1;
        int column = 1;

        while (line <= 10) {
            column = 1;

            while (column <= 10) {
               System.out.print(line * column + "\t");
                column++;
            }

            line++;
            System.out.println();
        }
    }
}
