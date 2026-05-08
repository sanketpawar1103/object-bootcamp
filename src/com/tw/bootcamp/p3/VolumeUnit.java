package com.tw.bootcamp.p3;

public enum VolumeUnit {
    GALLON(3.78),
    LITER(1);

    private final double baseVolume;

    VolumeUnit(double baseVolume) {
        this.baseVolume = baseVolume;
    }

    public double toBase(double value) {
        return value * this.baseVolume;
    }
}
