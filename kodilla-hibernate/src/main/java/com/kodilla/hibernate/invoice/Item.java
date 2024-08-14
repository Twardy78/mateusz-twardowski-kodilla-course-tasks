package com.kodilla.hibernate.invoice;

import jakarta.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEMS")
public class Item {

    private int id;
    private BigDecimal price;
    private int Qty;
    private BigDecimal value;
    private Product product;
    private Invoice invoice;

    public Item() {
    }

    public Item(BigDecimal price, int Qty, BigDecimal value) {
        this.price = price;
        this.Qty = Qty;
        this.value = value;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ITEM_ID")
    public int getId() {
        return id;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "PRODUCT_ID")
    public Product getProduct() {
        return product;
    }
    @NotNull
    @Column(name = "PRODUCT_PRICE")
    public BigDecimal getPrice() {
        return price;
    }
    @NotNull
    @Column(name = "PRODUCT_QTY")
    public int getQty() {
        return Qty;
    }
    @NotNull
    @Column(name = "PRODUCT_VALUE")
    public BigDecimal getValue() {
        return value;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "INVOICE_ID")
    public Invoice getInvoice() {
        return invoice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setQty(int qty) {
        Qty = qty;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }
}
