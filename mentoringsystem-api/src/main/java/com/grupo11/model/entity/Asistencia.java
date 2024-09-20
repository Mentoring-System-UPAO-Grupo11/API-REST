package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "asistencia")
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "fecha_asistencia", nullable = false)
    private LocalDate fechaAsistencia;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "sesion_id", nullable = false)
    private Sesion sesion;
}


