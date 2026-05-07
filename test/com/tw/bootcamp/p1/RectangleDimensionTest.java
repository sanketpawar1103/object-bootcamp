package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleDimensionTest {
    @Test
    void shouldCreateDimensionsForRectangle() {
        RectangleDimension rectangleDimension1 = new RectangleDimension(4, 5);
        RectangleDimension rectangleDimension2 = new RectangleDimension(4, 5);

        assertEquals(rectangleDimension1, rectangleDimension2);
    }
}