package com.example.demo.Controllers;

import com.example.demo.Entities.Customer;
import com.example.demo.Services.ICustomer;
import com.example.demo.Services.Impl.CustomerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
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

    @GetMapping("v1/customerPag")
    public ResponseEntity<?> getSortOfCustomers(@RequestParam(defaultValue = "0") int firstSize,
                                             @RequestParam(defaultValue = "10") int lastSize){
       Page<Customer> customers =  customerImpl.getSortOfCustomers(firstSize, lastSize);
       return ResponseEntity.ok(customers);
    }

    @PostMapping("/v1/add")
    public void addCustomer(@RequestBody Customer customer) {
        customerImpl.addCustomer(customer);
    }
}

