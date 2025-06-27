package edu.financemanager.services;

import edu.financemanager.dtos.account.AccountCreateDTO;
import edu.financemanager.dtos.account.AccountDTO;
import edu.financemanager.entities.Account;
import edu.financemanager.entities.Customer;
import edu.financemanager.interfaces.AccountService;
import edu.financemanager.repositories.AccountRepository;
import edu.financemanager.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository repository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public AccountDTO insert(AccountCreateDTO account) {
        Customer customer = customerRepository.findById(account.getCustomerId()).get();

        Account newAccount = new Account(account.getBalance(),
                                         account.getCredit_limit(),
                                         customer);

        repository.save(newAccount);
        return new AccountDTO(newAccount.getId(),
                              newAccount.getBalance(),
                              newAccount.getCredit_limit(),
                              newAccount.getCustomer());
    }

    @Override
    public AccountDTO get(Long id) {
        Account account = repository.findById(id).get();
        return new AccountDTO(
                account.getId(),
                account.getBalance(),
                account.getCredit_limit(),
                account.getCustomer()
        );
    }
}
