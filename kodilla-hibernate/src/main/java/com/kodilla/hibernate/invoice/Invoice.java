package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.*;

@Entity
@Table(name = "INVOICES")
public class Invoice {

    private int id;
    private String number;
    private List<Item> items = new ArrayList<>();

    public Invoice() {}

    public Invoice(String number) {
        this.number = number;
    }
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "INVOICE_ID")
    public int getId() {
        return id;
    }
    @NotNull
    @Column(name = "INVOICE_NUMBER")
    public String getNumber() {
        return number;
    }
    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "invoice",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    public List<Item> getItems() {
        return items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}

