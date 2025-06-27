package edu.financemanager.interfaces;

import edu.financemanager.dtos.transaction.CustomerDTO;
import edu.financemanager.entities.Customer;

public interface CustomerService {
    Customer insert(CustomerDTO customer);
    CustomerDTO get(long id);
}
