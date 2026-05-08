package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private final VolumeUnit unit;
    private final double magnitude;

    private Volume(VolumeUnit unit, double magnitude) {
        this.unit = unit;
        this.magnitude = magnitude;
    }

    public static Volume createVolume(VolumeUnit unit, double magnitude) throws NegativeMagnitudeException {
        if (magnitude < 0.0) {
            throw new NegativeMagnitudeException("Invalid magnitude parameter");
        }
        return new Volume(unit, magnitude);
    }

    public Volume add(Volume volume) {
        double baseMagnitude = volume.unit.toBase(volume.magnitude);
        double baseMagnitudeOfThis = unit.toBase(magnitude);
        double addedVolume = baseMagnitude + baseMagnitudeOfThis;

        return new Volume(VolumeUnit.LITER, addedVolume);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume)) return false;
        return  Math.abs(unit.toBase(magnitude) - volume.unit.toBase(volume.magnitude)) < 0.01;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, magnitude);
    }
}
