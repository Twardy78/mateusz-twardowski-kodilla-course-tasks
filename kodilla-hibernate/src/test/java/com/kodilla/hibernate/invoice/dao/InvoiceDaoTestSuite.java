package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoTest(){
        //Given
        Item item1 = new Item(new BigDecimal(500.00), 10, new BigDecimal(300.00));
        Item item2 = new Item(new BigDecimal(120.00), 32,new BigDecimal(100.00));
        Item item3 = new Item(new BigDecimal(100.00), 100,new BigDecimal(55.00));
        Item item4 = new Item(new BigDecimal(900.00), 5,new BigDecimal(800.00));
        Item item5 = new Item(new BigDecimal(77.25), 31,new BigDecimal(55.34));
        Item item6 = new Item(new BigDecimal(12.76), 44,new BigDecimal(3.77));
        Item item7 = new Item(new BigDecimal(11.89), 27,new BigDecimal(5.55));
        Item item8 = new Item(new BigDecimal(556.69), 8,new BigDecimal(433.75));

        Invoice invoce1 = new Invoice("543/OLP/2024");
        Invoice invoce2 = new Invoice("984/WUE/2024");
        Invoice invoce3 = new Invoice("702/XRE/2024");

        Product product1 = new Product("Hardware Shop");

        invoce1.getItems().add(item1);
        invoce1.getItems().add(item4);
        invoce1.getItems().add(item6);
        invoce1.getItems().add(item2);
        invoce2.getItems().add(item7);
        invoce2.getItems().add(item1);
        invoce2.getItems().add(item3);
        invoce2.getItems().add(item4);
        invoce2.getItems().add(item8);
        invoce3.getItems().add(item5);
        invoce3.getItems().add(item6);
        invoce3.getItems().add(item7);
        invoce3.getItems().add(item8);

        product1.getItems().add(item1);
        product1.getItems().add(item2);
        product1.getItems().add(item3);
        product1.getItems().add(item4);
        product1.getItems().add(item5);
        product1.getItems().add(item6);
        product1.getItems().add(item7);
        product1.getItems().add(item8);

        item1.setInvoice(invoce1);
        item1.setInvoice(invoce2);
        item2.setInvoice(invoce1);
        item3.setInvoice(invoce2);
        item4.setInvoice(invoce1);
        item4.setInvoice(invoce2);
        item5.setInvoice(invoce3);
        item6.setInvoice(invoce1);
        item6.setInvoice(invoce3);
        item7.setInvoice(invoce2);
        item7.setInvoice(invoce3);
        item8.setInvoice(invoce2);
        item8.setInvoice(invoce3);

        item1.setProduct(product1);
        item2.setProduct(product1);
        item3.setProduct(product1);
        item4.setProduct(product1);
        item5.setProduct(product1);
        item6.setProduct(product1);
        item7.setProduct(product1);
        item8.setProduct(product1);

        //When
        invoiceDao.save(invoce1);
        int invoice1Id = invoce1.getId();
        invoiceDao.save(invoce2);
        int invoice2Id = invoce2.getId();
        invoiceDao.save(invoce3);
        int invoice3Id = invoce3.getId();

        //Then
        assertNotEquals(0, invoice1Id);
        assertNotEquals(0, invoice2Id);
        assertNotEquals(0, invoice3Id);

        //CleanUp
        try {
            invoiceDao.deleteById(invoice1Id);
            invoiceDao.deleteById(invoice2Id);
            invoiceDao.deleteById(invoice3Id);
        }catch (Exception e) {
        }
    }

}
