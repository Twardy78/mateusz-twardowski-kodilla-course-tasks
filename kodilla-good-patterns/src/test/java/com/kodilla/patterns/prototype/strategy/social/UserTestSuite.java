package com.kodilla.patterns.prototype.strategy.social;

import com.kodilla.patterns.strategy.social.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {

    @Test
    public void testDefaultShearingStrategies() {
        //Given
        User adam = new YGeneration("Adam Turek");
        User kiff = new Millenials("Kiff Barton");
        User bryan = new ZGeneration("Bryan Routh");
        //When
        String adamShearing = adam.sharePost();
        System.out.println("Adam Shearing: " + adamShearing);
        String kiffShearing = kiff.sharePost();
        System.out.println("Kiff Shearing: " + kiffShearing);
        String bryanShearing = bryan.sharePost();
        System.out.println("Bryan Shearing: " + bryanShearing);
        //Then
        assertEquals("Here will be published on Twitter", adamShearing);
        assertEquals("Here will be published on Facebook", kiffShearing);
        assertEquals("Here will be published on Snapchat", bryanShearing);
    }

    @Test
    public void testIndividualShearingStrategies() {
        //Given
        User kiff = new Millenials("Kiff Barton");
        //When
        String kiffShearing = kiff.sharePost();
        System.out.println("Kiff Shearing: " + kiffShearing);
        kiff.setShearingStrategies(new SnapchatPublisher());
        kiffShearing = kiff.sharePost();
        System.out.println("Kiff Shearing now : " + kiffShearing);
        //Then
        assertEquals("Here will be published on Snapchat", kiffShearing);
    }
}
