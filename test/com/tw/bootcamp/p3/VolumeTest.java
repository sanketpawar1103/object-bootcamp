package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class VolumeTest {
    @Test
    void shouldCreateTheVolume() throws NegativeMagnitudeException {
        Volume volume = Volume.createVolume(VolumeUnit.LITER, 3.78);
        Volume volume1 = Volume.createVolume(VolumeUnit.GALLON, 1);

        assertEquals(volume1, volume);
    }

    @Test
    void shouldThrowErrorForNegativeVolume()  {
        assertThrows(NegativeMagnitudeException.class, () -> Volume.createVolume(VolumeUnit.LITER, -1));
    }
}