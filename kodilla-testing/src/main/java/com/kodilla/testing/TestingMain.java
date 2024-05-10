package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator numbers = new Calculator(10,5);

        double addResult = numbers.addAB();
        double substractResult = numbers.substractAB();


        if (addResult == (15)){
            System.out.println("Numbers add test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }
        if (addResult == (10)){
            System.out.println("Numbers add test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }

        if (substractResult == (5)){
            System.out.println("Numbers substract test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }
        if (substractResult == (10)){
            System.out.println("Numbers substract test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }


    }
}