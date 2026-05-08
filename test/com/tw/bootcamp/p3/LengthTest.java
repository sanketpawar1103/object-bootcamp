package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class LengthTest {
    @Test
    void shouldCompareFeetWithInch() throws NegativeMagnitudeException {
        Length lengthInFeet = Length.createLength(LengthUnit.FEET, 1.0);
        Length lengthInInch = Length.createLength(LengthUnit.INCH, 12);

        assertEquals(lengthInFeet, lengthInInch);
    }

    @Test
    void shouldCompareInchWithCm() throws NegativeMagnitudeException {
        Length lengthInInch = Length.createLength(LengthUnit.INCH, 1.0);
        Length lengthInCm = Length.createLength(LengthUnit.CM, 2.5);

        assertEquals(lengthInInch, lengthInCm);
    }

    @Test
    void shouldCompareCmWithMM() throws NegativeMagnitudeException {
        Length lengthInCm = Length.createLength(LengthUnit.CM, 1.0);
        Length lengthImMm = Length.createLength(LengthUnit.MM, 10.0);

        assertEquals(lengthInCm, lengthImMm);
    }

    @Test
    void shouldThrowExceptionForNegativeLength() {
        assertThrows(NegativeMagnitudeException.class, () -> Length.createLength(LengthUnit.CM, -10));
    }

    @Test
    void shouldAddTwoInchesAndReturnTheNewLength() throws NegativeMagnitudeException {
        Length twoInch = Length.createLength(LengthUnit.INCH, 2);
        Length threeInch = Length.createLength(LengthUnit.INCH, 3);
        Length fiveInch = Length.createLength(LengthUnit.INCH, 5);

        assertEquals(twoInch.add(threeInch), fiveInch);
    }
}