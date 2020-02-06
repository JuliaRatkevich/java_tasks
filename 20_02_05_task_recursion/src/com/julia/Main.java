package com.julia;

public class Main {

    public static void main(String[] args) {
        int s = pow(2, 5);
        int s2 = pow(2, 4);
        int s3 = squareRecursion(4);
        System.out.print(s3);
    }


    /// написать метод возведения числа в степень.

    public static int pow(int x, int y) {
        if (y > 1) {
            int res = pow(x, y - 1);
            return x * res;
        }// 1) 2 * pow (2, 3) 2) 2 * pow(2, 2) 3) 2 * pow(2, 1) 4) 2
        else if (y == 1)
            return x;
        else if (y == 0)   //любое число возведенное в 0 степень равно 1
            return 1;
        else
            return 0;
    }

    /// написать метод возведения числа в степень. Евгений

    public static int powerRecursion(int n, int k) {
        if (k == 0)
            return 1;

        return n * powerRecursion(n, k - 1);
    }


    //написать функцию рукурсию которая считает число в квадрате
    public static int squareRecursion(int n) {
        if (n == 0)
            return 0;

        return squareRecursion(n - 1) + n + n - 1;
    }

}
