package edu.financemanager.controllers;

import edu.financemanager.dtos.transaction.CustomerDTO;
import edu.financemanager.entities.Customer;
import edu.financemanager.interfaces.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping (value = "/customer")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping ("/{id}")
    public ResponseEntity<CustomerDTO> get(@PathVariable (name = "id") long id)
    {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<Customer> insert (@RequestBody CustomerDTO customer)
    {
        return ResponseEntity.ok(service.insert(customer));
    }

}
