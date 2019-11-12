package com.kodilla.testing.shape;

public class Circle implements Shape{

    double radius;

    public Circle(double radius){
        radius = radius;
    }

    @Override
    public String getShapeName() {
        return "circle";

    }

    @Override
    public double getField() {
        return 3.14 * radius * radius;
    }
}
