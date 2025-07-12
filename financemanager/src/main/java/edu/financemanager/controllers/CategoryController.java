package edu.financemanager.controllers;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private CategoryService service;

    @Autowired
    public CategoryController(CategoryService service){
        this.service = service;
    }

    @PostMapping
    public CategoryDTO insert(@RequestBody CategoryCreateDTO category){
        return service.insert(category);
    }

    @GetMapping
    public List<CategoryDTO> find(@ModelAttribute CategoryFilterDTO filter){
        return service.find(filter);
    }
}
