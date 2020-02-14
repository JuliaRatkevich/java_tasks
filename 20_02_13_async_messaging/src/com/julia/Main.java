package com.julia;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {


        Tarakan tar1 = new Tarakan(1,30,10,20);
        Tarakan tar2 = new Tarakan(2,30,10,20);
        Tarakan tar3 = new Tarakan(3,30,10,20);
        Thread processor1 = new Thread(tar1);
        Thread processor2 = new Thread(tar2);
        Thread processor3 = new Thread(tar3);


        long currentTime = System.currentTimeMillis();
        processor1.start();
        processor2.start();
        processor3.start();

        processor1.join();
        processor2.join();
        processor3.join();

        long finishTime;
        finishTime = System.currentTimeMillis() - currentTime;
        System.out.println("Time of finish :" + finishTime);



    }


}
