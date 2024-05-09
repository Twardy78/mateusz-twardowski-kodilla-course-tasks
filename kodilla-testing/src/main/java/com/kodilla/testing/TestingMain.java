package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator numbers = new Calculator(25,14);

        double addResult = numbers.addAB();
        double substractResult = numbers.substractAB();

        if (addResult == (numbers.addAB())){
            System.out.println(" Numbers add test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }

        if (substractResult == (numbers.substractAB())){
            System.out.println(" Numbers substract test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }


    }
}