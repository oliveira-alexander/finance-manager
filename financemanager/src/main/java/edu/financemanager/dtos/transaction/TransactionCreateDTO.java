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
@NoArgsConstructor
@AllArgsConstructor
public class TransactionCreateDTO {
    private long senderId;
    private long receiverId;
    private String description;
    private TransactionType type;
    private LocalDate date;
    private LocalTime time;
    private float value;
}
