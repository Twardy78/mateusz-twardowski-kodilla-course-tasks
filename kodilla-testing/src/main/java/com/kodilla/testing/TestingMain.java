package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

public class TestingMain {
    public static void main(String[] args) {

        Calculator numbers = new Calculator(10,5);

        double addResult = numbers.addAB();
        System.out.println(addResult);
        double substractResult = numbers.substractAB();
        System.out.println(substractResult);


        if (addResult == (15)){
            System.out.println(" Numbers add test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }

        if (substractResult == (5)){
            System.out.println(" Numbers substract test -  OK!!");
        } else {
            System.out.println("Error !!!");
        }


    }
}