package com.kodilla.good.patterns.challenges;

import org.junit.jupiter.api.Order;

public class Application {

    public static void main(String[] args) {
        OrderInputs orderInputs = new OrderInputs();
        OrderData orderData1 = orderInputs.orderData();
        OrderHeader header1 = orderData1.getOrderHeader();
        OrderItems orderItems1 = orderData1.getOrderItems();
        OrderService orderService1 = orderData1.getOrderService();

        ProductOrderService productOrderService = new ProductOrderService(header1, orderItems1,orderService1);
            productOrderService.orderProcess(orderData1);
    }
}
