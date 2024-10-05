package com.hampcode.tutoria_apoyo_academico.entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
//@DiscriminatorValue("ESTUDIANTE")
public class Estudiante extends Usuario {

    @Column(name = "intereses", length = 50)
    private String intereses_academicos;

    @Column(name = "preferencias", length = 50)
    private String preferencias;

    @Column(name = "historial_academico", columnDefinition = "TEXT")
    private String historial_academico;

    @OneToMany(mappedBy = "estudiante", cascade = CascadeType.ALL)
//    @JsonBackReference // Indica que este es el lado "de respaldo" de la relación
    private List<Resena> reseñas;

    public Estudiante() {
    }

    public Estudiante(String intereses_academicos, String preferencias, String historial_academico, String nombre, String email, String password, LocalDate fecha_nacimiento, LocalDate createdAt, LocalDate updatedAt) {
        super(nombre, email, password, fecha_nacimiento, createdAt, updatedAt);
        this.intereses_academicos = intereses_academicos;
        this.preferencias = preferencias;
        this.historial_academico = historial_academico;
    }


}
