package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LengthTest {
    @Test
    void shouldCompareFeetWithInch() throws NegativeMagnitudeException {
        Length length = Length.createLength(LengthUnit.FEET, 1.0);
        Length length1 = Length.createLength(LengthUnit.INCH, 12);

        assertEquals(length, length1);
    }

    @Test
    void shouldCompareInchWithCm() throws NegativeMagnitudeException {
        Length length = Length.createLength(LengthUnit.INCH, 1.0);
        Length length1 = Length.createLength(LengthUnit.CM, 2.5);

        assertEquals(length, length1);
    }

    @Test
    void shouldCompareCmWithMM() throws NegativeMagnitudeException {
        Length length = Length.createLength(LengthUnit.CM, 1.0);
        Length length1 = Length.createLength(LengthUnit.MM, 10.0);

        assertEquals(length, length1);
    }

    @Test
    void shouldThrowExceptionForNegativeLength() {
        assertThrows(NegativeMagnitudeException.class, () -> Length.createLength(LengthUnit.CM, -10));
    }

    @Test
    void shouldAddTwoInchesAndReturnTheNewLength() throws NegativeMagnitudeException {
        Length inchLength1 = Length.createLength(LengthUnit.INCH, 2);
        Length inchLength2 = Length.createLength(LengthUnit.INCH, 2);

        assertEquals(inchLength1.add(inchLength2), Length.createLength(LengthUnit.INCH, 4));
    }
}