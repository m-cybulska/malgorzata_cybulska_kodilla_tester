package com.kodilla.abstracts.homework;

public class Trapezoid extends Shape {
    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapezoid(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
    }

    @Override
    public double calculateSurfaceArea() {
        return (a + b) * h / 2;
    }

    @Override
    public double calculatePerimeter() {
        return a + b + c + d;
    }
}
