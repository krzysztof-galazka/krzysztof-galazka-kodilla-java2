package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {

        //given
        Shape square = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        //when
        shapeCollector.addFigure(square);
        //then
        Assert.assertEquals(1, shapeCollector.showFigure());
    }

    @org.junit.jupiter.api.Test
    public void testRemoveFigure() {
        //given
        Shape square = new Square(5);
        ShapeCollector shapeCollector = new ShapeCollector();
        shapeCollector.addFigure(square);

        //when
        shapeCollector.removeFigure(square);

        //then
        Assert.assertEquals(0, shapeCollector.showFigure());
    }

    @Test
    public void testGetFigure() {
        //given
        Shape square = new Square(10);
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(square);

        //then
        Assert.assertTrue(shapeCollector.getFigure(0) instanceof Square);
    }

    @Test
    public void testShowFigure() {
        //given
        Shape square = new Square(10);
        ShapeCollector shapeCollector = new ShapeCollector();

        //when
        shapeCollector.addFigure(square);

        //then
        Assert.assertEquals(square, shapeCollector.getFigure(0));

    }
}
