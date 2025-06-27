package edu.financemanager.interfaces;

import edu.financemanager.dtos.transaction.AccountDTO;

public interface AccountService {
    AccountDTO insert (AccountDTO account);
    AccountDTO get (Long id);
}
