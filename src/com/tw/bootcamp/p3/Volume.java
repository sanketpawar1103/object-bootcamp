package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {

    private final VolumeUnit unit;
    private final double volume;

    private Volume(VolumeUnit unit, double volume) {
        this.unit = unit;
        this.volume = volume;
    }

    public static Volume createVolume(VolumeUnit unit, double volume) throws NegativeMagnitudeException {
        if (volume < 0.0) {
            throw new NegativeMagnitudeException("Invalid volume parameter");
        }
        return new Volume(unit, volume);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Volume volume1)) return false;
        return  (unit.toBase(volume) - volume1.unit.toBase(volume1.volume)) == 0.0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unit, volume);
    }
}
