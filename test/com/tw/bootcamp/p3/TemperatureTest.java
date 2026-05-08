package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void shouldCompareCelsiusWithFahrenheit() throws NegativeMagnitudeException{
        Temperature hundredCelsius = Temperature.createTemperature(TemperatureUnit.CELSIUS, 100.0);
        Temperature hundredFahrenheit = Temperature.createTemperature(TemperatureUnit.FAHRENHEIT, 212.0);

        assertEquals(hundredCelsius, hundredFahrenheit);
    }

    @Test
    void shouldThrowErrorForMagnitudeOutOfRangeInFahrenheit() {
        assertThrows(NegativeMagnitudeException.class, () -> Temperature.createTemperature(TemperatureUnit.FAHRENHEIT, -500.0));
    }

    @Test
    void shouldThrowErrorForMagnitudeOutOfRangeInCelsius() {
        assertThrows(NegativeMagnitudeException.class, () -> Temperature.createTemperature(TemperatureUnit.CELSIUS, -280.0));
    }
}