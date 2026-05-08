package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final LengthUnit unit;
    private final double length;

    private Length(LengthUnit unit, double length) {
        this.unit = unit;
        this.length = length;
    }

    public static Length createLength(LengthUnit unit, double length) throws NegativeMagnitudeException {
        if (length < 0) {
            throw new NegativeMagnitudeException("Invalid length parameter");
        }
        return new Length(unit, length);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Length length1)) return false;
        return Double.compare(unit.toBase(length), length1.unit.toBase(length1.length)) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, length);
    }
}
