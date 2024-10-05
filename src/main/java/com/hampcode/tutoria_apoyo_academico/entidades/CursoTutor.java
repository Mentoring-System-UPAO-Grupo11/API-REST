package com.hampcode.tutoria_apoyo_academico.entidades;


import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CursoTutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int totalCupos;

    @Column
    private int alumnosInscritos;

    @ManyToOne // Cambiado de @OneToOne a @ManyToOne
    @JoinColumn(name = "curso_id") // Clave foránea que referencia a Curso
    private Curso curso;

    @ManyToOne
    @JoinColumn(name = "tutor_id") // Clave foránea a Tutor
    private Tutor tutor;

    // Relación con Horario
    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    private List<Horario> horarios = new ArrayList<>();

    //    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
//    private List<Horario> horarios = new ArrayList<>();
    public CursoTutor() {
    }

    public CursoTutor(int totalCupos, int alumnosInscritos, Curso curso, Tutor tutor) {
        this.totalCupos = totalCupos;
        this.alumnosInscritos = alumnosInscritos;
        this.curso = curso;
        this.tutor = tutor;
    }
}

