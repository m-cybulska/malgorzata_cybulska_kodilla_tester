package com.kodilla.inheritance.homework;

public class Windows11 extends Windows10 {

    public Windows11 (int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void displayReleaseYear() {
        System.out.println("Windows11 release year: " + getReleaseYear());
    }

}
