package com.julia;

public class Main {

    public static void main(String[] args) {
        float fltMariaHasApples = 1.0f/3.0f;
        float fltPetroHasApples = fltMariaHasApples / 2.0f;
        float fltWasjaHasApples = 4.0f * (fltMariaHasApples + fltPetroHasApples);
        intAllAmountOfApples = (int) (fltMariaHasApples + fltPetroHasApples + fltWasjaHasApples);

        System.out.println("");
        System.out.println("Float data type:");
        System.out.println("Maria has apples = " + dblMariaHasApples);
        System.out.println("Petro has apples = " + dblPetroHasApples);
        System.out.println("Wasja has apples = " + dblWasjaHasApples);
        System.out.println("Amount of whole apples = " + intAllAmountOfApples);
    }
}
