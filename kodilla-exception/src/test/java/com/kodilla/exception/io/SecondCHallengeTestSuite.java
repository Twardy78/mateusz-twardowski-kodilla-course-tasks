package com.kodilla.exception.io;

import static org.junit.jupiter.api.Assertions.*;

import com.kodilla.exception.test.ExceptionHandling;
import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

public class SecondCHallengeTestSuite {

    @Test
    void testSecondChance() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When & Then
        assertThrows(ExceptionHandling.class, () -> secondChallenge.probablyIWillThrowException(2.5,4.0));


    }
}
