package com.julia;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.util.stream.Collectors.*;



public class Main {

    public static void main(String[] args) {
        List<Transaction> transactions = generateTransactions();

        Map<Integer, Long> result = task3(transactions);

        for (Map.Entry<Integer, Long> entry : result.entrySet()) {
            System.out.println("Account " + entry.getKey() + ": " + entry.getValue());
        }

        List<LogEntry> entries = generateLogEntries();
        Map<String, Long> visits = task4(entries);
        for (Map.Entry<String, Long> entry : visits.entrySet()) {
            System.out.println("URL " + entry.getKey() + " visited " + entry.getValue());
        }

        Map<String, Long> uniqueVisits = task5(entries);
        for (Map.Entry<String, Long> entry : uniqueVisits.entrySet()) {
            System.out.println("URL " + entry.getKey() + " visited by " + entry.getValue() + " users");
        }
    }

    // task💩Написать коллектор, который считает сумму квадратов из streaam
    private static long task1(Stream<Integer> stream) {
        return stream.collect(summingLong(x -> x * x));
    }

    // task💩💩Написать коллектор, который будет разделятьStream<String> на полиндром и все остальное
    private static void task2(Stream<String> stream) {
        Map<Boolean, List<String>> result = stream
                .collect(partitioningBy(s -> isPalindrome(s)));
    }

    // task💩💩💩Постчитать сумму транзакций для каждого
    private static Map<Integer, Long> task3(List<Transaction> transactions) {
        return transactions.stream()
                .collect(groupingBy(Transaction::getAccountId, summingLong(x -> x.getSum())));
    }

    private static List<Transaction> generateTransactions() {
        List<Transaction> transactions = new ArrayList<>();
        Random rand = new Random(42);
        for (int i = 0; i < 10; i++) {
            int accountId = rand.nextInt(3) + 1;
            int sum = rand.nextInt(999) + 1;
            Transaction transaction = new Transaction("1", sum, accountId);
            transactions.add(transaction);
        }

        return transactions;
    }

    private static boolean isPalindrome(String s) {
        int n = s.length();
        for (int i = 0; i < (n/2); ++i) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                return false;
            }
        }
        return true;
    }

    //    task💩💩💩💩 a.вывести сколько раз был посещен каждый url/ b. сколько пользователей поетило каждый url
    private static Map<String, Long> task4(List<LogEntry> logEntries){
        return logEntries.stream()
                .collect(groupingBy(LogEntry::getUrl, counting()));
    }

    //  task💩💩💩💩💩 cколько пользователей посетило каждый url
    private static Map<String, Long> task5(List<LogEntry> logEntries){
        return logEntries.stream()
                .collect(groupingBy(LogEntry::getUrl, collectingAndThen(toList(),
                        list -> list.stream()
                                .map(entry -> entry.login)
                                .distinct()
                                .count())));
    }

    private static List<LogEntry> generateLogEntries() {
        List<LogEntry> entries = new ArrayList<>();

        LogEntry logEntry = new LogEntry("test", "google.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test1", "google.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "bbc.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "google.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test2", "google.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        logEntry = new LogEntry("test", "facebook.com");
        entries.add(logEntry);

        return entries;
    }

}
