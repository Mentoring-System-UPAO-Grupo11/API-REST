package com.hampcode.tutoria_apoyo_academico.domain.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "busquedas")
public class Busquedas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "terminos",nullable = false, columnDefinition = "TEXT")
    private String terminos;

    @Column(name = "resultados",nullable = false, columnDefinition = "TEXT")
    private String resultados;

    @ManyToOne
    @JoinColumn(name = "usuario_id", referencedColumnName = "id"
            , foreignKey = @ForeignKey(name = "FK_busqueda_usuarios"))
    Usuario usuario;
}
