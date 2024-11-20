package com.kodilla.jacoco;

public class Year {
    private final int yearExample;

    public Year(int yearExample) {
        this.yearExample = yearExample;
    }

    public boolean isLeap() {
        if (yearExample % 4 != 0) {
            return false;
        }
        if (yearExample % 100 != 0) {
            return true;
        }
        return yearExample % 400 == 0;
    }
}