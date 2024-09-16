package com.example.demo.Services.Impl;

import com.example.demo.Entities.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Services.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerImpl implements ICustomer {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomer() {
        List<Customer> customers = new ArrayList<>();

        customerRepository.findAll().forEach(customers :: add);

        return customers;
    }
}
