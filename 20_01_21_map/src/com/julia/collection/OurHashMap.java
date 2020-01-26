package com.julia.collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class OurHashMap<E, T> implements OurMap<E, T> {

    private static int CAPACITY = 10000;
    private List<List<Node<E, T>>> source;
    private int size;

    public OurHashMap(){                      //конструктор
        source = new ArrayList<>(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) {
            source.add(null);
        }
        size = 0;
    }

    @Override
    public void put(E key, T value) {
        int index = indexFrom(key);
        if (source.get(index) == null) {
            List<Node<E, T>> list = new LinkedList<>();
            Node<E, T> newNode = new Node<>(key, value);
            list.add(newNode);
            source.set(index, list);
            size++;
        } else {

            boolean wasFound = false;
            for (Node node : source.get(index)) {
                if (key.equals(node.key)) {
                    wasFound = true;
                    node.value = value;
                    break;
                }
            }

            if (!wasFound) {
                Node<E, T> newNode = new Node<>(key, value);
                source.get(index).add(newNode);
                size++;
            }
        }
    }


    @Override
    public T get(E key) {
        int index = indexFrom(key);

        if (source.get(index) == null) {
            return null;
        }

        for (Node node : source.get(index)) {
            if (key.equals(node.key)) {
                return (T)node.value;
            }
        }
        return null;
    }

    @Override
    public boolean contains(E key) {
        int index = indexFrom(key);

        if (source.get(index) == null) {
            return false;
        }

        for (Node node : source.get(index)) {
            if (key.equals(node.key)) {
                return true;
            }
        }

        return  false;
    }

    @Override
    public boolean remove(E key) {
        int index = indexFrom(key);

        if (source.get(index) == null) {
            return false;
        }

        for (Node node : source.get(index)) {
            if (key.equals(node.key)) {
                source.get(index).remove(node);
                size--;
                return true;
            }
        }

        return  false;
    }

    @Override
    public int size() {
        return size;
    }

    private int indexFrom(E key) {
        return Math.abs(key.hashCode() % CAPACITY);
    }

    private static class Node<E, T> {
        public Node(E key, T value) {
            this.key = key;
            this.value = value;
        }

        E key;
        T value;
    }
}
