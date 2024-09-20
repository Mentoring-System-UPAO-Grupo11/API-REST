package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "reporte_rendimiento")
public class ReporteRendimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "calificacion", nullable = false)
    private Double calificacion;

    @Column(name = "comentarios", length = 255)
    private String comentarios;

    @Column(name = "recomendaciones", length = 255)
    private String recomendaciones;

    @Column(name = "fecha_generacion", nullable = false)
    private LocalDate fechaGeneracion;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudiante;
}


