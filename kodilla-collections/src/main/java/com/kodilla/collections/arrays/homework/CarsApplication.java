package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Renault;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.Random;

public class CarsApplication {

    public static Car drawCar() {
        Random generator = new Random();
        int randomCarBrand = generator.nextInt(3);

        if (randomCarBrand == 0) {
            Honda honda = new Honda(generator.nextInt(100) + 1, 0, 0);
            int increment = generator.nextInt(70) + 1;
            honda.increaseSpeed(increment);
            return honda;
        } else if (randomCarBrand == 1) {
            Renault renault = new Renault(generator.nextInt(100) + 1, 0, 0);
            renault.increaseSpeed(generator.nextInt(70) + 1 + renault.getSpeed());
            return renault;
        } else if (randomCarBrand == 2) {
            Volkswagen volkswagen = new Volkswagen(generator.nextInt(100) + 1, 0, 0);
            volkswagen.increaseSpeed(generator.nextInt(70) + 1 + volkswagen.getSpeed());
            return volkswagen;
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Random generator = new Random();
        int carsNumber = generator.nextInt(15) + 1;
        Car[] cars = new Car[carsNumber];

        for (int i = 0; i < carsNumber; i++) {
            cars[i] = drawCar();
        }
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}