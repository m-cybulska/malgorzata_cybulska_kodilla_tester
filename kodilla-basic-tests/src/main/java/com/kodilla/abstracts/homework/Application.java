package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {
        Square square = new Square(6.0);
        System.out.println("Surface area of this square: " + square.calculateSurfaceArea());
        System.out.println("Perimeter of this square: " + square.calculatePerimeter() + "\n");

        Trapezoid trapezoid= new Trapezoid(4.0, 10.0, 3.0, 3.5, 2.0);
        System.out.println("Surface area of this trapezoid: " + trapezoid.calculateSurfaceArea());
        System.out.println("Perimeter of this trapezoid: " + trapezoid.calculatePerimeter() + "\n");

        Triangle triangle = new Triangle(15.0, 8.0, 17.0, 8.0);
        System.out.println("Surface area of this triangle: " + triangle.calculateSurfaceArea());
        System.out.println("Perimeter of this triangle is: " + triangle.calculatePerimeter() + "\n");


    }
}
