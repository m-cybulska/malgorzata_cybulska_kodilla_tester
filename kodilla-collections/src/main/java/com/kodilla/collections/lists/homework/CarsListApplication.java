package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Honda;
import com.kodilla.collections.interfaces.homework.Renault;
import com.kodilla.collections.interfaces.homework.Volkswagen;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Honda(130, 20, 15));
        cars.add(new Renault(150, 25, 15));
        cars.add(new Volkswagen(180, 30, 20));

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(2);

        Renault renault = new Renault(150, 25, 15);
        cars.remove(renault);

        for (Car car : cars) {
            System.out.println("\n");
            System.out.println("List size: " + cars.size());
            CarUtils.describeCar(car);
        }
    }
}
