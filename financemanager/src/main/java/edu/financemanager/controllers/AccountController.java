package edu.financemanager.controllers;

import edu.financemanager.dtos.transaction.AccountDTO;
import edu.financemanager.entities.Account;
import edu.financemanager.interfaces.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/account")
public class AccountController {

    @Autowired
    private AccountService service;

    @GetMapping("/{id}")
    public ResponseEntity<AccountDTO> get(@PathVariable (name = "id")Long id)
    {
        return ResponseEntity.ok(service.get(id));
    }

    @PostMapping
    public ResponseEntity<AccountDTO> insert(@RequestBody AccountDTO account)
    {
        return ResponseEntity.ok(service.insert(account));
    }
}
