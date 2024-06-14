package com.kodilla.good.patterns.factorial;

public class Factorial {

    public static void main(String[] args) {

        FactorialRules factorialRules = new FactorialRules();
        int result = factorialRules.factorial(5);
        System.out.println(result);
    }
}
