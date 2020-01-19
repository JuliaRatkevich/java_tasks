package com.julia;

abstract public class Book {

    protected int id;
    protected String title;
    protected int price;

    public Book(int id, String title, int price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    abstract public int computePrice();

    abstract public String describe();


    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }
}
