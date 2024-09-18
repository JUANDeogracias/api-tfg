package com.example.demo.Services;

import com.example.demo.Entities.Customer;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ICustomer {

    public List<Customer> getAllCustomer();
    public void addCustomer(Customer customer);
    public Page<Customer> getSortOfCustomers(int firstSize, int lastSize);
}
