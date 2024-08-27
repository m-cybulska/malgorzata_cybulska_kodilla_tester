package com.kodilla.collections.interfaces.homework;

public class Volkswagen implements Car{
    private int speed;
    private int increment;
    private int decrement;

    public Volkswagen(int speed, int increment, int decrement) {
        this.speed = speed;
        this.increment = increment;
        this.decrement = decrement;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getIncrement() {
        return increment;
    }

    public int getDecrement() {
        return decrement;
    }

    public void increaseSpeed(int increment) {
        speed += this.increment;
    }

    public void decreaseSpeed(int decrement) {
        speed -= this.decrement;
    }
}
