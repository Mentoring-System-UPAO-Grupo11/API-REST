package com.hampcode.tutoria_apoyo_academico.domain.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hampcode.tutoria_apoyo_academico.domain.enums.Role;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
@Data
@Entity
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id = 0;

    @Column(name = "nombre",nullable = false, length = 50)
    private String nombre;

    private String email;

    private String contraseña;

    @Column(unique = true,nullable = false)
    private String tipo; //TUTOR O ESTUDIANTE

    @Column(name = "fecha_nacimiento",nullable = false, length = 50)
    private LocalDate fecha_nacimiento;

    @Column(name="created_at" ,nullable = false)
    private LocalDate cratedAt;

    @Column(name = "update_at")
    private LocalDate updatedAt;

    /*@JsonIgnore
    @OneToOne
            @JoinColumn(name = "estudiante_id", referencedColumnName = "id"
                    , foreignKey = @ForeignKey(name = "FK_usuario_estudiante"))
    Estudiante estudiante = null;

    @JsonIgnore
    @OneToOne
            @JoinColumn(name = "tutor_id", referencedColumnName = "id"
                    , foreignKey = @ForeignKey(name = "FK_usuario_tutor"))
    Tutor tutor = null;*/

    @Enumerated(EnumType.STRING)
            @Column(name = "role")
    Role role;
}
