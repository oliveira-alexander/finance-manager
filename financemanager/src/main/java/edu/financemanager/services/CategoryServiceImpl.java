package edu.financemanager.services;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.entities.Category;
import edu.financemanager.exceptions.Category.CategoryNotFoundException;
import edu.financemanager.interfaces.CategoryService;
import edu.financemanager.repositories.CategoryRepository;
import edu.financemanager.repositories.CategorySpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private CategoryRepository repository;

    @Autowired
    public CategoryServiceImpl(CategoryRepository repository){
        this.repository = repository;
    }

    @Override
    public CategoryDTO insert(CategoryCreateDTO category) {
        Category newCategory = repository.save(new Category(category.type(), category.description()));
        return new CategoryDTO(newCategory.getId(), newCategory.getType(), newCategory.getDescription());
    }

    @Override
    public List<CategoryDTO> find(CategoryFilterDTO categories) {
        List<Category> categoriesList = repository.findAll(CategorySpecs.filter(categories));
        List<CategoryDTO> categoriesReturn = new ArrayList<>();

        categoriesList.forEach(c ->
            categoriesReturn.add(new CategoryDTO(c.getId(), c.getType(), c.getDescription()))
        );

        return categoriesReturn;
    }

    @Override
    public CategoryDTO update(CategoryDTO category) {
        Category updatedCategory = repository.save(new Category(category.id(), category.type(), category.description()));
        return new CategoryDTO(updatedCategory.getId(), updatedCategory.getType(), updatedCategory.getDescription());
    }

    @Override
    public void delete(Long id) {
        if(!(repository.existsById(id)))
            throw new CategoryNotFoundException();

        repository.deleteById(id);
    }
}
