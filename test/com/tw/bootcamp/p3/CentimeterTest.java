package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentimeterTest {
    @Test
    void shouldCompareTheLengthsInCentimeterAndInch() {
        Centimeter centimeter = new Centimeter(5);
        Inch inch = new Inch(2);

        assertTrue(inch.compare(centimeter));
    }
}