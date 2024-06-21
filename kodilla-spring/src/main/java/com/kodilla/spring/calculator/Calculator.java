package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public void add(double a, double b) {
        double result = a + b;
        display.display(result);
    }

    public void sub(double a, double b) {
        double result = a - b;
        display.display(result);
    }

    public void mui(double a, double b) {
        double result = a * b;
        display.display(result);
    }

    public void div(double a, double b) {
        double result = a / b;
        display.display(result);
    }
}


