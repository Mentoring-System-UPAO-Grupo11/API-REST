package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutor")
public class Tutor{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "especialidad", columnDefinition = "TEXT")
    private String especialidad;

    @Column(name = "disponibilidad", length = 50)
    private String disponibilidad;

    @Column(name = "tarifa",nullable = false, length = 20)
    private double tarifa;

    @ManyToOne
    @JoinColumn(name = "favoritos_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_tutor_favoritos"))
    Favoritos favoritos;

}
