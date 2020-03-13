package com.julia;
import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        task1();
        System.out.print(task2("09.01.1991"));
//        Scanner in = new Scanner(System.in);
//
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//        LocalDate birthDate = LocalDate.parse(in.next(), formatter);
//
//
//        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
//        String usBirthdate = birthDate.format(usFormatter);
//        System.out.println(usBirthdate);
        LocalTime startTime = LocalTime.of(10, 00);
        LocalTime time = LocalTime.now() ;

    }


    public static void task1() {
        LocalDate bd = LocalDate.of(1991,1,9);

        //1. вывести в какой день недели родился
        DateTimeFormatter dayFormatter = DateTimeFormatter.ofPattern("EEEE");
        String day = bd.format(dayFormatter);
        System.out.println("Day of the week: " + day);

        // 2. в какой день года
        DateTimeFormatter yearDayFormatter = DateTimeFormatter.ofPattern("D");
        String yearDay = bd.format(yearDayFormatter);
        System.out.println("Day of the year: " + yearDay);
    }

    public static String task2(String myHB) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(myHB, formatter);

        DateTimeFormatter usFormatter = DateTimeFormatter.ofPattern("MM.dd.yyyy");
        String usBirthdate = birthDate.format(usFormatter);
        return usBirthdate;
    }


}
