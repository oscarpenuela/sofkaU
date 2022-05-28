package com.company;

/**
 * Represents a store article
 * @author Oscar Peñuela
 */
public class Article {

    /**
     * Represents a description of an item
     */
    private String description;
    /**
     * Represents sale price of the item
     */
    private double salePrice;
    /**
     * Represents number of items in stock
     */
    private int stock;

    /**
     * Creates an item
     * @param description item´s description
     * @param salePrice item´s sale price
     * @param stock item´s quantity in stock
     */
    public Article(String description, double salePrice, int stock) {
        this.description = description;
        this.salePrice = salePrice;
        this.stock = stock;
    }

    /**
     * Method to get the description of an item
     * @return returns item´s description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Assigns a description an item
     * @param description assigns item´s description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Method to get the sale price of an item
     * @return returns item´s sales price
     */
    public double getSalePrice() {
        return salePrice;
    }

    /**
     * Assigns the item´s sale price
     * @param salePrice assigns sale price
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    /**
     * Method to get the stock of an item
     * @return returns item´s stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * Assigns the item´s stock
     * @param stock Quantity of items available
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Increments the stock
     * @param purchase purchased amount
     */
    protected void addStock(int purchase){
        stock = stock + purchase;
    }
}
