package com.julia;

public class BestSeller extends LiteratureBook {

    private int coef;

    public BestSeller(int id, String title, int price, int coef) {
        super(id, title, price);
        this.coef = coef;

    }

//    public int getPrice() {
//        return price * coef;
//    }

//    public int getCoef() {
//        return coef;
//    }

    @Override
    public int computePrice() {
        return super.computePrice() * coef;
    }
}
