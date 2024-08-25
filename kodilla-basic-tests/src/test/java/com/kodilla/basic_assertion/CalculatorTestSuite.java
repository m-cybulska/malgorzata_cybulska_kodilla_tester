package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        Calculator calculator= new Calculator();
        int a = 5;
        int b = 8;
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquareNegativeNumber() {
        Calculator calculator = new Calculator();
        double c = -3;
        double squareResult = calculator.square(c);
        assertEquals(9, squareResult, 0.00001);
    }

    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        double c = 0;
        double squareResult = calculator.square(c);
        assertEquals(0,squareResult, 0.00001);
    }

    @Test
    public void testSquarePositiveNumber() {
        Calculator calculator = new Calculator();
        double c = 12;
        double squareResult = calculator.square(c);
        assertEquals(144, squareResult, 0.00001);
    }
}