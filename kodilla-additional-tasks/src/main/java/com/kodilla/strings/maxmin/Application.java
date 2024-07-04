package com.kodilla.strings.maxmin;

public class Application {
    public static void main(String[] args) {

        MaxValueFromString maxValueFromString = new MaxValueFromString();
        MinValueFromString minValueFromString = new MinValueFromString();
        int[] numbers = {3,1,5,6,7,9,15,3,4,7,10};

        try {
            int maxValue = maxValueFromString.maxValueSearch(numbers);
            System.out.println("Max number is: " + maxValue);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            int minValue = minValueFromString.minValueSearch(numbers);
            System.out.println("Min number is: " + minValue);
        }catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
