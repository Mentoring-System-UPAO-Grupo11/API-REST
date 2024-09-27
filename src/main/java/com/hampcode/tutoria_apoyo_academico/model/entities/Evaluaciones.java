package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "evaluaciones")
public class Evaluaciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "calificacion",nullable = false, length = 5)
    private int calificacion;

    @Column(name = "comentarios", columnDefinition = "TEXT")
    private String comentarios;

    @ManyToOne
    @JoinColumn(name = "sesion_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_evaluaciones_sesion"))
    private Sesion sesion;
}
