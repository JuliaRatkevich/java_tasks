package com.julia;
import com.julia.queue.*;
import java.util.Random;

public class QueueGame {

    private int capacity;
    private Queue<String> queue;
    private int probAdd;  //вероятность добавления
    private int nMoves;   //кол-во действий
    private Random random = new Random();

    public QueueGame(int capacity, int probAdd, int nMoves) {
        this.capacity = capacity;
        queue = new ArrayQueue<>(capacity);
        this.probAdd = probAdd;
        this.nMoves = nMoves;
    }

    private int numOverflow;
    private int numEmpty;


    public void play() {
        for (int i = 0; i < nMoves; i++) {
            if (random.nextInt(101) <= probAdd) { //random 0-100
                try {
                    queue.add("won");
                } catch (FullQueueException ex) {
                    numOverflow++;
                }
            } else {
                try {
                    queue.release();
                } catch (NoElementsException ex) {
                    numEmpty++;
                }
            }
        }
    }

    public String winner() {
        int size = queue.size();
        if (size > 0) {
            return "adder";
        } else {
            return "remover";
        }
    }

    public int getNumOverflow() {
        return numOverflow;
    }

    public int getNumEmpty() {
        return numEmpty;
    }
}
