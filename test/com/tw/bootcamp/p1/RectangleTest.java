package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCreateARectangleUsingDimensions() {
        RectangleDimension rectangleDimension = new RectangleDimension(2, 3);
        Rectangle rectangle1 = new Rectangle(rectangleDimension);
        Rectangle rectangle2 = new Rectangle(rectangleDimension);

        assertEquals(rectangle1, rectangle2);
    }

    @Test
    void shouldCalculateAreaForRectangle() {
        RectangleDimension rectangleDimension = new RectangleDimension(2, 3);
        Rectangle rectangle = new Rectangle(rectangleDimension);
        assertEquals(6, rectangle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeterForRectangle() {
        RectangleDimension rectangleDimension = new RectangleDimension(2, 3);
        Rectangle rectangle = new Rectangle(rectangleDimension);
        assertEquals(10, rectangle.calculatePerimeter());
    }


}