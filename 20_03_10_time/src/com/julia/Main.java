package com.julia;
import com.julia.enum1.Calculator;
import com.julia.enum1.Color;
import com.julia.enum1.TransactionState;
import java.time.*;


import static java.time.temporal.ChronoUnit.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(TransactionState.CANCELLED.name());
        System.out.println(TransactionState.CANCELLED.ordinal());
        System.out.println(TransactionState.CANCELLED.toString());

//        Arrays.stream(TransactionState.values()).forEach(System.out::println);

        TransactionState cancelled = TransactionState.valueOf("CANCELLED");
        System.out.println(cancelled);


        System.out.println(Calculator.MUL.action(4, 5));

        System.out.println(Color.BLUE.getCode());



//
        LocalTime startTime = LocalTime.of(10, 00);
        LocalTime time = LocalTime.now();
//        long difference = time.getTime() - startTime.getTime();
        Duration difference1 = Duration.between(time, startTime);
        long diff = time.getMinute() - startTime.getMinute();
        System.out.println(difference1 + " sek");

        long seconds = SECONDS.between(startTime, time);


        System.out.println(ZonedDateTime.now());

//        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTime);

        ZonedDateTime zonedDateTimeWrong = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Moscow"));
        System.out.println(zonedDateTimeWrong);

        ZoneId.getAvailableZoneIds().forEach(System.out::println);

//
        LocalDate today = LocalDate.now();
        ZonedDateTime zonedDateTime1 = ZonedDateTime.of(today,LocalTime.of(8, 00), ZoneId.of("Europe/Moscow"));
        ZonedDateTime zonedDateTime2 = ZonedDateTime.of(today,LocalTime.of(18, 00), ZoneId.of("Asia/Vladivostok"));

        if (zonedDateTime1.isBefore(zonedDateTime2)) {
            System.out.println("true");

        }

//     ZonedDateTime newYork = ZonedDateTime.of(ChronoUnit.HOURS.between(LocalTime.of(9,00),LocalTime.of(18,00)), ZoneId.of("USA/New-York"));
        LocalTime newYorkStart = LocalTime.of(8, 00);
        LocalTime newYorkFinish = LocalTime.of(17, 00);

          Duration workHoursNewYork = Duration.between(newYorkStart, newYorkFinish);

        task_Meeting_time_London();
    }

    public static void task_Meeting_time_London() {
        LocalDate date = LocalDate.now();
        LocalTime startTime = LocalTime.of(9, 00);
        LocalTime endTime = LocalTime.of(18, 00);
        ZonedDateTime saintPetersburgStartTime = ZonedDateTime.of(date, startTime, ZoneId.of("Europe/Moscow"));
        ZonedDateTime saintPetersburgEndTime = ZonedDateTime.of(date, endTime, ZoneId.of("Europe/Moscow"));

        startTime = LocalTime.of(8, 00);
        endTime = LocalTime.of(17, 00);
        ZonedDateTime newYorkStartTime = ZonedDateTime.of(date, startTime, ZoneId.of("America/New_York"));
        ZonedDateTime newYorkEndTime = ZonedDateTime.of(date, endTime, ZoneId.of("America/New_York"));

        ZoneId london = ZoneId.of("Europe/London");
        startTime = LocalTime.of(8, 30);
        endTime = LocalTime.of(17, 00);
        ZonedDateTime londonStartTime = ZonedDateTime.of(date, startTime, london);
        ZonedDateTime londonEndTime = ZonedDateTime.of(date, endTime, london);

        ZonedDateTime convertedSaintPetersburgStartTime = saintPetersburgStartTime.withZoneSameInstant(london);
        ZonedDateTime convertedSaintPetersburgEndTime = saintPetersburgEndTime.withZoneSameInstant(london);

        ZonedDateTime convertedNewYorkStartTime = newYorkStartTime.withZoneSameInstant(london);
        ZonedDateTime convertedNewYorkEndTime = newYorkEndTime.withZoneSameInstant(london);

        int startHour = Math.max(londonStartTime.getHour(), convertedSaintPetersburgStartTime.getHour());
        startHour = Math.max(startHour, convertedNewYorkStartTime.getHour());

        int endHour = Math.min(londonEndTime.getHour(), convertedSaintPetersburgEndTime.getHour());
        endHour = Math.min(endHour, convertedNewYorkEndTime.getHour());

        System.out.println("from " + startHour + " until " + endHour);
    }
}

