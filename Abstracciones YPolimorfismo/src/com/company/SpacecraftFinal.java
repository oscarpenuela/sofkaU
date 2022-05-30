package com.company;

public class SpacecraftFinal extends Spacecraft implements ISpacialModule{

    public String spacialMod;
    public String launchVeh;

    public SpacecraftFinal(String name) {
        super(name);
    }


    @Override
    public String spacialModule(String nameSpacialModule, String mission, boolean manned, String destination) {
        spacialMod =
                "Name: " + nameSpacialModule + " " +
                "Mission: " + mission + " " +
                "Manned: " + manned + " " +
                "Destination: " + destination;

        return spacialMod;
    }

    @Override
    public String launchVehicle(String nameLaunchVehicle, String fuel, String power, String loadCapacity) {
        launchVeh = "Name Launch vehicle: " + nameLaunchVehicle + " " +
                "Fuel: " + fuel + " " +
                "Power: " + power + " " +
                "Load capacity: " + loadCapacity;

        return (launchVeh);
    }

}
