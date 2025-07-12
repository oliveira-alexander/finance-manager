package edu.financemanager.repositories;

import edu.financemanager.dtos.category.CategoryFilterDTO;
import edu.financemanager.entities.Category;
import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;

import java.util.ArrayList;
import java.util.List;

public class CategorySpecs {

    public static Specification<Category> filter(CategoryFilterDTO filter)
    {
        return (root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (filter.getType() != null){
                predicates.add(cb.equal(root.get("type"), filter.getType()));
            }

            if(filter.getDescription() != null){
                predicates.add(cb.like(root.get("description"), filter.getDescription() + "%"));
            }

            return cb.and(predicates.toArray(new Predicate[0]));
        };

    }
}
