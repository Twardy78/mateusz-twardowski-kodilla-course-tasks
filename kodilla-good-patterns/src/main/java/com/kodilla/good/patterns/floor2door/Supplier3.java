package com.kodilla.good.patterns.floor2door;

public class Supplier3 implements Suppliers {

    public void process(Order order, SupplierInformation supplierInformation) {
        CommonOrderProcess commonOrderProcess = new CommonOrderProcess();
        commonOrderProcess.main(order, supplierInformation);
    }
}
