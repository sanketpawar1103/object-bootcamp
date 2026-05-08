package com.tw.bootcamp.p3;

public interface UnitAdder<T> {
    public T add(T t) throws NegativeMagnitudeException;
}
