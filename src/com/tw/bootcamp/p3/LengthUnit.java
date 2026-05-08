package com.tw.bootcamp.p3;

public enum LengthUnit {
    FEET(30.0),
    INCH(2.5),
    CM(1.0),
    MM(0.1);

    private final double baseValue;

    LengthUnit(double baseValue) {
        this.baseValue = baseValue;
    }

    public double toBase(double value) {
        return value * this.baseValue;
    }
}
