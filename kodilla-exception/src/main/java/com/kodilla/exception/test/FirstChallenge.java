package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) throws ArithmeticException {
        if (b ==0) {
            throw new ArithmeticException("In this particular equals you can't divide by ZERO");
        }
        return a/b;
    }

    public static void main(String[] args) {
        FirstChallenge firstChallenge = new FirstChallenge();
        double result = 0;

        try {
            result = firstChallenge.divide(3.0, 2.0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done");
        }

        System.out.println("Result is : " + result);
    }
}
