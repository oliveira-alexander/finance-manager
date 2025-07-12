package edu.financemanager.interfaces;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;

import java.util.List;

public interface CategoryService {
    public CategoryDTO insert(CategoryCreateDTO category);
    public List<CategoryDTO> find(CategoryFilterDTO categories);
}
