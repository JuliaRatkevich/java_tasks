package com.julia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        accounts.add(new Account("1", 10, false));
        accounts.add(new Account("2", -12, false));
        accounts.add(new Account("3", 42, true));
        accounts.add(new Account("4", -65, true));
        accounts.add(new Account("5", 21300000, false));

        Predicate<Account> balancePositive = account -> (account.balance > 0);
        Predicate<Account> notLocked = account -> (account.isLocked == false);
        Predicate<Account> balancePositiveAndNotLocked = balancePositive.and(notLocked);   //

        List<Account> positiveBalanceAccounts = AccFilter.filter(accounts, balancePositive);
        System.out.println(Arrays.toString(positiveBalanceAccounts.toArray()));

        List<Account> balancePositiveAndNotLockedAccounts = AccFilter.filter(accounts, balancePositiveAndNotLocked);
        System.out.println(Arrays.toString(balancePositiveAndNotLockedAccounts.toArray()));


    }
}
