package com.hampcode.tutoria_apoyo_academico.domain.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.hampcode.tutoria_apoyo_academico.domain.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double monto;
    private LocalDate createdAt;

    @Enumerated(EnumType.STRING)
    @Column(name = "payment_status")
    private PaymentStatus paymentStatus;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "estudiante_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_pagos_estudiante"))
    private Estudiante estudiante;

    @OneToOne
    @JoinColumn(name = "sesion_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_pagos_sesion"))
    private Sesion sesion;

    @OneToMany(mappedBy = "pagos", cascade = CascadeType.ALL)
    private List<Sesion> sesiones;

    @OneToMany(mappedBy = "pagoss", cascade = CascadeType.ALL)
    private List<PaqueteSesiones> paquetesesiones;
}
