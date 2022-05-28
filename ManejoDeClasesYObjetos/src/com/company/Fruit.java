package com.company;

import java.util.ArrayList;

/**
 * Represents a fruit
 * @author Oscar Peñuela
 */
public class Fruit {
    /**
     * Represents the fruit name
     */
    public String name;
    /**
     * Represents the fruit average weight
     */
    private float averageWeight;
    /**
     * Represents the possible fruit colors
     */
    public ArrayList<String> colors;

    /**
     * Creates a fruit
     * @param name fruit name
     * @param averageWeight fruit average weight
     * @param colors fruit colors
     */
    public Fruit(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Method to get the fruit name
     * @return returns the fruit name
     */
    public String getName() {
        return name;
    }

    /**
     * Method assigns the fruit name
     * @param name assigns fruit name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the fruit average weight
     * @return returns the average of weight
     */
    public float getAverageWeight() {
        return averageWeight;
    }

    /**
     * Method to set the average weight
     * @param averageWeight assigns the average of weight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * Method to get the possible fruit colors
     * @return returns the fruit colors
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Method to assigns the possible fruit colors
     * @param colors assigns the fruit colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

}
