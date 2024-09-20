package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import jdk.jfr.DataAmount;
import lombok.Data;

import java.util.*;
import java.util.Date;

@Entity
@Data
public class Resena {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double calificacion;
    private String comentario;
    private Date fecha;

    @ManyToOne
    private Estudiante autor;

    @ManyToOne
    private Tutor tutor;
}
