package com.julia.queue;

public interface Queue<E> {

    void add(E e);

    E release();

    int size();

    int getCapacity();
}