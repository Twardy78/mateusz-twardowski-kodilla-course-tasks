package com.kodilla.good.patterns.floor2door;

public class CommonOrderProcess {

    public void main(Order order, SupplierInformation supplierInformation) {
        OrderConformation orderConformation = new OrderConformation();
        boolean isOrdered = orderConformation.orderConformation();
        if (isOrdered) {
            System.out.println("Order Confirmation form " + supplierInformation.getSupplierName() + " was Successful");
            System.out.println(order.toString());
        }else
            System.out.println("Order Conformation Unsuccessful");
    }
}
