package com.kodilla.good.patterns.floor2door;

public class Item {
    private final String itemName;
    private final double itemQty;

    public Item(final String itemName,final  double itemQty) {
        this.itemName = itemName;
        this.itemQty = itemQty;
    }
    public String getItemName() {
        return itemName;
    }

    public double getItemQty() {
        return itemQty;
    }

    @Override
    public String toString() {
        return "itemName='" + itemName + '\'' +
                ", itemQty=" + itemQty;
    }
}
