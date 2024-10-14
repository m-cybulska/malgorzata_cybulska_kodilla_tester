package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectResultAdd() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculator = context.getBean(Calculator.class);
        double result = calculator.add(10, 5);
        Assertions.assertEquals(15, result, 0.01);
    }

    @Autowired
    private Calculator calculator;

    @Test
    public void  shouldReturnCorrectResultSubtract() {
        double result = calculator.subtract(10, 5);
        Assertions.assertEquals(5, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultMultiply() {
        double result = calculator.multiply(10, 5);
        Assertions.assertEquals(50, result, 0.01);
    }

    @Test
    public void shouldReturnCorrectResultDivide() {
        double result = calculator.divide(10, 5);
        Assertions.assertEquals(2, result, 0.01);
    }

    @Test
    public void shouldHandleDivisionByZero() {
        double result = calculator.divide(10, 0);
        Assertions.assertEquals(0, result, 0.01);
    }
}