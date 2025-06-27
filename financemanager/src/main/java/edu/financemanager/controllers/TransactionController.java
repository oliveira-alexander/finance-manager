package edu.financemanager.controllers;

import edu.financemanager.dtos.transaction.TransactionCreateDTO;
import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.interfaces.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping (value = "/transaction")
public class TransactionController {

    @Autowired
    private TransactionService service;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GetMapping
    public ResponseEntity<List<TransactionDTO>> getAll()
    {
        return ResponseEntity.ok(service.getAll());
    }

    @PostMapping
    public ResponseEntity<TransactionDTO> insert(@RequestBody TransactionCreateDTO transaction)
    {
        return ResponseEntity.ok(service.insert(transaction));
    }

}
