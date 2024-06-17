package com.kodilla.good.patterns.challenges;

public class OrderInputs {

    public OrderData orderData(){
        User user1 = new User("Bully Boy", "Michael", "Smith", "Bully@com.com", 785487896);
        OrderHeader header1 = new OrderHeader(user1);
        ShipmentMethod shipment = new ShipmentMethod("Kurier", "Gliwice 44-100, ul.Zakole 12");
        OrderService orderService1 = new OrderService(true, shipment);
        OrderItems orderItems1 = new OrderItems("Fork", 5, 12.3);
        orderItems1.addItem(new OrderItems("Pensil", 10, 5.55));

        return new OrderData(header1, orderItems1, orderService1);
    }


}
