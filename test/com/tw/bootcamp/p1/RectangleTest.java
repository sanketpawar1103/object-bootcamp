package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void shouldCreateARectangleUsingDimensions() {
        Rectangle rectangle1 = Rectangle.createRectangle(2, 3);
        Rectangle rectangle2 = Rectangle.createRectangle(2, 3);

        assertEquals(rectangle1, rectangle2);
    }

    @Test
    void shouldCalculateAreaForRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        assertEquals(6, rectangle.calculateArea());
    }

    @Test
    void shouldCalculatePerimeterForRectangle() {
        Rectangle rectangle = Rectangle.createRectangle(2, 3);
        assertEquals(10, rectangle.calculatePerimeter());
    }

    @Test
    void shouldCreateRectangleInstance() {
        Rectangle square1 = Rectangle.createSquare(2);
        Rectangle square2 = Rectangle.createSquare(2);

        assertEquals(square1, square2);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(2);

        assertEquals(8, square.calculatePerimeter());
    }

    @Test
    void shouldCalculateAreaOfSquare() {
        Rectangle square = Rectangle.createSquare(2);

        assertEquals(4, square.calculateArea());
    }
}