package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@Entity
@Table(name = "sesion")
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "hora", nullable = false)
    private LocalTime hora;

    @Column(name = "duracion", nullable = false)
    private Integer duracion;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false)
    private Tutor tutor;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;

    @OneToMany(mappedBy = "sesion")
    private List<MaterialEducativo> materiales;

    @OneToMany(mappedBy = "sesion")
    private List<Asistencia> asistencias;
}

