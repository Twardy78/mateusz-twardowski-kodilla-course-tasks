package com.kodilla.testing.collection;


import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;


public class CollectionTestSuite {

    private static OddNUmbersExterminator oddNumbersExterminator;

    @BeforeEach
    public void beforeEach() {
        oddNumbersExterminator = new OddNUmbersExterminator();
        System.out.println("Test begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test end");
    }

    @DisplayName(
            "Checking if list is empty"
    )

    @Test
    void testOddNumbersExterminatorEmptyList() {
        ArrayList<Integer> emptyList = new ArrayList<>();
        //When
        List<Integer> resultList = oddNumbersExterminator.exterminate(emptyList);
        System.out.println("Testing empty list");
        //Then
        Assertions.assertEquals(emptyList, resultList);

    }

    @DisplayName(
            "Testing if list content odd numbers"
    )

    @Test
    void testOddNumbersExtreminstorNormalList() {
        //Given
        ArrayList<Integer> normalList = new ArrayList<>();
        normalList.add(12);
        normalList.add(2);
        normalList.add(3);
        normalList.add(4);
        normalList.add(56);
        normalList.add(6);
        normalList.add(7);
        normalList.add(88);
        normalList.add(9);
        normalList.add(10);

        ArrayList<Integer> expectedOddList = new ArrayList<>();
        expectedOddList.add(12);
        expectedOddList.add(2);
        expectedOddList.add(4);
        expectedOddList.add(56);
        expectedOddList.add(6);
        expectedOddList.add(88);
        expectedOddList.add(10);

        //When
        List<Integer> resultNormalList = oddNumbersExterminator.exterminate(normalList);
        System.out.println("Testing normal list");
        //Then
        Assertions.assertEquals(expectedOddList, resultNormalList);
    }
}

