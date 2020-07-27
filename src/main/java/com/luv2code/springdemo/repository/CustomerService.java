package com.luv2code.springdemo.repository;

import com.luv2code.springdemo.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Transactional
    public List<Customer> getCustomers() {
        return repository.getListSortedByLastName();
    }

    @Transactional
    public void saveCustomer(Customer customer){
        repository.save(customer);
    }
}
