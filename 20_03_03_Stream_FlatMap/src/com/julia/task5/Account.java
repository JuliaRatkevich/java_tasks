package com.julia.task5;

import java.util.List;

public class Account {
    String number;
    long balance;
    List<Transaction> transactions;

    public boolean isLocked() {
        return isLocked;
    }

    boolean isLocked;

    public Account(String number, long balance, List<Transaction> transactions) {
        this.number = number;
        this.balance = balance;
        this.transactions = transactions;
    }

    public Account(String number, long balance, boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }


    public String getNumber() {
        return number;
    }

    public long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }
}
