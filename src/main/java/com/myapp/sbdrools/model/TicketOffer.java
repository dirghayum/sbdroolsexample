package com.myapp.sbdrools.model;

public class TicketOffer {

    private int age;
    private int discount=0;
    private int price=25;

    public int getPrice() {
        return price-discount;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
