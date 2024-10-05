package com.hampcode.tutoria_apoyo_academico.entidades;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "paquete_sesiones")
public class PaqueteSesiones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "contenido", columnDefinition = "TEXT")
    private String contenido;

//    @OneToMany(mappedBy = "paqueteSesiones", cascade = CascadeType.ALL)
//    private List<Sesion> sesiones;
//
//    @ManyToOne
//    @JoinColumn(name = "pagos_id", referencedColumnName = "id"
//            , foreignKey = @ForeignKey(name = "FK_paquete_pagos"))
//    private Pagos pagoss;
}
