package com.hampcode.tutoria_apoyo_academico.model.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "favoritos")
public class Favoritos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "estudiante_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_favoritos_estudiante"))
    private Estudiante estudiante;

    @OneToMany(mappedBy = "favoritos", cascade = CascadeType.ALL)
    private List<Tutor> tutores;
}
