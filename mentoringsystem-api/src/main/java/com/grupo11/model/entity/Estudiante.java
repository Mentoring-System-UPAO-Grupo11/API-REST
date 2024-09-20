package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "estudiante")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nivel_estudio", nullable = false, length = 255)
    private String nivelEstudio;

    @OneToMany(mappedBy = "estudiante")
    private List<Reseña> reseñas;

    @OneToMany(mappedBy = "estudiante")
    private List<Reserva> reservas;

    @OneToMany(mappedBy = "estudiante")
    private List<Asistencia> asistencias;

    @OneToMany(mappedBy = "estudiante")
    private List<Pago> historialTransacciones; // Relación correcta con Pago

    @OneToMany(mappedBy = "estudiante")
    private List<ReporteRendimiento> reportesRendimiento;

    @ManyToMany
    @JoinTable(
            name = "favoritos",
            joinColumns = @JoinColumn(name = "estudiante_id"),
            inverseJoinColumns = @JoinColumn(name = "tutor_id")
    )
    private List<Tutor> favoritos;
}


