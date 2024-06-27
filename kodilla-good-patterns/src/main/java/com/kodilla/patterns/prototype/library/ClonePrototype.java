package com.kodilla.patterns.prototype.library;

public class ClonePrototype<O> implements Cloneable {

    @Override
    public O clone() throws CloneNotSupportedException {
        return (O) super.clone();
    }
}
