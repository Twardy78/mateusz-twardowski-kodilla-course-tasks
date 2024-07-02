package com.kodilla.patterns.bulider.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    public void testBigmac() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBulider()
                .bun("with sesame")
                .sauce("Soft")
                .ingredient("Onion")
                .ingredient("Cucumber")
                .ingredient("Bacon")
                .burgers(3)
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        assertEquals(3, howManyIngredients);
        assertEquals("with sesame", bigmac.getBun());
        assertEquals("Soft", bigmac.getSauce());

    }
}
