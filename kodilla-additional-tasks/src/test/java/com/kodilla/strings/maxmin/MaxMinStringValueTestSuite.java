package com.kodilla.strings.maxmin;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxMinStringValueTestSuite {

    @Test
    public void maxStringValueTest() {
        //Given
        MaxValueFromString maxValueFromString = new MaxValueFromString();
        int[] numbers = {3,-6,23,11,45,66,5,3,21,5,76,5,34,21};

        //When
        int maxNumberResutl = maxValueFromString.maxValueSearch(numbers);

        //Then
        assertEquals(76,maxNumberResutl);
    }

    @Test
    public void minStringValueTest() {
        //Given
        MinValueFromString minValueFromString = new MinValueFromString();
        int[] numbers = {23, -5, 67, -32, 89, 54, -76, 0, 12, -45, 67, -21, 56, 78, -99, 34, -2, 8};

        //When
        int minNumberResutl = minValueFromString.minValueSearch(numbers);

        //Then
        assertEquals(-99,minNumberResutl);
    }

    @Test
    public void maxStringValueTestForEmptyString() {
        //Given
        MaxValueFromString maxValueFromString = new MaxValueFromString();
        int[] numbers = {};

        //When & Then
        assertThrows(IllegalArgumentException.class, () -> maxValueFromString.maxValueSearch(numbers));
    }

    @Test
    public void minStringValueTestForEmptyString() {
        //Given
        MinValueFromString minValueFromString = new MinValueFromString();
        int[] numbers = {};

        //When & Then
        assertThrows(IllegalArgumentException.class, () -> minValueFromString.minValueSearch(numbers));
    }
}
