package edu.financemanager.interfaces;

import edu.financemanager.dtos.customer.CustomerCreateDTO;
import edu.financemanager.dtos.customer.CustomerDTO;
import edu.financemanager.entities.Customer;

public interface CustomerService {
    CustomerDTO insert(CustomerCreateDTO customer);
    CustomerDTO get(long id);
}
