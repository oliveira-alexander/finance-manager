package edu.financemanager.repositories;

import edu.financemanager.dtos.transaction.TransactionFilterDTO;
import edu.financemanager.entities.Transaction;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class TransactionSpecs {

    public static Specification<Transaction> find(TransactionFilterDTO filter)
    {
        return (root, query, cb) ->
        {
            List<Predicate> predicates = new ArrayList<>();

            if (filter.description() != null)
                predicates.add(cb.like(root.get("description"), filter.description() + '%'));

            return cb.and(predicates.toArray(new Predicate[0]));
        };
    }
}
