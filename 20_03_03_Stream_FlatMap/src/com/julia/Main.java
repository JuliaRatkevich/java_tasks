package com.julia;
import com.julia.task5.Account;
import com.julia.task5.TransactionState;
import com.julia.task5.Transaction;
import com.julia.task6.Department;
import com.julia.task6.Employee;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;


public class Main {

    static long BOUND = 4000000;

    public static void main(String[] args) {

        List<Account> accounts = generateAccounts();
        long result = task5(accounts);
        System.out.println(result);

        List<Department> departments = generateDepartments();
        long count = task6(departments);
        System.out.println(count);
    }
    // является ли число простым(делится только себя без остатка и на 1)
    public static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int)Math.sqrt(n))
                .noneMatch(num->n%num == 0);

    }

    // посчитать факториал
    public static long factorial(int n) {
        return LongStream.rangeClosed(1,n)
                .reduce((currentResult, currentNum) -> currentResult * currentNum)
                .orElse(0);
    }

//Eсть два IntStream.Сделать стрим, который содержит числа из общихкоторые делятся на 3 и на 5.Стрим должен быть
// отсоретрован и два первыйх должны быть пропущены.

    public static IntStream task2(IntStream firstStream, IntStream secondStream) {
        return IntStream.concat(firstStream, secondStream)
                .filter(num-> (num % 3 == 0 & num % 5 == 0))
                .sorted()
                .skip(2);
    }

    //     Посчитать сумму чисел от a до b через 1 (a, a + 1...b-1, b)
    public static long task3(int a, int b){
        return LongStream.rangeClosed(a,b)
                .reduce(0, (result, num) -> result + num);
    }

    //task 5. Посчитать сумму-деньги всех отмененных транзакций для всех пользователей с +аккаунтом.

    public static long task5(List<Account> accounts) {
        return accounts.stream()
                .filter(account -> account.getBalance() > 0) // аккаунты с положительным балансом
                .flatMap(account -> account.getTransactions().stream())
                .filter(transaction -> transaction.getTransactionState() == TransactionState.CANCELLED)
                .map(transaction -> transaction.getSum())
                .reduce((long)0, (totalSum, sum) -> totalSum + sum);
    }

    //    task 6. Посчитать общее ч§§исло раб. чья зп >=порога для всех отделов,которые начинаются с 111
    public static long task6(List<Department> departments) {
        return departments.stream()
                .filter(department -> department.getCode().startsWith("111"))
                .flatMap(department -> department.getEmployeeList().stream())
                .filter(employee -> employee.getSalary() >= BOUND)
                .count();
    }

    //   task 7 Есть коллекция Acc,заблокировать те, на которых слишком большая задолженность
    public static void task7(List<Account> accounts){
        accounts.stream()
                .filter(account -> account.getBalance() < 0)
                .forEach(t -> t.setLocked(true));

    }

    //    task 5
    public static List<Account> generateAccounts() {
        List<Account> accounts = new ArrayList<>();

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("1.1", TransactionState.FINISHED, 10, LocalDateTime.now()));
        transactions.add(new Transaction("1.2", TransactionState.CANCELLED, 20, LocalDateTime.now()));
        transactions.add(new Transaction("1.3", TransactionState.PROCESS, 30, LocalDateTime.now()));
        Account account = new Account("1", 1234, transactions);
        accounts.add(account);

        transactions = new ArrayList<>();
        transactions.add(new Transaction("2.1", TransactionState.CANCELLED, 15, LocalDateTime.now()));
        transactions.add(new Transaction("2.2", TransactionState.FINISHED, 30, LocalDateTime.now()));
        transactions.add(new Transaction("2.3", TransactionState.PROCESS, 45, LocalDateTime.now()));
        account = new Account("2", 4321, transactions);
        accounts.add(account);

        transactions = new ArrayList<>();
        transactions.add(new Transaction("3.1", TransactionState.FINISHED, 1, LocalDateTime.now()));
        transactions.add(new Transaction("3.2", TransactionState.CANCELLED, 2, LocalDateTime.now()));
        transactions.add(new Transaction("3.3", TransactionState.PROCESS, 3, LocalDateTime.now()));
        account = new Account("3", -100, transactions);
        accounts.add(account);

        System.out.println(accounts.size());

        return accounts;
    }

    //    task 6
    public static List<Department> generateDepartments() {
        List<Department> departments = new ArrayList<>();

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Mimi", 2000000));
        employees.add(new Employee("Mimu", 3000000));
        employees.add(new Employee("Kuku", 4000000));
        employees.add(new Employee("Kiki", 5000000));

        Department department = new Department("sales", "111", employees);
        departments.add(department);

        employees = new ArrayList<>();
        employees.add(new Employee("Mimt", 6000000));
        employees.add(new Employee("Miteu", 4000000));
        employees.add(new Employee("Kukugr", 4000000));
        employees.add(new Employee("Kikigrg", 7000000));

        department = new Department("sales1", "1110", employees);
        departments.add(department);


        employees = new ArrayList<>();
        employees.add(new Employee("Lily", 9000000));
        employees.add(new Employee("Niny", 6000000));
        employees.add(new Employee("Gigy", 8000900));
        employees.add(new Employee("Miky", 11000000));

        department = new Department("marketing", "112", employees);
        departments.add(department);

        return departments;
    }

//    task 7
    Account acc1 = new Account("11", -1000000, false);
    Account acc2 = new Account("12", 1000000, false);
    Account acc3 = new Account("13", -1000000, false);
    List<Account> accounts = Arrays.asList(acc1, acc2, acc3);

}