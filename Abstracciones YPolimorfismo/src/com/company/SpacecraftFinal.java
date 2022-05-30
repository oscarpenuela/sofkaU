package com.company;

public class SpacecraftFinal extends Spacecraft implements ISpacialModule{

    private String spacialMod;
    private String launchVeh;
    private String nameLV = super.getNameLaunchVehicle();
    private String f = super.getFuel();
    private String p = super.getPower();
    private String lc = super.getLoadCapacity();
    private String nameSM = super.getNameSpacialModule();
    private String ms = super.getMission();
    private boolean md = super.isManned();
    private String d = super.getDestination();

    public SpacecraftFinal(String name, String nameLaunchVehicle, String fuel, String power, String loadCapacity, String nameSpacialModule, String mission, boolean manned, String destination) {
        super(name, nameLaunchVehicle, fuel, power, loadCapacity, nameSpacialModule, mission, manned, destination);
    }


    @Override
    public String spacialModule() {
        spacialMod =
                "Name: " + nameSM+ " " +
                "Mission: " + ms + " " +
                "Manned: " + md + " " +
                "Destination: " + d;

        return spacialMod;
    }

    @Override
    public String launchVehicle() {
        launchVeh = "Name Launch vehicle: " + nameLV + " " +
                "Fuel: " + f + " " +
                "Power: " + p + " " +
                "Load capacity: " + lc;

        return (launchVeh);
    }

}
