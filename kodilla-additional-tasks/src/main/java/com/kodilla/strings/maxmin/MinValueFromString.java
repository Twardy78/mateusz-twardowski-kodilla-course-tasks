package com.kodilla.strings.maxmin;

public class MinValueFromString {

    public int minValueSearch(int... numbers) {

        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("String cannot be null or empty");
        }

        MaxValueFromString maxValueFromString = new MaxValueFromString();
        int min = maxValueFromString.maxValueSearch(numbers);
        for (int number:numbers) {
            if (number < min) {
                min = number;
            }
        }
        return min;
    }
}
