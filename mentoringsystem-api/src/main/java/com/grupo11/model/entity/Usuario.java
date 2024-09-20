package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", nullable = false, length = 255)
    private String nombre;

    @Column(name = "email", nullable = false, unique = true, length = 255)
    private String email;

    @Column(name = "contrasena", nullable = false, length = 255)
    private String contrasena;

    @Column(name = "rol", nullable = false, length = 50)
    private String rol;
}

