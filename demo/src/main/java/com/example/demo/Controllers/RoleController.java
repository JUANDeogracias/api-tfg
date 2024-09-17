package com.example.demo.Controllers;


import com.example.demo.Entities.Customer;
import com.example.demo.Entities.Role;
import com.example.demo.Services.ICustomer;
import com.example.demo.Services.IRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private IRole roleImpl;

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id){
        return roleImpl.getRole(id);
    }

}
