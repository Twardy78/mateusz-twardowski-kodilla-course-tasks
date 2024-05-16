package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private final List<Shape> shapeList = new ArrayList<Shape>();

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }
    public boolean removeFigure(Shape shape) {
        return shapeList.remove(shape);

    }
    public Shape getFigure(int n) {
        if (n<shapeList.size() && n>=0) {
            return shapeList.get(n);
        }else
            return null;
    }

    public void showFigures() {
        System.out.println(shapeList.toString());
    }
}
