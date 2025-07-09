package edu.financemanager.dtos.transaction;

import edu.financemanager.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDTO {
    private long id;
    private String description;
    private TransactionType type;
    private LocalDate date;
    private LocalTime time;
    private float value;
}
