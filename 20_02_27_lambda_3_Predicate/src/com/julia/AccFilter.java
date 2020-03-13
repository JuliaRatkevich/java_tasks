package com.julia;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class AccFilter {

    static public List<Account> filter(List<Account> accounts, Predicate<Account> predicate) {
        List<Account> result = new ArrayList<>();

        for (Account account : accounts) {

            if (predicate.test(account)) {   //условие которое должно выполняться
                result.add(account);

            }
        }
        return result;
    }
}

