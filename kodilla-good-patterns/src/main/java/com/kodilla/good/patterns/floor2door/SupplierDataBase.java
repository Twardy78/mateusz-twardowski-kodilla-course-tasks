package com.kodilla.good.patterns.floor2door;

import java.util.*;

public class SupplierDataBase {

    public List<SupplierInformation> Suppliers() {

        List<SupplierInformation> suppliersList = new ArrayList<>();
        suppliersList.add(new SupplierInformation("ExtraFoodShop", "Katowice ul.Prosta 13"));
        suppliersList.add(new SupplierInformation("HealthyShop", "Rybnik ul.Prusa 4"));
        suppliersList.add(new SupplierInformation("GlutenFreeShop", "Gliwice ul.Polna 65"));
        suppliersList.add(new SupplierInformation("FreshShop", "Knurów ul.Wschodnia 31"));
        return suppliersList;
    }

}
