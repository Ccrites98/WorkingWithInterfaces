package com.pluralsight;
public abstract class Comparable<P> implements java.lang.Comparable<Comparable<P>> {
    private int someValue;
    @Override
    public int compareTo(Comparable<P> other) {
        return Integer.compare(this.someValue, other.someValue);
    }
    public abstract int compareTo(Person other);
}