package com.kodilla.good.patterns.challenges;

import java.util.*;

public class OrderData {
        private OrderHeader orderHeader;
        private OrderItems orderItems;
        private OrderService orderService;

        public OrderData(final OrderHeader orderHeader,final  OrderItems orderItems,final OrderService orderService) {
            this.orderHeader = orderHeader;
            this.orderItems = orderItems;
            this.orderService = orderService;
        }

    public OrderHeader getOrderHeader() {
        return orderHeader;
    }

    public OrderItems getOrderItems() {
        return orderItems;
    }

    public OrderService getOrderService() {
        return orderService;
    }
}
