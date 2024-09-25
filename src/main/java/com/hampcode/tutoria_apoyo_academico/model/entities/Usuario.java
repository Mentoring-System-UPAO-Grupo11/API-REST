package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "email", unique = true, length = 50)
    private String email;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "tipo", updatable = false)
    protected String tipo;

    @Column(name = "fecha_nacimiento", length = 50)
    private LocalDate fecha_nacimiento;

    @Column(name="created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;
}
