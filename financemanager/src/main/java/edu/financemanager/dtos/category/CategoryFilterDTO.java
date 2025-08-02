package edu.financemanager.dtos.category;

import edu.financemanager.enums.TransactionType;

public record CategoryFilterDTO(TransactionType type,
                                String description) { }
