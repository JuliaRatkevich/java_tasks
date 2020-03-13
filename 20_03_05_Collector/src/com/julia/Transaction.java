package com.julia;

import java.time.LocalDateTime;

public class Transaction {
    String uuid;
    long sum;
    Integer accountId;

    public Transaction(String uuid, long sum, Integer accountId) {
        this.uuid = uuid;
        this.sum = sum;
        this.accountId = accountId;
    }

    public String getUuid() {
        return uuid;
    }

    public long getSum() {
        return sum;
    }

    public Integer getAccountId() {
        return accountId;
    }
}