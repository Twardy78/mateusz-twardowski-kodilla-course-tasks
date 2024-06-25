package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    @Test
    public void testLogger() {
        //Given
        Logger logger = Logger.LOG;
        //When
        logger.log("GRUBAS123");
        String firstLog = logger.getLastLog();
        logger.log("SZYSZKA999");
        String secondLog = logger.getLastLog();
        //Then
        assertEquals("GRUBAS123", firstLog);
        assertEquals("SZYSZKA999", secondLog);
    }

}
