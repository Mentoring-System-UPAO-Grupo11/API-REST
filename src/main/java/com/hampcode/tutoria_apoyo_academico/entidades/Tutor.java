package com.hampcode.tutoria_apoyo_academico.entidades;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;

@Entity
@Data
public class Tutor extends Usuario {

    @Column(name = "especialidad", columnDefinition = "TEXT")
    private String especialidad;

    @Column(name = "popularidad", length = 50)
    private Float popularidad;
    @Column
    private Float tarifa;
    @Column
    private boolean esParticular;

    //    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
//    private Usuario usuario;
    // Relación uno a muchos con Reseña
    @JsonIgnore
    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
    private List<Resena> reseñas;

    @JsonIgnore
    @OneToMany(mappedBy = "tutor", cascade = CascadeType.ALL)
    private List<CursoTutor> cursos = new ArrayList<>();

    public Tutor() {
    }

    public Tutor(String especialidad, Float popularidad, Float tarifa, boolean esParticular,
                 String nombre, String email, String password, LocalDate fecha_nacimiento,
                 LocalDate createdAt, LocalDate updatedAt) {
        super(nombre, email, password, fecha_nacimiento, createdAt, updatedAt);
        this.especialidad = especialidad;
        this.popularidad = popularidad;
        this.tarifa = tarifa;
        this.esParticular = esParticular;
    }

}
