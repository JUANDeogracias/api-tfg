package com.example.demo.Services.Impl;

import com.example.demo.Entities.Customer;
import com.example.demo.Entities.Role;
import com.example.demo.Repository.RoleRepository;
import com.example.demo.Services.IRole;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.Repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class RoleImpl implements IRole {
    @Autowired
    private RoleRepository roleRepository;

    public Role getRole(Long id) {

        Optional<Role> role = roleRepository.findById(id);

        return role.orElse(null);
    }
}
