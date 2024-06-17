package com.kodilla.good.patterns.floor2door;

import java.util.*;

public class Order {

    public List<Item> order() {

        List<Item> items = new ArrayList<>();
        items.add(new Item("Carrot", 3.0 ));
        items.add(new Item("Potato", 5.0 ));
        items.add(new Item("Apple", 7.0 ));
        items.add(new Item("Banana", 2.0 ));
        return items;
    }
    public String toString() {
        return order().toString();
    }
}
