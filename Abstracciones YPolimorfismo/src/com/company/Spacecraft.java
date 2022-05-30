package com.company;

public abstract class Spacecraft {

    private String name;

    public Spacecraft(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String launchVehicle(String nameLaunchVehicle, String fuel, String power, String loadCapacity);
}
