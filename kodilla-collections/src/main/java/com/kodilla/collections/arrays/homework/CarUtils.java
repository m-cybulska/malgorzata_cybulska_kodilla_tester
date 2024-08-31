package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Renault;
import com.kodilla.collections.interfaces.homework.Volkswagen;


public class CarUtils {

    public static void describeCar(Car car){
        System.out.println("------------------------------");
        System.out.println("Car brand: " + getCarBrand(car));
        System.out.println("Car speed: " + car.getSpeed());
    }

    private static String getCarBrand(Car car) {
        if (car instanceof Honda) {
            return "Honda";
        }
        else if (car instanceof Renault) {
            return "Renault";
        }
        else if (car instanceof Volkswagen) {
            return "Volkswagen";
        }
        else {
            return "Unknown car brand";
        }
    }
}
