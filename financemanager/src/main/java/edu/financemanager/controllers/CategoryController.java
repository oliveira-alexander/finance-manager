package edu.financemanager.controllers;

import edu.financemanager.data.ApiResponse;
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
    public ResponseEntity<ApiResponse<CategoryDTO>> create(@RequestBody CategoryCreateDTO newCategory){
        CategoryDTO category = service.insert(newCategory);

        ApiResponse<CategoryDTO> response = new ApiResponse<>();
        response.setData(category);
        response.setMessage(null);

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<CategoryDTO>>> find(@ModelAttribute CategoryFilterDTO filter){
        List<CategoryDTO> categories = service.find(filter);

        ApiResponse<List<CategoryDTO>> response = new ApiResponse<>();
        response.setData(categories);
        response.setMessage(null);

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @PutMapping
    public ResponseEntity<ApiResponse<CategoryDTO>> update(@RequestBody CategoryDTO category)
    {
        CategoryDTO updatedCategory = service.update(category);
        ApiResponse<CategoryDTO> response = new ApiResponse<>();
        response.setData(updatedCategory);
        response.setMessage(null);

        return new ResponseEntity<>(response, HttpStatusCode.valueOf(200));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id)
    {
        service.delete(id);
        return new ResponseEntity<>(new ApiResponse<Void>(null, "Categoria deletada com sucesso."),HttpStatusCode.valueOf(200));
    }
}
