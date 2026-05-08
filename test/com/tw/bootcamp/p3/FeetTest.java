package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class FeetTest {
    @Test
    void shouldCreateTheInchesWithTheValues() {
        Inch inch = new Inch(12);
        Feet feet = new Feet(1);
        assertTrue(feet.compare(inch));
    }

    @Test
    void shouldCompareTheLengthInFeetOnly() {
        Feet feet = new Feet(1);
        Feet feet1 = new Feet(1);

        assertTrue(feet.equals(feet1));
    }
}