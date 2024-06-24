package com.kodilla.spring.stingfibonacciego;

public class StringRules {
    private int sum;
    private int numberA = 0;
    private int numberB = 1;

    public int stringFibonacciego(int n) {
            for(int i = 1; i <= (n-2); i++) {
                sum = numberA + numberB;
                numberA = numberB;
                numberB = sum;
            }
    return sum;
    }
}


