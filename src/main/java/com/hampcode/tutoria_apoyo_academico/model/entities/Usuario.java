package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "email")
    private String email;

    private String password;

    @Column(name = "fecha_nacimiento", length = 50)
    private LocalDate fecha_nacimiento;

    @Column(name="created_at")
    private LocalDate cratedAt;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "update_at")
    private LocalDate updatedAt;


    @OneToOne(targetEntity = Tutor.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "tutor_id")
    private Tutor tutor;

    @OneToOne(targetEntity = Estudiante.class, fetch = FetchType.EAGER)
    @JoinColumn(nullable = false, name = "estudiante_id")
    private Estudiante estudiante;

}
