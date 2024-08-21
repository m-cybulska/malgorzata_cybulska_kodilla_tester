package com.kodilla.inheritance.homework;

public class Windows10 extends OperatingSystem {

    public Windows10(int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void displayReleaseYear() {
        System.out.println("Windows10 release year: " + getReleaseYear());
    }


}
