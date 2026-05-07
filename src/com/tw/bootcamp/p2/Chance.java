package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {

    private final double probability;

    public Chance(double decimal) {
        this.probability = decimal;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Chance chance)) return false;
        return Double.compare(probability, chance.probability) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(probability);
    }

    @Override
    public String toString() {
        return "Chance is %f".formatted(probability) ;
    }
}
