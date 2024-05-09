package com.kodilla.testing.calculator;

public class Calculator {

    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b =b;
    }

    public double addAB(){
        return a+b;
    }

    public double substractAB(){
        return a-b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
