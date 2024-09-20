package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "material_educativo")
public class MaterialEducativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "titulo", nullable = false, length = 255)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 255)
    private String descripcion;

    // En lugar de File, se puede usar un campo para almacenar el archivo como una URL o path
    @Column(name = "archivo", nullable = false)
    private String archivo;

    @Column(name = "fecha_subida", nullable = false)
    private LocalDate fechaSubida;

    @ManyToOne
    @JoinColumn(name = "tutor_id", nullable = false)
    private Tutor autor;

    @ManyToOne
    @JoinColumn(name = "sesion_id", nullable = false)
    private Sesion sesion;
}


