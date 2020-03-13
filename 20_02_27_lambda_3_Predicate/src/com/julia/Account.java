package com.julia;

public class Account {

    String number;
    long balance;
    Boolean isLocked;

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public Account(String number, long balance, Boolean isLocked) {
        this.number = number;
        this.balance = balance;
        this.isLocked = isLocked;
    }

    @Override
    public String toString() {
        return "<Account " + number + ": balance " + balance + ", isLocked " + isLocked +">";
    }
}
