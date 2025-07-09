package edu.financemanager.entities;

import edu.financemanager.enums.TransactionType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

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

    @Enumerated (EnumType.STRING)
    private TransactionType transaction_type;

    private LocalDate transaction_date;
    private LocalTime transaction_time;
    private float transaction_value;

    public Transaction(String description,
                       TransactionType transaction_type,
                        LocalDate transaction_date,
                        LocalTime transaction_time,
                        float transaction_value)
    {
        this.description = description;
        this.transaction_type = transaction_type;
        this.transaction_date = transaction_date;
        this.transaction_time = transaction_time;
        this.transaction_value = transaction_value;
    }
}
