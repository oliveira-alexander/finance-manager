package edu.financemanager.services;

import edu.financemanager.dtos.transaction.TransactionCreateDTO;
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
                                                    transaction.getId(),
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
    public TransactionDTO insert(TransactionCreateDTO transaction) {
        Customer sender = customerRepository.findById(transaction.getSenderId()).get();
        Customer receiver = customerRepository.findById(transaction.getReceiverId()).get();


        Transaction newTransaction = new Transaction(
                sender,
                receiver,
                transaction.getDescription(),
                transaction.getType(),
                transaction.getDate(),
                transaction.getTime(),
                transaction.getValue()
        );

        repository.save(newTransaction);

        return new TransactionDTO(
                newTransaction.getId(),
                newTransaction.getSender(),
                newTransaction.getReceiver(),
                newTransaction.getDescription(),
                newTransaction.getTransaction_type(),
                newTransaction.getTransaction_date(),
                newTransaction.getTransaction_time(),
                newTransaction.getTransaction_value()
        );
    }
}
