package com.kodilla.spring.calculator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
        calculator.add(a,b);
        //Then

    }

    @Test
    void testSubtractAToB() {
        //Given
        //When
        calculator.sub(a,b);
        //Then
    }

    @Test
    void testMultiplyAToB() {
        //Given
        //When
        calculator.mui(a,b);
        //Then
    }

    @Test
    void testDivideAToB() {
        //Givem
        //When
        calculator.div(a,b);
        //Then
    }
}
