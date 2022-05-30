package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char c = 'y';
        int choiceShip = 0;

        List<SpacecraftFinal> spacecrafts = new ArrayList<SpacecraftFinal>();

        while(c == 'y' || c == 'Y') {
            System.out.println("Desea seguir creando naves?: ");  // Se ejecuta 10 veces.
            c = sc.next().charAt(0);
            if (c == 'Y' || c == 'y') {
                System.out.println("Choice your preferences: (Voyager I - 1 , Voyager II - 2, Explorer I - 3, Apollo XX - 4):");
                choiceShip = sc.nextInt();
                switch (choiceShip) {
                    case 1:
                        spacecrafts.add(new SpacecraftFinal("Voyager I", "Hercules", "Liquid Oxigen",
                                "270000", "100 ton", "Lunar module",
                                "Explore moon", false, "Moon"));
                        break;
                    case 2:
                        spacecrafts.add(new SpacecraftFinal("Voyager II", "Hercules II", "Nitrogen Oxigen",
                                "360000", "200 ton", "Saturn module",
                                "Explore Saturn rings", false, "Saturn"));
                        break;
                    case 3:
                        spacecrafts.add(new SpacecraftFinal("Explorer I", "Atlas I", "Queroseno + O(liq)",
                                "300000", "300 ton", "Venus module",
                                "Explore Venus", false, "Venus"));
                        break;
                    case 4:
                        spacecrafts.add(new SpacecraftFinal("Apollo XX", "Falcon", "Liquid Oxigen + Nitrogen",
                                "250000", "200 ton", "RepEE X",
                                "EEI repairs", true, "EEI"));
                        break;
                    default:
                        System.out.println("Choice an option valid");

                }
                for (SpacecraftFinal spacecraftFinal : spacecrafts) {
                    System.out.println(spacecraftFinal.getName());
                    System.out.println(spacecraftFinal.launchVehicle());
                    System.out.println(spacecraftFinal.spacialModule());
                }
            }
        }
    }
}
