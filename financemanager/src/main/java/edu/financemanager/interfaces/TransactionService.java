package edu.financemanager.interfaces;

import edu.financemanager.dtos.transaction.TransactionCreateDTO;
import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.dtos.transaction.TransactionFilterDTO;
import edu.financemanager.dtos.transaction.TransactionUpdateDTO;
import edu.financemanager.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List<TransactionDTO> find(TransactionFilterDTO filter);
    TransactionDTO create(TransactionCreateDTO transaction);
    TransactionDTO update(TransactionUpdateDTO transaction);
    void delete(long id);
}
