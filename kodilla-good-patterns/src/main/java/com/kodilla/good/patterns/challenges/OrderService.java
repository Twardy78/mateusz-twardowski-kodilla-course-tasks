package com.kodilla.good.patterns.challenges;

public class OrderService {
    private boolean invoice;
    private ShipmentMethod shipmentMethod;

    public OrderService(final boolean invoice, final ShipmentMethod shipmentMethod) {
        this.invoice = invoice;
        this.shipmentMethod = shipmentMethod;
    }

    public void createRecorded(final OrderHeader orderHeader, final OrderItems orderItems, final OrderConformation orderConformation) {}

    public void sendOrderInformation(final OrderService orderService,final OrderHeader orderHeader) {}
}
