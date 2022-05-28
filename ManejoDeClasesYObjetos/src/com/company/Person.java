package com.company;

import java.util.Date;

/**
 *Represents a person with its full name, date of birth and height
 * @author Oscar Peñuela
 */

public class Person {
    /**
     * Represents the person´s name
     */
    public String name;
    /**
     * Represents the first person´s lastname
     */
    public String lastName1;
    /**
     * Represents the second person´s lastname
     */
    public String lastName2;
    /**
     * Represents the person´s date of birth
     */
    public Date dateBirth;
    /**
     * Represents the person´s height
     */
    public float height;

    /**
     * Creates a person
     * @param name person´s name
     * @param lastName1 first person´s lastname
     * @param lastName2 second person´s lastname
     * @param dateBirth person´s date of birth
     * @param height person´s height
     */
    public Person(String name, String lastName1, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName1 = lastName1;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Method to get the name
     * @return person´s name
     */
    public String getName() {
        return name;
    }

    /**
     * Method to set the name
     * @param name assign the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the lastname1
     * @return returns the lastname1
     */
    public String getLastName1() {
        return lastName1;
    }

    /**
     * Method assigns the first lastname
     * @param lastName1 assigns the first lastname
     */
    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    /**
     * Method gets the second lastname
     * @return returns the second lastname
     */
    public String getLastName2() {
        return lastName2;
    }

    /**
     * Method assigns the second lastname
     * @param lastName2 assigns the second lastname
     */
    public void setLastName2(String lastName2) {
        this.lastName2 = lastName2;
    }

    /**
     * Method returns the person´s date of birth
     * @return returns the date of birth
     */
    public Date getDateBirth() {
        return dateBirth;
    }

    /**
     * Method assigns the person´s date or birth
     * @param dateBirth assigns the date of birth
     */
    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    /**
     * Method gets the person´s height
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * Method assigns the person´s height
     * @param height assigns the height
     */
    public void setHeight(float height) {
        this.height = height;
    }
}
