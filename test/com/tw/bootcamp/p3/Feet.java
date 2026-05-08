package com.tw.bootcamp.p3;

import java.util.Objects;

public class Feet {
    private final int feetValue;

    public Feet(int feetValue) {
        this.feetValue = feetValue;
    }

    public boolean compare(Inch inch) {
        return inch.compare(feetValue);
    }
}
