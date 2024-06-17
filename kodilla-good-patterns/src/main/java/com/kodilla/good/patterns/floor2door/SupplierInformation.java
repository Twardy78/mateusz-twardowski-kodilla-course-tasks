package com.kodilla.good.patterns.floor2door;

public class SupplierInformation {
    private final String supplierName;
    private final String supplierAddress;

    public SupplierInformation(final String supplierName, final String supplierAddress) {
        this.supplierName = supplierName;
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierName() {
        return supplierName;
    }

}
