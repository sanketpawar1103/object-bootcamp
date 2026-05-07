package com.tw.bootcamp.p1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareDimensionTest {
    @Test
    void shouldCreateSquareDimension() {
        SquareDimension squareDimension1 = new SquareDimension(2);
        SquareDimension squareDimension2 = new SquareDimension(2);

        assertEquals(squareDimension1, squareDimension2);
    }

    
}