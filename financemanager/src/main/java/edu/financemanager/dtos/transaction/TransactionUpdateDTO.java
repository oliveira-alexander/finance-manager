package edu.financemanager.dtos.transaction;

import java.time.LocalDateTime;

public record TransactionUpdateDTO(long id,
                                   String description,
                                   long categoryId,
                                   LocalDateTime dateTime,
                                   float value) {
}
