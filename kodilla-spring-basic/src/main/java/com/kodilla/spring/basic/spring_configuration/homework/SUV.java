package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {
    private boolean headlightsOn;

    @Override
    public boolean hasHeadlightsTurnedOn() {
        return headlightsOn;
    }

    public void setHeadlightsOn(boolean headlightsOn) {
        this.headlightsOn = headlightsOn;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
