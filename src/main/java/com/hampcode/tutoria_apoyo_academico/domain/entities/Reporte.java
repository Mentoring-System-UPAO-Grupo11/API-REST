package com.hampcode.tutoria_apoyo_academico.domain.entities;

import com.hampcode.tutoria_apoyo_academico.domain.enums.ReporteStatus;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;
import java.util.List;

@Data
@Entity
@Table(name = "reportes")
public class Reporte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calificacion",nullable = false, length = 10)
    private int calificacion;

    @Column(name = "comentario",nullable = false, columnDefinition = "TEXT")
    private String comentario;

    @Column(name = "asistencia",nullable = false, columnDefinition = "TEXT")
    private String asistencia;

    @ManyToOne
    @JoinColumn(name = "tutor_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_reporte_tutor"))
    Tutor tutor;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_reporte_estudiante"))
    Estudiante estudiante;
}
