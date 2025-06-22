package edu.financemanager.controllers;

import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.enums.TransactionType;
import edu.financemanager.interfaces.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping (value = "/transaction")
public class TransactionsController {

    @Autowired
    private TransactionService service;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    @GetMapping
    public List<TransactionDTO> getAll()
    {
        return service.getAll();
    }

    @PostMapping
    public TransactionDTO insert(@RequestBody TransactionDTO transaction)
    {
        return service.insert(transaction);
    }

}
