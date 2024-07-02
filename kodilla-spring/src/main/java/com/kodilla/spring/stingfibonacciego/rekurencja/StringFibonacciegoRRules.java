package com.kodilla.spring.stingfibonacciego.rekurencja;

public class StringFibonacciegoRRules {

    public int fibonacciRRules(int n) {
        if (n == 0 || n == 1 || n == 2)
            return n = 1;
        else
            return fibonacciRRules(n - 1) + fibonacciRRules(n - 2);
    }
}
