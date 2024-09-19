package com.grupo11.tutoria.model;

import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "material_educativo")
public class MaterialEducativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String tipo;
    private String rutaArchivo;
    private LocalDateTime fechaSubida;

    // Relación con Tutor si existe una entidad Tutor (opcional)
    @ManyToOne
    @JoinColumn(name = "tutor_id", referencedColumnName = "id")
    private Tutor tutor;
}
