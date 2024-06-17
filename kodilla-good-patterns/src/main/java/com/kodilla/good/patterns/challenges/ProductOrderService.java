package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    private OrderHeader orderHeader;
    private OrderItems orderItems;
    private OrderService orderService;
    private OrderConformation orderConformation;

    public ProductOrderService(OrderHeader orderHeader, OrderItems orderItems, OrderService orderService) {
        this.orderHeader = orderHeader;
        this.orderItems = orderItems;
        this.orderService = orderService;
        this.orderConformation = new OrderConformation();
    }

    public OrderDto orderProcess(final OrderData orderData1 ) {
        boolean ordered = orderConformation.isOrdered(orderData1.getOrderHeader().getUser(), orderData1.getOrderItems(), true);
        if (ordered) {
            orderService.createRecorded(orderData1.getOrderHeader(),orderData1.getOrderItems(),orderConformation);
            orderService.sendOrderInformation(orderData1.getOrderService(), orderData1.getOrderHeader());
            return new OrderDto(orderData1.getOrderHeader().getUser(), orderData1.getOrderHeader().getOrderIDGen(), true);
        }
        return new OrderDto(orderData1.getOrderHeader().getUser(), orderData1.getOrderHeader().getOrderIDGen(), false);
    }
}
