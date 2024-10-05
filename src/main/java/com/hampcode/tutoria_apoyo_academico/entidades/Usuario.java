package com.hampcode.tutoria_apoyo_academico.entidades;

import jakarta.persistence.*;
import lombok.Data;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "email", unique = true, length = 50)
    private String email;

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
