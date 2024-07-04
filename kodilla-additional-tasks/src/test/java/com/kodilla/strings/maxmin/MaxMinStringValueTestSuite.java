package com.kodilla.strings.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxMinStringValueTestSuite {

    @Test
    public void maxStringValueTest() {
        //Given
        MaxValueFromString maxValueFromString = new MaxValueFromString();
        MinValueFromString minValueFromString = new MinValueFromString();
        int[] numbers = {3,6,23,11,45,66,5,3,21,5,76,5,34,21};

        //When
        int maxNumberResutl = maxValueFromString.maxValueSearch(numbers);
        int minNumberResutl = minValueFromString.minValueSearch(numbers);

        //Then
        assertEquals(76,maxNumberResutl);
        assertEquals(3,minNumberResutl);
    }
}
