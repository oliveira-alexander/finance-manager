package edu.financemanager.interfaces.validators;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;

public interface CategoryValidator {
    void validateCreate(CategoryCreateDTO category);
    void validateUpdate(CategoryDTO category);
    void validateDelete(long id);
}
