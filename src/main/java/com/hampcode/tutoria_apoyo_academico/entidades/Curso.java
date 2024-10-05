package com.hampcode.tutoria_apoyo_academico.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author Usuario
 */
@Entity
@Getter
@Setter
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nrc;

    @Column
    private String nombreCurso;

    @Column
    private String lineaCurso;

    @Column
    private boolean electivo;

    @Column
    private int nroCreditos;

    @Column
    private int ciclo;

    @OneToMany(mappedBy = "curso") // Añade esta relación para la referencia inversa
    private Set<CursoTutor> cursoTutors;

    public Curso() {
    }

    public Curso(String nrc, String nombreCurso, String lineaCurso, boolean electivo, int nroCreditos, int ciclo) {
        this.nrc = nrc;
        this.nombreCurso = nombreCurso;
        this.lineaCurso = lineaCurso;
        this.electivo = electivo;
        this.nroCreditos = nroCreditos;
        this.ciclo = ciclo;
    }

}
