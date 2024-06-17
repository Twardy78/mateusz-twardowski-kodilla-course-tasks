package com.kodilla.good.patterns.challenges;

public class OrderDto {
    private User user;
    private boolean ordered;
    private int getOrderIDGen;

    public OrderDto(final User user, final int orderIDGen, final boolean ordered) {
        this.user = user;
        this.ordered = ordered;
    }
}
