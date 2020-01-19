package com.julia;

public class TechBooks extends Book {

    private String science;


    public TechBooks(int id, String title, int price, String science) {
        super(id, title, price);
    }

    @Override
    public int computePrice() {

//        if ( id < 12) {
//            price = 30;
//        }
//        price = 40;

        return  getPrice();
    }

    @Override
    public String describe() {
        String one = "Book about Java";
        return one;
    }
}
