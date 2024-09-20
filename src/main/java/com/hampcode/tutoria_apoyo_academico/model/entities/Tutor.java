package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
//@DiscriminatorValue("TUTOR")
public class Tutor extends Usuario{

    @Column(name = "especialidad", columnDefinition = "TEXT")
    private String especialidad;

    @Column(name = "disponibilidad", length = 50)
    private String disponibilidad;

    private Float tarifa;

    @ManyToOne
    @JoinColumn(name = "favoritos_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_tutor_favoritos"))
    Favoritos favoritos;

}
