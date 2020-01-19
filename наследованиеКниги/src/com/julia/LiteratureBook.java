package com.julia;


public class LiteratureBook extends Book {


    public LiteratureBook(int id, String title, int price) {
        super(id, title, price);
    }

    @Override
    public int computePrice() {
//        if ( id >= 12) {
//            price = 60;
//        }
//        price = 80;

        return getPrice();
    }

    @Override
    public String describe() {
        String one = "Book about Anna";
        return one;
    }
}
