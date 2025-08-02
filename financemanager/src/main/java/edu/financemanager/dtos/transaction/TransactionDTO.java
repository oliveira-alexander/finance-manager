package edu.financemanager.dtos.transaction;

import edu.financemanager.entities.Category;

import java.time.LocalDateTime;

public record TransactionDTO
    (long id,
    String description,
    Category category,
    LocalDateTime dateTime,
    float value){}
