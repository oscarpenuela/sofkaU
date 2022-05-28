package com.company;

/**
 * Represents a bank account
 * @author Oscar Peñuela
 */
public class BankAccount {
    /**
     * Represents the account´s number
     */
    private int accountNumber;
    /**
     * Represents the account´s state
     */
    protected boolean activated;

    /**
     * Creates a bank account
     * @param accountNumber Account number
     * @param activated bank account state
     */
    public BankAccount(int accountNumber, boolean activated) {
        this.accountNumber = accountNumber;
        this.activated = activated;
    }

    /**
     * Returns the account number
     * @return returns account number
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Assigns the account number
     * @param accountNumber account number
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Method to get bank account state
     * @return returns bank account state
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * Assigns bank account state
     * @param activated bank account state
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
