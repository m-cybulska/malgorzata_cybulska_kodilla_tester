package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class Calculator {

    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    public double add(double a, double b) {
        double result = a + b;
        return this.display.display(result);
    }

    public double subtract(double a, double b) {
        double result =  a - b;
        return this.display.display(result);
    }

    public double multiply(double a, double b) {
        double result = a * b;
        return this.display.display(result);
    }

    public double divide(double a, double b) {
        if(b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        double result =  a / b;
        return this.display.display(result);
    }
}
