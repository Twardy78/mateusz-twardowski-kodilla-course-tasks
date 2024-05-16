package com.kodilla.testing.shape;

public class Triangle implements Shape {

    double hight;
    double bottomSideLenght;

    public Triangle(double hight, double bottomSideLenght) {
        this.hight = hight;
        this.bottomSideLenght = bottomSideLenght;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }
    @Override
    public double getField() {
        return (hight + bottomSideLenght)/2;
    }
}
