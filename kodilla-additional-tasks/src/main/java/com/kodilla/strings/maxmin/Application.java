package com.kodilla.strings.maxmin;

public class Application {
    public static void main(String[] args) {

        MaxValueFromString maxValueFromString = new MaxValueFromString();
        MinValueFromString minValueFromString = new MinValueFromString();
        int[] numbers = {3,1,5,6,7,9,15,3,4,7,10};

        int maxValue = maxValueFromString.maxValueSearch(numbers);
        System.out.println(maxValue);

        int minValue = minValueFromString.minValueSearch(numbers);
        System.out.println(minValue);
    }
}
