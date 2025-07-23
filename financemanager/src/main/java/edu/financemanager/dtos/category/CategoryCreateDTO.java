package edu.financemanager.dtos.category;

import edu.financemanager.enums.TransactionType;

public record CategoryCreateDTO(TransactionType type, String description) {
}
