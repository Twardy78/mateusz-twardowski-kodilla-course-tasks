package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CalculatorTestSuit {
    double a = 2;
    double b = 4;

    @Autowired
    Calculator calculator;

    @Test
    void testAddAToB() {
        //Given
        //When
        double result = calculator.add(a,b);
        //Then
        assertEquals(6.0, result);

    }

    @Test
    void testSubtractAFromB() {
        //Given
        //When
        double result = calculator.sub(a,b);
        //Then
        assertEquals(-2.0, result);
    }

    @Test
    void testMultiplyAAndB() {
        //Given
        //When
        double result = calculator.mui(a,b);
        //Then
        assertEquals(8.0, result);
    }

    @Test
    void testDivideAByB() {
        //Given
        //When
        double result = calculator.div(a,b);
        //Then
        assertEquals(0.5, result);
    }
}
