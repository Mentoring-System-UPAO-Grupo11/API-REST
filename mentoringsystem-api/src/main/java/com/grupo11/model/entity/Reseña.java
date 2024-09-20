package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "resena")
public class Reseña {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calificacion", nullable = false)
    private int calificacion;

    @Column(name = "comentario", nullable = false, length = 500)
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false) // Relación con Estudiante
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false) // Relación con Tutor
    private Tutor tutor;
}

