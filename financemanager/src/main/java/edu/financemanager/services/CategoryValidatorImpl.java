package edu.financemanager.services;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.entities.Category;
import edu.financemanager.exceptions.Category.CategoryAlreadyExistsException;
import edu.financemanager.exceptions.Category.CategoryNotFoundException;
import edu.financemanager.interfaces.validators.CategoryValidator;
import edu.financemanager.repositories.CategoryRepository;
import edu.financemanager.repositories.CategorySpecs;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryValidatorImpl implements CategoryValidator {
    private final CategoryRepository repository;

    public CategoryValidatorImpl(CategoryRepository repository){
        this.repository = repository;
    }

    @Override
    public void validateCreate(CategoryCreateDTO category) {
        CategoryFilterDTO filter = new CategoryFilterDTO(category.type(), category.description());
        List<Category> newCategory = repository.findAll(CategorySpecs.filter(filter));

        if(!(newCategory.isEmpty()))
            throw new CategoryAlreadyExistsException();
    }

    @Override
    public void validateUpdate(CategoryDTO category) {
        if(!(repository.existsById(category.id())))
            throw new CategoryNotFoundException();
    }

    @Override
    public void validateDelete(long id) {
        if(!(repository.existsById(id)))
            throw new CategoryNotFoundException();
    }
}
