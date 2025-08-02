package edu.financemanager.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table (name = "transactions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    private LocalDateTime dateTime;

    private float transactionValue;

    public Transaction(String description, Category category, LocalDateTime dateTime,
                       float value)
    {
        this.description = description;
        this.category = category;
        this.dateTime = dateTime;
        this.transactionValue = value;
    }
}
