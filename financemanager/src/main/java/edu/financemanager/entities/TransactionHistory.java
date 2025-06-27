package edu.financemanager.entities;

import jakarta.persistence.*;

import javax.annotation.processing.Generated;
import java.time.LocalDate;

@Entity
@Table (name = "TransactionHistory")
public class TransactionHistory {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private long transaction_id;

    private LocalDate transaction_date;

    private double transaction_value;

    // Constructors
    public TransactionHistory () {}

    public TransactionHistory (long transaction_id,
                               LocalDate transaction_date,
                               double transaction_value)
    {
        this.transaction_id = transaction_id;
        this.transaction_date = transaction_date;
        this.transaction_value = transaction_value;
    }

    // Getters & Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTransaction_id() {
        return transaction_id;
    }

    public void setTransaction_id(long transaction_id) {
        this.transaction_id = transaction_id;
    }

    public LocalDate getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(LocalDate transaction_date) {
        this.transaction_date = transaction_date;
    }

    public double getTransaction_value() {
        return transaction_value;
    }

    public void setTransaction_value(double transaction_value) {
        this.transaction_value = transaction_value;
    }
}
