package com.kodilla.patterns.bulider.pizza;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PizzaTestSuite {

    @Test
    public void testNewPizza() {
        //Given
        Pizza pizza = new Pizza.PizzaBuilder()
                .ingredient("Onion")
                        .bottom("Thin")
                                .sauce("Spicy")
                                        .ingredient("Mushrooms")
                                                .ingredient("Ham")
                                                        .build();

        System.out.println(pizza);
        //When
        int howManyIngredient = pizza.getIngredient().size();
        //Then
        assertEquals(3, howManyIngredient);
    }
}
