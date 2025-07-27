package edu.financemanager.services.category;


import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.entities.Category;
import edu.financemanager.enums.TransactionType;
import edu.financemanager.exceptions.Category.CategoryAlreadyExistsException;
import edu.financemanager.interfaces.validators.CategoryValidator;
import edu.financemanager.repositories.CategoryRepository;
import edu.financemanager.repositories.CategorySpecs;
import edu.financemanager.services.CategoryServiceImpl;
import edu.financemanager.services.CategoryValidatorImpl;
import jakarta.inject.Inject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CategoryServiceTest {

    @Mock
    private CategoryRepository repository;

    @Mock
    private CategoryValidatorImpl validator;

    @InjectMocks
    private CategoryServiceImpl service;

    @Test
    @DisplayName(value = "Should create a category on success")
    public void ShouldCreateACategory()
    {
        //Arrange
        CategoryCreateDTO newCategory = new CategoryCreateDTO(TransactionType.CREDIT, "CARTÃO DE CRÉDITO");
        Category createdCategory = new Category(1L, TransactionType.CREDIT, "CARTÃO DE CRÉDITO");
        CategoryDTO expectedCategory = new CategoryDTO(1L, TransactionType.CREDIT, "CARTÃO DE CRÉDITO");

        when(repository.save(any(Category.class)))
                .thenReturn(createdCategory);

        //Act
        CategoryDTO category = service.insert(newCategory);

        //Assert
        assertThat(category.id()).isEqualTo(expectedCategory.id());
    }
}
