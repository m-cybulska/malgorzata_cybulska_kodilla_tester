package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int releaseYear;

    public OperatingSystem(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void turnOn () {
        System.out.println("The system is turning on...");
    }

    public void turnOf() {
        System.out.println("The system is turning off..." + "\n");
    }

    public void displayReleaseYear() {
        System.out.println("System release year: " + releaseYear);
    }
}
