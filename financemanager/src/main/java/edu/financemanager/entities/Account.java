package edu.financemanager.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Accounts")
public class Account {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private double balance;

    private double credit_limit;

    @OneToOne
    @JoinColumn(name = "id_customer")
    private Customer customer;

    // Constructors

    public Account() {}

    public Account(double balance, double credit_limit, Customer customer)
    {
        this.balance = balance;
        this.credit_limit = credit_limit;
        this.customer = customer;
    }

    // Getters & Setters

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

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
}
