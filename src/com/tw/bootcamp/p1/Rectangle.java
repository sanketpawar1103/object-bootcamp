package com.tw.bootcamp.p1;

import java.util.Objects;

public class Rectangle {
    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public static Rectangle createRectangle(int length, int breadth) {
        return new Rectangle(length, breadth);
    }

    public static Rectangle createSquare(int side) {
        return new Rectangle(side, side);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;
        return length == rectangle.length && breadth == rectangle.breadth;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, breadth);
    }

    public int calculateArea() {
        return length * breadth;
    }

    public int calculatePerimeter() {
        return 2 * (length + breadth);
    }
}
