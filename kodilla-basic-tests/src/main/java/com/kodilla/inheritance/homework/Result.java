package com.kodilla.inheritance.homework;

public class Result {
    public static void main(String[] args) {

        OperatingSystem operatingSystem = new OperatingSystem(1956);
        operatingSystem.turnOn();
        operatingSystem.turnOf();

        Windows10 windows10 = new Windows10(2015);
        windows10.turnOn();
        windows10.displayReleaseYear();
        windows10.turnOf();

        Windows11 windows11 = new Windows11(2021);
        windows11.turnOn();
        windows11.displayReleaseYear();
        windows11.turnOf();
    }
}
