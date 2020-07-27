package com.luv2code.springdemo.controller;


import com.luv2code.springdemo.repository.CustomerService;
import com.luv2code.springdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public String listCustomers(Model model) {
        List<Customer> customerList = customerService.getCustomers();
        model.addAttribute("customers", customerList);
        return "list-customers";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Customer customer, Model model){
        return "customer-form";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(Customer customer, Model model){
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

}
