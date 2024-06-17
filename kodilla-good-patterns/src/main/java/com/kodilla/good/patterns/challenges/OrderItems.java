package com.kodilla.good.patterns.challenges;

import java.util.*;

public class OrderItems {
    final private String item;
    final private int itemQty;
    final private double itemPrice;
    final private List<OrderItems> orderList;

    public OrderItems(final String item,final int itemQty,final double itemPrice) {
        this.item = item;
        this.itemQty = itemQty;
        this.itemPrice = itemPrice;
        this.orderList = new ArrayList<>();
    }

    public void addItem(OrderItems item) {
        orderList.add(item);
    }

    public List<OrderItems> getOrderList() {
        return orderList;
    }
}
