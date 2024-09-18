package com.example.demo.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*
    * ENUM.STRING va a almacenar los datos en la bbdd como STRING y ORDINAL
    * los guarda como tipo entero ya que el enum sus valores son de tipo entero
    * */
    @Column(name= "role_name", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private RoleEnum types_role;

    @JsonIgnore
    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private List<Customer> usuarios = new ArrayList<>();
}