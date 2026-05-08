package com.tw.bootcamp.p3;

public enum TemperatureUnit {
    CELSIUS,
    FAHRENHEIT;


    public double toBase(double magnitude) {
        if (this == CELSIUS) {
            return (magnitude * 1.8) + 32;
        }
        return magnitude;
    }


    public boolean inRange(double magnitude) {
        if (this == CELSIUS && magnitude > -273.15) return true;
        if (this == FAHRENHEIT && magnitude > -459.54) return true;
        return false;
    }
}
