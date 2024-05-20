package com.kodilla.testing.shape;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestingSuite {

    @Nested
    class ActionsWithFigures {

        @DisplayName("Test adding figure")
        @Test
        void testAddFigure() {
            //Given
            ShapeCollector shapeC = new ShapeCollector();
            Shape shape = new Square(6);
            //When
            shapeC.addFigure(shape);
            //Then
            Assertions.assertEquals(1, shapeC.getShapeList().size());
        }

        @DisplayName("Test removing figure")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeC = new ShapeCollector();
            Shape shape = new Square(6);
            shapeC.addFigure(shape);
            //When
            boolean result = shapeC.removeFigure(shape);
            //Then
            Assertions.assertTrue(result);
            Assertions.assertEquals(0, shapeC.getShapeList().size());
        }
    }
    @Nested
    class ShowingFigures {

        @DisplayName("Test getting figure")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeC = new ShapeCollector();
            Shape shape = new Triangle(7, 5);
            shapeC.addFigure(shape);
            //When
            Shape getFigureResult = shapeC.getFigure(0);
            //Then
            Assertions.assertEquals(shape, getFigureResult);
        }

        @DisplayName("Test showing figure")
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeC = new ShapeCollector();
            Shape shape = new Circle(9);
            shapeC.addFigure(shape);
            ArrayList<Shape> shapeDummyList = new ArrayList<>();
            shapeDummyList.add(shape);
            //When
            List<Shape> mainShapeList = shapeC.getShapeList();
            //Then
            Assertions.assertEquals(shapeDummyList.toString(), mainShapeList.toString());
        }
    }
}
