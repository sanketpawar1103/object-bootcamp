package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldCreateASquareWithSquareDimension() {
        SquareDimension squareDimension = new SquareDimension(2);
        Square square1 = new Square(squareDimension);
        Square square2 = new Square(squareDimension);

        assertEquals(square1, square2);
    }

    @Test
    void shouldCalculateAreaOfSquare() {
        SquareDimension squareDimension = new SquareDimension(2);
        Square square = new Square(squareDimension);

        assertEquals(square.area(), 4);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        SquareDimension squareDimension = new SquareDimension(2);
        Square square = new Square(squareDimension);

        assertEquals(square.perimeter(), 8);
    }
}