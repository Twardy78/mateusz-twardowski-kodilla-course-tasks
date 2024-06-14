package com.kodilla.good.patterns.factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTestSuite {

    @Test
    void factorialTest() {
        //Given
        FactorialRules factorialRules = new FactorialRules();
        //When
        int result = factorialRules.factorial(5);
        //Then
        assertEquals(120, result);
    }
}
