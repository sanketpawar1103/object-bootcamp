package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class InchTest {
    @Test
    void shouldCompareInchesToInches() {
        Inch inch = new Inch(1);
        Inch inch1 = new Inch(2);
        assertFalse(inch1.equals(inch));
    }
}