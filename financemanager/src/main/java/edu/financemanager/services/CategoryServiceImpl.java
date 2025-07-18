package edu.financemanager.services;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.entities.Category;
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
        var newCategory = repository.save(new Category(category.getType(), category.getDescription()));
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
}
