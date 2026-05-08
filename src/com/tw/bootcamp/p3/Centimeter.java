package com.tw.bootcamp.p3;

public class Centimeter {
    private final int length;

    public Centimeter(int length) {
        this.length = length;
    }

    public boolean compare(int lengthInInch) {
        return length == lengthInInch * 2.5;
    }
}
