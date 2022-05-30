package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        List<SpacecraftFinal> spacecrafts = new ArrayList<SpacecraftFinal>();
        spacecrafts.add(new SpacecraftFinal("Voyager I"));

        for(SpacecraftFinal spacecraftFinal : spacecrafts){

            System.out.println(spacecraftFinal.getName());
            System.out.println(spacecraftFinal.launchVehicle("Hercules", "Liquid Oxigen","270000","100 ton"));
            System.out.println(spacecraftFinal.spacialModule("Lunar module","Explore moon", false, "Moon"));
        }
    }



}
