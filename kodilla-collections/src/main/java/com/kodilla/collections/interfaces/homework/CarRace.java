package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Honda honda = new Honda(80, 30, 15);
        doRace(honda);

        Renault renault= new Renault(90, 35, 20);
        doRace(renault);

        Volkswagen volkswagen = new Volkswagen(100, 40, 25);
        doRace(volkswagen);
    }

    public static void doRace(Car car) {
        for (int i = 0; i < 3; i++) {
            car.increaseSpeed(car.getIncrement());
        }
        for (int i = 0; i < 2; i++) {
            car.decreaseSpeed(car.getDecrement());
        }
        System.out.println("Current speed: " + car.getSpeed());
    }
}
