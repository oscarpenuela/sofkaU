package com.company;

public abstract class Spacecraft {

    private String name;
    private String nameLaunchVehicle;
    private String fuel;
    private String power;
    private String loadCapacity;
    private String nameSpacialModule;
    private String mission;
    private boolean manned;
    private String destination;

    public Spacecraft(String name, String nameLaunchVehicle, String fuel, String power, String loadCapacity, String nameSpacialModule, String mission, boolean manned, String destination) {
        this.name = name;
        this.nameLaunchVehicle = nameLaunchVehicle;
        this.fuel = fuel;
        this.power = power;
        this.loadCapacity = loadCapacity;
        this.nameSpacialModule = nameSpacialModule;
        this.mission = mission;
        this.manned = manned;
        this.destination = destination;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameLaunchVehicle() {
        return nameLaunchVehicle;
    }

    public void setNameLaunchVehicle(String nameLaunchVehicle) {
        this.nameLaunchVehicle = nameLaunchVehicle;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public String getNameSpacialModule() {
        return nameSpacialModule;
    }

    public void setNameSpacialModule(String nameSpacialModule) {
        this.nameSpacialModule = nameSpacialModule;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public boolean isManned() {
        return manned;
    }

    public void setManned(boolean manned) {
        this.manned = manned;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public abstract String launchVehicle();
}
