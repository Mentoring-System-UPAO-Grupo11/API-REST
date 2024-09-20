package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "estado", nullable = false, length = 50)
    private String estado;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "metodo_pago", nullable = false, length = 50)
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name = "sesion_id", nullable = false)
    private Sesion sesion;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false) // Relación con Estudiante agregada
    private Estudiante estudiante;
}


