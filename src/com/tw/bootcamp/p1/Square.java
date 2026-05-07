package com.tw.bootcamp.p1;

import java.util.Objects;

public class Square {

    private final QuadrilateralDimension squareDimension;

    public Square(QuadrilateralDimension squareDimension) {
        this.squareDimension = squareDimension;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Square square)) return false;
        return Objects.equals(squareDimension, square.squareDimension);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(squareDimension);
    }

    public int area() {
        return squareDimension.area();
    }

    public int perimeter() {
        return squareDimension.perimeter();
    }
}
