package edu.financemanager.controllers;

import edu.financemanager.dtos.category.CategoryCreateDTO;
import edu.financemanager.dtos.category.CategoryDTO;
import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.interfaces.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @PostMapping
    public CategoryDTO create(@RequestBody CategoryCreateDTO category){
        return service.insert(category);
    }

    @GetMapping
    public List<CategoryDTO> find(@ModelAttribute CategoryFilterDTO filter){
        return service.find(filter);
    }

    @PutMapping
    public CategoryDTO update(@RequestBody CategoryDTO category)
    {
        return service.update(category);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id)
    {
        service.delete(id);
        return new ResponseEntity<Void>(HttpStatusCode.valueOf(200));
    }


}
