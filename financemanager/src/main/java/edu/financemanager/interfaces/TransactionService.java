package edu.financemanager.interfaces;

import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.entities.Transaction;

import java.util.List;

public interface TransactionService {
    List<TransactionDTO> getAll();
    TransactionDTO insert(TransactionDTO transaction);
}
