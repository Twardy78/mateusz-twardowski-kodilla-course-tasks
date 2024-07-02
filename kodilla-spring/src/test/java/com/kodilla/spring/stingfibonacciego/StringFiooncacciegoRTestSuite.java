package com.kodilla.spring.stingfibonacciego;

import com.kodilla.spring.stingfibonacciego.rekurencja.StringFibonacciegoRRules;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringFiooncacciegoRTestSuite {

    @Test
    void testFibonacciegoR() {
        //Given
        StringFibonacciegoRRules strRules = new StringFibonacciegoRRules();
        int n = 9;

        //When
        int result = strRules.fibonacciRRules(n);

        //Then
        assertEquals(34,result);
    }
}
