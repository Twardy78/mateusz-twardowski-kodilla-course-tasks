package com.kodilla.good.patterns.floor2door;

public class Application {

    public static void main(String[] args) {
        Supplier1 s1 = new Supplier1();
        Supplier2 s2 = new Supplier2();
        Supplier3 s3 = new Supplier3();
        Supplier4 s4 = new Supplier4();
        SupplierDataBase sdb = new SupplierDataBase();
        Order order = new Order();

        s1.process(order,sdb.Suppliers().get(0));
        s2.process(order,sdb.Suppliers().get(1));
        s3.process(order,sdb.Suppliers().get(2));
        s4.process(order,sdb.Suppliers().get(3));
    }
}
