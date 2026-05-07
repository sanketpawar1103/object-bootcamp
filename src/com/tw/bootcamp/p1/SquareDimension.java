package com.tw.bootcamp.p1;

import java.util.Objects;

public class SquareDimension implements QuadrilateralDimension {
    private final int side;

    public SquareDimension(int side) {
        this.side = side;
    }

    @Override
    public int area() {
        return side * side;
    }

    @Override
    public int perimeter() {
        return 4 * side;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SquareDimension that)) return false;
        return side == that.side;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(side);
    }
}
