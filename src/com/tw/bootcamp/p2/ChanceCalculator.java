package com.tw.bootcamp.p2;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ChanceCalculator<T> {
    private final List<T> possiblilities;

    public ChanceCalculator(List<T> possiblilities) {
        this.possiblilities = possiblilities;
    }

    public double chanceOfGetting(T element) {
        int occurrences = Collections.frequency(possiblilities, element);

        return (double) occurrences * 1 / possiblilities.size();
    }

    public double chanceOfNotGetting(T element) {
        return 1.0 - chanceOfGetting(element);
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ChanceCalculator<?> coin)) return false;
        return Objects.equals(possiblilities, coin.possiblilities);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(possiblilities);
    }
}
