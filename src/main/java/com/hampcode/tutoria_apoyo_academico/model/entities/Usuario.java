package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "email", unique = true, length = 50)
    private String email = "orlandop3789@gmail.com";

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "fecha_nacimiento", length = 50)
    private LocalDate fecha_nacimiento;

    @Column(name="created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "tutor_id", referencedColumnName = "id")
    private Tutor tutor;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "estudante_id", referencedColumnName = "id")
    private Estudiante estudiante;*/

}
