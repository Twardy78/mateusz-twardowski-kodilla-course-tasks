package com.kodilla.strings.maxmin;

public class MaxValueFromString {

    public int maxValueSearch(int... numbers) {
        int max = 0;
        for (int number:numbers) {
            if (number > max) {
                max = number;
            }
        }
        return max;
    }
}
