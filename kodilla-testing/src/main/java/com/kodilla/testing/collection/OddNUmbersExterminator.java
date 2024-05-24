package com.kodilla.testing.collection;

import java.util.*;

public class OddNUmbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> oddNumbersList = new ArrayList<Integer>();

        for (int number : numbers) {
            if (number % 2 == 0) {
                oddNumbersList.add(number);
            }
        }
        return oddNumbersList;
    }
}
