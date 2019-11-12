package com.kodilla.testing.shape;

public class Square implements Shape{

    double width;

    public Square(double width) {
        width = width;
    }

    @Override
    public String getShapeName() {
        return "square";

    }

    @Override
    public double getField() {
        return width * width;
    }


}
