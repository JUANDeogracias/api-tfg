package com.example.demo.Controllers;

import com.example.demo.Entities.Customer;
import com.example.demo.Services.ICustomer;
import com.example.demo.Services.Impl.CustomerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/bussiness")
public class CustomerController {

    @Autowired
    private ICustomer customerImpl;

    @GetMapping("/v1/customer")
    public List<Customer> getCustomers() {
        return customerImpl.getAllCustomer();
    }
}

