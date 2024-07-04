package com.kodilla.strings.maxmin;

public class MinValueFromString {

    public int minValueSearch(int... numbers) {
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
