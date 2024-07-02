package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task taskType (final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("Buy vegetables", "Carrots", 2);
            case PAINTING -> new PaintingTask("Repaint", "White", "Front wall");
            case DRIVING -> new DrivingTask("Pickup shopping", "In city center", "By bus");
            default -> null;
        };
    }
}
