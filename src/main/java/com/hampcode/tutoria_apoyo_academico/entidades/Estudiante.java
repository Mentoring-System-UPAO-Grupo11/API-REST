package com.hampcode.tutoria_apoyo_academico.entidades;

import jakarta.persistence.*;


@Entity
//@DiscriminatorValue("ESTUDIANTE")
public class Estudiante extends Usuario {

    @Column(name = "intereses", length = 50)
    private String intereses_academicos;

    @Column(name = "preferencias", length = 50)
    private String preferencias;

    @Column(name = "historial_academico",columnDefinition = "TEXT")
    private String historial_academico;

}
