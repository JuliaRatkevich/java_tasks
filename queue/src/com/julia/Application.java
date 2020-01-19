package com.julia;

public class Application {

    public static void main(String[] args) {

        QueueGame game = new QueueGame(200, 63, 1000);

        game.play();
        System.out.println(game.winner());//adder or remover
        System.out.println(game.getNumOverflow());
        System.out.println(game.getNumEmpty());
    }
}