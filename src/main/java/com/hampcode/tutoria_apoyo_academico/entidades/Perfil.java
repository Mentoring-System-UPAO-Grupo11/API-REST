package com.hampcode.tutoria_apoyo_academico.entidades;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String fotoPerfil;
    @Column
    private String preferencias;
    @Column
    private boolean fondoOscuro;


    @OneToOne()
    @JoinColumn(name="usuario_id")
    private Usuario usuario;


    public Perfil(String fotoPerfil, String preferencias, boolean fondoOscuro,Usuario usuario) {
        this.fotoPerfil = fotoPerfil;
        this.preferencias = preferencias;
        this.fondoOscuro = fondoOscuro;
        this.usuario=usuario;
    }
}
