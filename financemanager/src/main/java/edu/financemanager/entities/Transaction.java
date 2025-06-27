package edu.financemanager.entities;

import edu.financemanager.enums.TransactionType;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table (name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn (name = "sender_id")
    private Customer sender;

    @ManyToOne
    @JoinColumn (name = "receiver_id")
    private Customer receiver;

    private String description;

    @Enumerated (EnumType.STRING)
    private TransactionType transaction_type;

    private LocalDate transaction_date;
    private LocalTime transaction_time;
    private float transaction_value;

    // Constructors
    public Transaction() {}

    public Transaction(Customer sender,
                       Customer receiver,
                       String description,
                       TransactionType transaction_type,
                       LocalDate transaction_date,
                       LocalTime transaction_time,
                       float transaction_value)
    {
        this.sender = sender;
        this.receiver = receiver;
        this.description = description;
        this.transaction_type = transaction_type;
        this.transaction_date = transaction_date;
        this.transaction_time = transaction_time;
        this.transaction_value = transaction_value;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TransactionType getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(TransactionType transaction_type) {
        this.transaction_type = transaction_type;
    }

    public LocalDate getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(LocalDate transaction_date) {
        this.transaction_date = transaction_date;
    }

    public LocalTime getTransaction_time() {
        return transaction_time;
    }

    public void setTransaction_time(LocalTime transaction_time) {
        this.transaction_time = transaction_time;
    }

    public float getTransaction_value() {
        return transaction_value;
    }

    public void setTransaction_value(float transaction_value) {
        this.transaction_value = transaction_value;
    }
}
