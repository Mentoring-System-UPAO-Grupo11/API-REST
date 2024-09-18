package com.hampcode.tutoria_apoyo_academico.domain.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@DiscriminatorValue("TUTOR")
@Table(name = "tutor")
public class Tutor extends Usuario{


    @Column(name = "especialidad", columnDefinition = "TEXT")
    private String especialidad;

    @Column(name = "disponibilidad", length = 50)
    private String disponibilidad;

    @Column(name = "tarifa",nullable = false, length = 20)
    private double tarifa;


    @OneToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id"
    , foreignKey = @ForeignKey(name = "FK_tutor_usuario"))
    Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "favoritos_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_tutor_favoritos"))
    Favoritos favoritos;

}
