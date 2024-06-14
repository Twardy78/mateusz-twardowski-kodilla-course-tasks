package com.kodilla.good.patterns.factorial;

public class FactorialRules {

    public int factorial(int n) {
        int number = 1;

        for (int i = 1; i <= n; i++) {
            number = number  * i;
        }
        return number;
    }
}
