package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void ArrayOperationsTestSuite() {
        //Given
        int[] numbers1 = {32,35,3,6,57,8,9,43,2,3,4,5,23,3,6,78,6,54,9,54};

        //When
        double result = ArrayOperations.getAverage(numbers1);
        System.out.println("Average: " + result);

        //Then
        assertEquals(9.5, result);
    }

}
