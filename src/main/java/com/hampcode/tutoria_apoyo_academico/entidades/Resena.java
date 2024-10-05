package com.hampcode.tutoria_apoyo_academico.entidades;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Usuario
 */
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hampcode.tutoria_apoyo_academico.entidades.Estudiante;
import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Resena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String contenido;

    private int calificacion; // Por ejemplo, de 1 a 5

    @ManyToOne
    @JoinColumn(name = "estudiante_id", nullable = false)
//     @JsonManagedReference // Indica que este es el lado "administrado" de la relación
    private Estudiante estudiante;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "tutor_id", nullable = false)
    private Tutor tutor;
    // Otros atributos y métodos


}