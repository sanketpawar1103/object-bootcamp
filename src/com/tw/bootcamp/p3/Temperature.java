package com.tw.bootcamp.p3;

import java.util.Objects;

public class Temperature {
    private final TemperatureUnit unit;
    private final double magnitude;

    public Temperature(TemperatureUnit unit, double magnitude) {
        this.unit = unit;
        this.magnitude = magnitude;
    }

    public static Temperature createTemperature(TemperatureUnit unit, double magnitude) throws NegativeMagnitudeException{
        if (!unit.inRange(magnitude)) throw new NegativeMagnitudeException("Invalid temperature parameter");
        return new Temperature(unit, magnitude);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Temperature t)) return false;

        return Math.abs(unit.toBase(magnitude) - t.unit.toBase(t.magnitude)) <= 0.01;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, magnitude);
    }
}
