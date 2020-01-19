package com.julia;

//public class Main {
//
//    public static void main(String[] args) {
//        int summa = 0;
//        for (int number = 1; number < 88; number++) {
//            summa += number;
//        }
//        System.out.println(summa);
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        for (int number = 100; number > 9; number -= 10) {
//            System.out.println(number);
//        }
//    }
//}

//public class Main {
//
//public static void main(String[] args) {
//        for (int number = 1; number < 10; number++) {
//        int number1 = 4;
//        System.out.println( number + "x" + number1 + "=" + number * number1 );
//          }
//        }
//      }

//public class Main {
//
//    public static void main(String[] args) {
//        for (int line = 1; line <= 10; line++) {
//            for (int column = 1; column <= 10; column++) {
//                System.out.print(column * line + "\t");
//            }
//            System.out.println();
//        }
//    }
//}

//public class Main {
//
//    public static void main(String[] args) {
//        int summa = 0;
//        for (int number = 5; number < 86; number += 3) {
//           summa += number;
//        }
//        System.out.println(summa);
//    }
//}

public class Main {

    public static void main(String[] args) {
        for (int number = 1; number <= 1000; number++) {
            if (number%13 == 0  || number%7 == 0 || number%5 == 0) {
                System.out.println(number);
            }
        }
    }
}
