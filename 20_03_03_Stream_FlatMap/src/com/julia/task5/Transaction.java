package com.julia.task5;

import java.time.LocalDateTime;

public class Transaction {
    String uuid;
    TransactionState transactionState;
    long sum;
    LocalDateTime created;

    public Transaction(String uuid, TransactionState transactionState, long sum, LocalDateTime created) {
        this.uuid = uuid;
        this.transactionState = transactionState;
        this.sum = sum;
        this.created = created;
    }

    public String getUuid() {
        return uuid;
    }

    public TransactionState getTransactionState() {
        return transactionState;
    }

    public long getSum() {
        return sum;
    }

    public LocalDateTime getCreated() {
        return created;
    }
}