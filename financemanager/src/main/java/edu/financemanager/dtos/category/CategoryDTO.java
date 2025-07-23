package edu.financemanager.dtos.category;

import edu.financemanager.enums.TransactionType;

public record CategoryDTO (Long id, TransactionType type, String description) { }
