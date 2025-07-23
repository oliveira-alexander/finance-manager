package edu.financemanager.interfaces;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;

import java.util.List;

public interface CategoryService {
    CategoryDTO insert(CategoryCreateDTO category);
    List<CategoryDTO> find(CategoryFilterDTO categories);
    CategoryDTO update(CategoryDTO category);
    void delete(Long id);
}
