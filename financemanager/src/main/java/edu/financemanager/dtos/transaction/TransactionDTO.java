package edu.financemanager.dtos.transaction;

import edu.financemanager.enums.TransactionType;

import java.sql.Time;
import java.util.Date;

public class TransactionDTO {
    private String description;
    private TransactionType type;
    private Date date;
    private Time time;
    private float value;

    // Constructors
    public TransactionDTO() {}

    public TransactionDTO(String description, TransactionType type,
                       Date date, Time time, float value)
    {
        this.description = description;
        this.type = type;
        this.date = date;
        this.time = time;
        this.value = value;
    }

    // Getters & Setters
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }
}
