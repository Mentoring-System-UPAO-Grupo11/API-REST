package com.hampcode.tutoria_apoyo_academico.dto;

import com.hampcode.tutoria_apoyo_academico.entidades.CursoTutor;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class HorarioDTO {

    private String dia; // Ejemplo: Lunes, Martes, etc.
    private String aula;
    private LocalDate fecha;
    private LocalTime horaInicio; // Ejemplo: 09:00:00
    private LocalTime horaFin; // Ejemplo: 10:00:00
    private boolean disponible;

    public HorarioDTO(String dia, String aula, LocalDate fecha, LocalTime horaInicio, LocalTime horaFin, boolean disponible) {
        this.dia = dia;
        this.aula = aula;
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponible = disponible;
    }

}
