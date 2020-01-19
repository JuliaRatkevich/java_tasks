package com.julia;

//я хочу купить машину за 5000.У меня есть 200.Каждый месяц я откладываю по 100.Дима не хочет участвовать.но когда я накопила 3000
// он каждый месяц добавляет по 300.Через сколько месяцев у меня будет машина?


public class Main {

    public static void main(String[] args) {

        int dreamCar = 5000;
        int juliaCash = 200;
        int juliaStorage = 100;
        int bigStorage = 3000;
        int niceDima = 300;

        int timehalf1 = (bigStorage - juliaCash) / juliaStorage;
        int timehalf2 = (dreamCar - bigStorage) / (juliaStorage + niceDima);
        double totaltime = timehalf1 + timehalf2;
        System.out.println("Number of months to buy a car = " + totaltime);




    }

}
