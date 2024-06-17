package com.kodilla.good.patterns.challenges;

public class OrderConformation {

    public boolean isOrdered(final User user,final OrderItems itemList,final boolean paymentStatus) {
        System.out.println("Items : " + itemList.getOrderList() + " been ordered by " + user.getName() + " and payment status : " + paymentStatus);
        return true;
    }
}
