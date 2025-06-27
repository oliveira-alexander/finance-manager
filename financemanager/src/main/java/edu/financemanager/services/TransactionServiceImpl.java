package edu.financemanager.services;

import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.entities.Customer;
import edu.financemanager.entities.Transaction;
import edu.financemanager.enums.TransactionType;
import edu.financemanager.interfaces.TransactionService;
import edu.financemanager.repositories.CustomerRepository;
import edu.financemanager.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<TransactionDTO> getAll() {
        List<Transaction> transactionsDb = repository.findAll();
        List<TransactionDTO> transactionsDto = new ArrayList<>();

        for(var transaction : transactionsDb)
        {
            transactionsDto.add(new TransactionDTO(
                                                    transaction.getSender(),
                                                    transaction.getReceiver(),
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
    public Transaction insert(TransactionDTO transaction) {
        Transaction newTransaction = new Transaction(
                transaction.getSender(),
                transaction.getReceiver(),
                transaction.getDescription(),
                transaction.getType(),
                transaction.getDate(),
                transaction.getTime(),
                transaction.getValue()
        );

        repository.save(newTransaction);

        return newTransaction;
    }
}
