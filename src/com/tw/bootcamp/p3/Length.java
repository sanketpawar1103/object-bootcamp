package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final LengthUnit unit;
    private final double magnitude;

    private Length(LengthUnit unit, double magnitude) {
        this.unit = unit;
        this.magnitude = magnitude;
    }

    public static Length createLength(LengthUnit unit, double magnitude) throws NegativeMagnitudeException {
        if (magnitude < 0) {
            throw new NegativeMagnitudeException("Invalid length parameter");
        }
        return new Length(unit, magnitude);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length)) return false;
        return Double.compare(unit.toBase(magnitude), length.unit.toBase(length.magnitude)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, magnitude);
    }

    public Length add(Length inchLength2) {
        double addedLength =  inchLength2.magnitude + magnitude;

        return new Length(unit, addedLength);
    }
}
