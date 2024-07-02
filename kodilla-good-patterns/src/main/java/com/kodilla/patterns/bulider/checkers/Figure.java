package com.kodilla.patterns.bulider.checkers;

public class Figure {

    public static final String WHITE = "WHITE";
    public static final String BLACK = "BLACK";
    private String color;

    public Figure(String color) {
        if (color.equals(WHITE) || color.equals(BLACK)) {
            this.color = color;
        }else
            throw new IllegalArgumentException("Color of checkers should be WHITE or BLACK");
    }

    public String getColor() {
        return color;
    }
}

