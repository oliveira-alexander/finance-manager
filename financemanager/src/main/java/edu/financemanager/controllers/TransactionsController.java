package edu.financemanager.controllers;

import edu.financemanager.interfaces.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value = "/transaction")
public class TransactionsController {

    @Autowired
    private TransactionService service;

    @GetMapping
    public String getTransaction()
    {
        return "Transação OK!";
    }
}
