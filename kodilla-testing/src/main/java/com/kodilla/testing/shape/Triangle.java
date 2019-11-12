package com.kodilla.testing.shape;

public class Triangle implements Shape{
    double high;
    double base;

    public Triangle(double high, double base) {

        high = high;
        base = base;
    }

    @Override
    public String getShapeName() {
        return "triangle";

    }

    @Override
    public double getField() {
        return 0.5 * base * high;
    }
}
