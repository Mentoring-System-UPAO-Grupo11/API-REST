package com.hampcode.tutoria_apoyo_academico.entidades;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Permiso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private boolean puedeCrear;
    private boolean puedeLeer;
    private boolean puedeActualizar;
    private boolean puedeEliminar;
    private boolean puedeAsignar;
    private boolean puedeExportar;
    private boolean puedeImportar;

    // Constructores
    public Permiso() {
    }
    public Permiso(String nombre, String descripcion, boolean puedeCrear, boolean puedeLeer, boolean puedeActualizar, boolean puedeEliminar, boolean puedeAsignar, boolean puedeExportar, boolean puedeImportar) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.puedeCrear = puedeCrear;
        this.puedeLeer = puedeLeer;
        this.puedeActualizar = puedeActualizar;
        this.puedeEliminar = puedeEliminar;
        this.puedeAsignar = puedeAsignar;
        this.puedeExportar = puedeExportar;
        this.puedeImportar = puedeImportar;
    }
}
// Getters y Set
