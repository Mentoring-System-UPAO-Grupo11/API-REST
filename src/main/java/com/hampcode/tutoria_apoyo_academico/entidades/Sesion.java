package com.hampcode.tutoria_apoyo_academico.entidades;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
@Table(name = "sesiones")
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double precio;

    @Column(name = "fecha",nullable = false, length = 50)
    private LocalDate fecha;

    @Column(name = "duracion",nullable = false, length = 50)
    private int duracion;

    @Column(name = "tema",nullable = false, length = 50)
    private String tema;

    @Column(name = "estado",nullable = false, length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "tutor_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_sesion_tutor"))
    Tutor tutor;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_sesion_estudiante"))
    Estudiante estudiante;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "paquete_sesiones_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_sesion_paquete"))
    PaqueteSesiones paqueteSesiones;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "pagos_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_sesion_pagos"))
    Pagos pagos;
}
