package edu.financemanager.services;

import edu.financemanager.dtos.transaction.TransactionCreateDTO;
import edu.financemanager.dtos.transaction.TransactionDTO;
import edu.financemanager.dtos.transaction.TransactionFilterDTO;
import edu.financemanager.dtos.transaction.TransactionUpdateDTO;
import edu.financemanager.entities.Category;
import edu.financemanager.entities.Transaction;
import edu.financemanager.interfaces.TransactionService;
import edu.financemanager.repositories.CategoryRepository;
import edu.financemanager.repositories.TransactionRepository;
import edu.financemanager.repositories.TransactionSpecs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<TransactionDTO> find(TransactionFilterDTO filter) {
        var filtered = repository.findAll(TransactionSpecs.find(filter));
        List<TransactionDTO> list = new ArrayList<>();
        
        filtered.forEach(t -> list.add(new TransactionDTO(t.getId(), t.getDescription(), t.getCategory(),
                t.getDateTime(), t.getTransactionValue())));

        return list;
    }

    @Override
    public TransactionDTO create(TransactionCreateDTO transaction) {
       Optional<Category> category = categoryRepository.findById(transaction.categoryId());

        Transaction newTransaction = new Transaction(
                transaction.description(),
                category.get(),
                transaction.dateTime(),
                transaction.value()
        );

        repository.save(newTransaction);

        return new TransactionDTO(
                newTransaction.getId(),
                newTransaction.getDescription(),
                newTransaction.getCategory(),
                newTransaction.getDateTime(),
                newTransaction.getTransactionValue()
        );
    }

    @Override
    public TransactionDTO update(TransactionUpdateDTO transaction) {
        Optional<Category> category = categoryRepository.findById(transaction.categoryId());

        Transaction updatingTransaction = new Transaction(transaction.id(),
                                                          transaction.description(),
                                                          category.get(),
                                                          transaction.dateTime(),
                                                          transaction.value());
        repository.save(updatingTransaction);

        return new TransactionDTO(updatingTransaction.getId(),
                updatingTransaction.getDescription(), updatingTransaction.getCategory(),
                updatingTransaction.getDateTime(), updatingTransaction.getTransactionValue());
    }

    @Override
    public void delete(long id) {
        if (repository.existsById(id))
            repository.deleteById(id);
    }
}
