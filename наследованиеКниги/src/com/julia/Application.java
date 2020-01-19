package com.julia;

public class Application {

    public static void main(String[] args) {
        Book annaKarenina  = new LiteratureBook(12, "Tolstoi", 33);
        Book harryPotter = new BestSeller(3, "harry", 20, 2 );
        Book oopJava = new TechBooks(2,"OOP",19, "Computer science");

        oopJava.computePrice();
        oopJava.describe();
        annaKarenina.describe();
        harryPotter.computePrice();

        Book[] books = new Book[]{ annaKarenina, harryPotter, oopJava};

    }







}
