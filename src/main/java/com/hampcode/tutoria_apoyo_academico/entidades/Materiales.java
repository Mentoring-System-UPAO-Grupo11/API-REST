package com.hampcode.tutoria_apoyo_academico.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "materiales")
public class Materiales {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "tipo",nullable = false, length = 50)
    private String tipo;

    @Column(name = "descripcion", columnDefinition = "TEXT")
    private String descripcion;

    @Column(name = "enlace",nullable = false, length = 50)
    private String enlace;

//    @ManyToOne
//    @JoinColumn(name = "sesion_id", referencedColumnName = "id"
//            , foreignKey = @ForeignKey(name = "FK_materiales_sesion"))
//    private Sesion sesion;
}
