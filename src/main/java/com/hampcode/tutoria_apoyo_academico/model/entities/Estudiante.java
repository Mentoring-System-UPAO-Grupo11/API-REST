package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "estudiante")
public class Estudiante{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "intereses", length = 50)
    private String intereses_academicos;

    @Column(name = "preferencias", length = 50)
    private String preferencias;

    @Column(name = "historial_academico",columnDefinition = "TEXT")
    private String historial_academico;

}
