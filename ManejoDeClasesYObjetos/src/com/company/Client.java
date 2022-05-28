package com.company;

/**
 * Represents a client
 * @author Oscar Peñuela
 */
public class Client {
    /**
     * Represents the id client
     */
    private int clientId;
    /**
     * Represents the client name
     */
    private String name;
    /**
     * Represents the client address
     */
    protected String address;
    /**
     * Represents the client telephone
     */
    protected int telephone;

    /**
     * Creates a client
     * @param clientId client ID
     * @param name Client name
     * @param address Client Address
     * @param telephone Client telephone
     */
    public Client(int clientId, String name, String address, int telephone) {
        this.clientId = clientId;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    /**
     * Returns the client ID
     * @return returns the client ID
     */
    public int getClientId() {
        return clientId;
    }

    /**
     * Assigns the id client
     * @param clientId assigns client ID
     */
    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    /**
     * Method to get the client name
     * @return returns client name
     */
    public String getName() {
        return name;
    }

    /**
     * Assigns client name
     * @param name assigns the client name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the client address
     * @return returns the client address
     */
    protected String getAddress() {
        return address;
    }

    /**
     * Method to assign the client address
     * @param address assigns the client address
     */
    protected void setAddress(String address) {
        this.address = address;
    }

    /**
     * Method to get the client telephone
     * returns the client telephone
     * @return returns the client telephone
     */
    protected int getTelephone() {
        return telephone;
    }

    /**
     * Assigns the client telephone
     * @param telephone assigns the client telephone
     */
    protected void setTelephone(int telephone) {
        this.telephone = telephone;
    }
}
