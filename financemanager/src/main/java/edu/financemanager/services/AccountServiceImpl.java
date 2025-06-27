package edu.financemanager.services;

import edu.financemanager.dtos.transaction.AccountDTO;
import edu.financemanager.entities.Account;
import edu.financemanager.interfaces.AccountService;
import edu.financemanager.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Override
    public AccountDTO insert(AccountDTO account) {
        repository.save(new Account(account.getBalance(),
                                    account.getCredit_limit(),
                                    account.getCustomer()));

        return account;
    }

    @Override
    public AccountDTO get(Long id) {
        Account account = repository.findById(id).get();
        return new AccountDTO(
                account.getBalance(),
                account.getCredit_limit(),
                account.getCustomer()
        );
    }
}
