package com.kodilla.good.patterns.challenges;

public class OrderHeader {
    final private User user;
    OrderIDGen orderIDGen = new OrderIDGen();

    public OrderHeader(final User user) {
        this.user = user;

    }
    public User getUser() {
        return user;
    }

    public int getOrderIDGen() {
        return orderIDGen.orderIDGenerator();
    }
}
