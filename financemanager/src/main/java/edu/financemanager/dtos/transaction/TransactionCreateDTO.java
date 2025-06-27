package edu.financemanager.dtos.transaction;

import edu.financemanager.enums.TransactionType;

import java.time.LocalDate;
import java.time.LocalTime;

public class TransactionCreateDTO {
    private long senderId;
    private long receiverId;
    private String description;
    private TransactionType type;
    private LocalDate date;
    private LocalTime time;
    private float value;

    // Constructors
    public TransactionCreateDTO() {}

    public TransactionCreateDTO(
                          long senderId,
                          long receiverId,
                          String description,
                          TransactionType type,
                          LocalDate date,
                          LocalTime time,
                          float value)
    {
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.description = description;
        this.type = type;
        this.date = date;
        this.time = time;
        this.value = value;
    }

    // Getters & Setters
    public long getSenderId() {
        return senderId;
    }

    public void setSenderId(long senderId) {
        this.senderId = senderId;
    }

    public long getReceiverId() {
        return receiverId;
    }

    public void setReceiverId(long receiverId) {
        this.receiverId = receiverId;
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
