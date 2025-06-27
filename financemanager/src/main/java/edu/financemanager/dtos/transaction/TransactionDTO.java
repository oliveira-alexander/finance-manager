package edu.financemanager.dtos.transaction;

import edu.financemanager.entities.Customer;
import edu.financemanager.enums.TransactionType;
import org.antlr.v4.runtime.atn.SemanticContext;

import java.time.LocalDate;
import java.time.LocalTime;

public class TransactionDTO {
    private Customer sender;
    private Customer receiver;
    private String description;
    private TransactionType type;
    private LocalDate date;
    private LocalTime time;
    private float value;

    // Constructors
    public TransactionDTO() {}

    public TransactionDTO(Customer sender,
                          Customer receiver,
                          String description,
                          TransactionType type,
                          LocalDate date,
                          LocalTime time,
                          float value)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.description = description;
        this.type = type;
        this.date = date;
        this.time = time;
        this.value = value;
    }

    // Getters & Setters
    public Customer getSender() {
        return sender;
    }

    public void setSender(Customer sender) {
        this.sender = sender;
    }

    public Customer getReceiver() {
        return receiver;
    }

    public void setReceiver(Customer receiver) {
        this.receiver = receiver;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getType() {
        return type;
    }

    public void setType(TransactionType type) {
        this.type = type;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
