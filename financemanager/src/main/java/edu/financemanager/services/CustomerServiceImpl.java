package edu.financemanager.services;

import edu.financemanager.dtos.transaction.CustomerDTO;
import edu.financemanager.entities.Customer;
import edu.financemanager.interfaces.CustomerService;
import edu.financemanager.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository repository;


    @Override
    public Customer insert(CustomerDTO customer) {
        Customer newCustomer = new Customer(
                customer.getName(),
                customer.getBirthday()
        );

        repository.save(newCustomer);

        return newCustomer;
    }

    @Override
    public CustomerDTO get(long id) {
        Customer customerEntity = new Customer();

        if (repository.existsById(id))
            customerEntity = repository.findById(id).get();

        return new CustomerDTO(
                customerEntity.getName(),
                customerEntity.getBirthday()
        );
    }
}
