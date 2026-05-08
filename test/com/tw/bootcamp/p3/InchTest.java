package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InchTest {
    @Test
    void shouldCreateTheInchesWithTheValues() {
        Inch inch = new Inch(12);
        Feet feet = new Feet(1);
        assertTrue(feet.compare(inch));
    }
}