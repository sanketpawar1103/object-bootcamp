package com.tw.bootcamp.p3;

import java.util.Objects;

public class Inch {
    private final int length;

    public Inch(int inchValue) {
        this.length = inchValue;
    }

    public boolean compare(int feetValue) {
        return  length == feetValue * 12;
    }

    public boolean compare(Centimeter centimeter) {
        return centimeter.compare(length);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Inch inch)) return false;
        return length == inch.length;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(length);
    }

}
