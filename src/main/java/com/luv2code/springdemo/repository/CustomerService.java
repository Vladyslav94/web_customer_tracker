package com.luv2code.springdemo.repository;

import com.luv2code.springdemo.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository repository;

    public List<Customer> getCustomers() {
        List<Customer> customers = repository.findAll();
        return customers;
    }
}
