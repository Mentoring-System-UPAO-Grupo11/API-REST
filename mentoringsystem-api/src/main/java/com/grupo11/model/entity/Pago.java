package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "pago")
public class Pago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "monto", nullable = false)
    private Double monto;

    @Column(name = "metodo_pago", nullable = false, length = 50)
    private String metodoPago;

    @Column(name = "fecha_pago", nullable = false)
    private LocalDate fechaPago;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false) // Relación con Estudiante
    private Estudiante estudiante;

    @ManyToOne
    @JoinColumn(name = "notificacion_id", nullable = false)
    private Notificacion notificacion;
}



