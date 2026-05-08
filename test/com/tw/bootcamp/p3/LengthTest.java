package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LengthTest {
    @Test
    void shouldCompareFeetWithInch() {
        Length length = new Length(Unit.FEET, 1.0);
        Length length1 = new Length(Unit.INCH, 12);

        assertEquals(length, length1);
    }

    @Test
    void shouldCompareInchWithCm() {
        Length length = new Length(Unit.INCH, 1.0);
        Length length1 = new Length(Unit.CM, 2.5);

        assertEquals(length, length1);
    }

    @Test
    void shouldCompareCmWithMM() {
        Length length = new Length(Unit.CM, 1.0);
        Length length1 = new Length(Unit.MM, 10.0);

        assertEquals(length, length1);
    }
}