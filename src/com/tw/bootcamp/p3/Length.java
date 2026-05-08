package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final Unit unit;
    private final double length;

    public Length(Unit unit, double length) {
        this.unit = unit;
        this.length = length;
    }

    public boolean compare(Length anotherLength) {
        double inCm = unit.toBase(length);
        double anotherLengthInCm = anotherLength.unit.toBase(anotherLength.length);

        return inCm == anotherLengthInCm;
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
