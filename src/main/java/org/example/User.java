package org.example;


public class User {

    private String name;
    private int pass;
    private Basket basket;

    public User(String name, int pass) {
        this.name = name;
        this.pass = pass;
        basket = new Basket();
    }

    public String getName() {
        return name;
    }

    public Basket getBasket() {
        return basket;
    }



    @Override
    public String toString() {
        return name +
                ", в его корзине: " + basket;
    }
}
