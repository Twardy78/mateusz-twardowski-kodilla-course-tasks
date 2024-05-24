package com.kodilla.testing.shape;

public class Square implements Shape {

    double sideLenght;

    public Square(double sideLenght) {
        this.sideLenght = sideLenght;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return sideLenght * sideLenght;
    }
}
