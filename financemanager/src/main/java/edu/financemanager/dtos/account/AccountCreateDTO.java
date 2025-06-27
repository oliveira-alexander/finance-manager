package edu.financemanager.dtos.account;

import edu.financemanager.entities.Customer;

public class AccountCreateDTO {

    private double balance;
    private double credit_limit;
    private long customerId;

    // Constructors

    public AccountCreateDTO() {}

    public AccountCreateDTO(double balance, double credit_limit, long customerId)
    {
        this.balance = balance;
        this.credit_limit = credit_limit;
        this.customerId = customerId;

    }

    // Getters & Setters

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(double credit_limit) {
        this.credit_limit = credit_limit;
    }

    public long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
}
