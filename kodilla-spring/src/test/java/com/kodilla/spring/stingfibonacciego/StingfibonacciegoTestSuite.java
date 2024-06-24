package com.kodilla.spring.stingfibonacciego;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StingfibonacciegoTestSuite {

    @Test
    public void testStringFibonacciego() {
        //Given
        StringRules stringRules = new StringRules();
        //When
        int result = stringRules.stringFibonacciego(20);
        //Then
        assertEquals(4181, result);


    }
}
