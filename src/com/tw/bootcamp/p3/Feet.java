package com.tw.bootcamp.p3;

import java.util.Objects;

public class Feet {
    private final int length;

    public Feet(int feetValue) {
        this.length = feetValue;
    }

    public boolean compare(Inch inch) {
        return inch.compare(length);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Feet feet)) return false;
        return length == feet.length;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }
}
