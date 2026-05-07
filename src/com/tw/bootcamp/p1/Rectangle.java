package com.tw.bootcamp.p1;

import java.util.Objects;

public class Rectangle {

    private final QuadrilateralDimension rectangleDimension;


    public Rectangle(QuadrilateralDimension rectangleDimension) {
        this.rectangleDimension = rectangleDimension;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Rectangle rectangle)) return false;
        return Objects.equals(rectangleDimension, rectangle.rectangleDimension);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rectangleDimension);
    }

    public int calculateArea() {
        return rectangleDimension.area();
    }

    public int calculatePerimeter() {
        return rectangleDimension.perimeter();
    }
}
