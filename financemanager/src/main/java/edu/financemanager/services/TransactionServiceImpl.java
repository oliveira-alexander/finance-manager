package edu.financemanager.services;

import edu.financemanager.dtos.transaction.TransactionCreateDTO;
import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.entities.Transaction;
import edu.financemanager.interfaces.TransactionService;
import edu.financemanager.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    @Override
    public List<TransactionDTO> getAll() {
        List<Transaction> transactionsDb = repository.findAll();
        List<TransactionDTO> transactionsDto = new ArrayList<>();

        for(var transaction : transactionsDb)
        {
            transactionsDto.add(new TransactionDTO(
                                                    transaction.getId(),
                                                    transaction.getDescription(),
                                                    transaction.getTransaction_type(),
                                                    transaction.getTransaction_date(),
                                                    transaction.getTransaction_time(),
                                                    transaction.getTransaction_value()
                    ));
        }

        return transactionsDto;
    }

    @Override
    public TransactionDTO insert(TransactionCreateDTO transaction) {
        Transaction newTransaction = new Transaction(
                transaction.getDescription(),
                transaction.getType(),
                transaction.getDate(),
                transaction.getTime(),
                transaction.getValue()
        );

        repository.save(newTransaction);

        return new TransactionDTO(
                newTransaction.getId(),
                newTransaction.getDescription(),
                newTransaction.getTransaction_type(),
                newTransaction.getTransaction_date(),
                newTransaction.getTransaction_time(),
                newTransaction.getTransaction_value()
        );
    }
}
