package edu.financemanager.dtos.category;

import edu.financemanager.enums.TransactionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryFilterDTO {
    private TransactionType type;
    private String description;
}
