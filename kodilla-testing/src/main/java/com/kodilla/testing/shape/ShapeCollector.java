package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    ArrayList<Shape> shapeArrayList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeArrayList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        return shapeArrayList.remove(shape);
    }

    public Shape getFigure(int n){
        return shapeArrayList.get(n);
    }

    public int showFigure(){
        return shapeArrayList.size();
    }
}
