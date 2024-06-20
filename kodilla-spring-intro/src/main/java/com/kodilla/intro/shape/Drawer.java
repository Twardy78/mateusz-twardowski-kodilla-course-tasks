package com.kodilla.intro.shape;

public class Drawer {

    //public void doDrewing() {
    //Circle circle = new Circle();
    //Triangle triangle = new Triangle();

    //circle.draw();
    //triangle.draw();

    //Polimorfizm dziedziczenie po klasie "Figure"

    //Figure figure;

    //figure = new Circle();
    //figure.draw();

    //figure = new Triangle();
    //figure.draw();

    //Polimorfizm z zastosowaniem inerfajsu "Shape"

    //Shape shape;

    //shape = new Circle();
    //shape.draw();

    //shape = new Triangle();
    //shape.draw();
//}

    // DI - Dependency Injection - wstrzykiwanie zasleżności

    final Shape shape;

    public Drawer(Shape shape) {
        this.shape = shape;
    }

    public String doDrawing(){
        return shape.draw();
    }


}
