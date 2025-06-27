package edu.financemanager.interfaces;

import edu.financemanager.dtos.account.AccountCreateDTO;
import edu.financemanager.dtos.account.AccountDTO;
import edu.financemanager.entities.Account;

public interface AccountService {
    AccountDTO insert (AccountCreateDTO account);
    AccountDTO get (Long id);
}
