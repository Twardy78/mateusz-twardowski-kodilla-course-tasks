package com.kodilla.strings.maxmin;

public class MaxValueFromString {

    public int maxValueSearch(int... numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }

        int max = 0;
        for (int number:numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
