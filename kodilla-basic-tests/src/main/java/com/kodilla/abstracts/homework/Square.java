package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double calculateSurfaceArea() {
        return a * a;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * a;
    }
}
