package com.hampcode.tutoria_apoyo_academico.entidades;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter@Setter
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String dia; // Ejemplo: Lunes, Martes, etc.
    @Column
    private String aula;
    @Column
    private LocalDate fecha;

    @Column
    private LocalTime horaInicio; // Ejemplo: 09:00:00

    @Column
    private LocalTime horaFin; // Ejemplo: 10:00:00

    @Column
    private boolean disponible;

    @ManyToOne
    @JoinColumn(name = "curso_id") // Clave foránea a Curso
    @JsonIgnore
    private CursoTutor curso;

    public Horario() {

    }

    public Horario(String dia, String aula, LocalTime horaInicio, LocalTime horaFin, boolean b, CursoTutor cursoTutorEncontrado,LocalDate fecha) {
        this.dia = dia;
        this.aula = aula;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.disponible = b;
        this.curso = cursoTutorEncontrado;
        this.fecha=fecha;
    }

}
