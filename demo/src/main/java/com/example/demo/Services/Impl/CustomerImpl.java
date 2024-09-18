package com.example.demo.Services.Impl;

import com.example.demo.Entities.Customer;
import com.example.demo.Repository.CustomerRepository;
import com.example.demo.Services.ICustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
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

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public Page<Customer> getSortOfCustomers(int firstSize, int lastSize) {

        PageRequest pageable = PageRequest.of(firstSize, lastSize);

        return customerRepository.findAll(pageable);
    }
}
