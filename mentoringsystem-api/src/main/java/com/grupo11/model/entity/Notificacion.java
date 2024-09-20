package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "notificacion")
public class Notificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "mensaje", nullable = false, length = 255)
    private String mensaje;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "tipo", nullable = false, length = 50)
    private String tipo;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}
