package com.example.demo.Entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = false)
    private String username;

    @Column(name = "password", nullable = false, unique = false)
    private String password;

    @Column(name = "email", nullable = false, unique = true)
    private String email;
}
