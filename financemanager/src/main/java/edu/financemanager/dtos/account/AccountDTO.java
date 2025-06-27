package edu.financemanager.dtos.account;

import edu.financemanager.entities.Customer;

public class AccountDTO {
    private long id;
    private double balance;
    private double credit_limit;
    private Customer customer;

    // Constructors

    public AccountDTO() {}

    public AccountDTO(long id, double balance, double credit_limit, Customer customer)
    {
        this.id = id;
        this.balance = balance;
        this.credit_limit = credit_limit;
        this.customer = customer;

    }

    // Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
