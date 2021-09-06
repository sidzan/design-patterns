package com.learning.iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();
}
