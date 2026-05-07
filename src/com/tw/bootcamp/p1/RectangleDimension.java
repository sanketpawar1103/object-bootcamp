package com.tw.bootcamp.p1;

import java.util.Objects;

public class RectangleDimension {

    private final int length;
    private final int breadth;

    public RectangleDimension(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof RectangleDimension that)) return false;
        return length == that.length && breadth == that.breadth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, breadth);
    }

    public int area() {
        return length * breadth;
    }
}
