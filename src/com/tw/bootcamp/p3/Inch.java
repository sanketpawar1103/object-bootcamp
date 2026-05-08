package com.tw.bootcamp.p3;

public class Inch {
    private final int inchValue;

    public Inch(int inchValue) {
        this.inchValue = inchValue;
    }

    public boolean compare(int feetValue) {
        return  inchValue == feetValue * 12;
    }
}
