package com.hampcode.tutoria_apoyo_academico.entidades;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
//import com.hampcode.tutoria_apoyo_academico.Desearilizadores.UsuarioDeserializer;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Table(name = "usuario")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Setter
@DiscriminatorColumn(name = "tipo_usuario", discriminatorType = DiscriminatorType.STRING)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipoUsuario")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Estudiante.class, name = "E"),
        @JsonSubTypes.Type(value = Tutor.class, name = "T")
})
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "nombre", length = 50)
    private String nombre;

    @Column(name = "email", unique = true, length = 50)
    private String email;

    @Column(name = "password", length = 50)
    private String password;

    @Column(name = "fecha_nacimiento", length = 50)
    private LocalDate fecha_nacimiento;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "tokenContra")
    private String token;

    @Column(name = "updated_at")
    private LocalDate updatedAt;


    @Column(name = "tipo_usuario", insertable = false, updatable = false)
    private String tipoUsuario; // Campo discriminador

    @JsonIgnore
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<PermisoUsuario> permisos;

    //    @OneToOne(cascade = CascadeType.ALL)
    //    private Tutor tutor;
    //
    @JsonIgnore
    @OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Perfil perfil;

    public Usuario() {
    }

    public Usuario(String nombre, String email, String password, LocalDate fecha_nacimiento, LocalDate createdAt, LocalDate updatedAt) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fecha_nacimiento = fecha_nacimiento;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Usuario(String nombre, String email, String password, LocalDate fecha_nacimiento, LocalDate createdAt, LocalDate updatedAt, String tipoUsuario) {
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fecha_nacimiento = fecha_nacimiento;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.tipoUsuario = tipoUsuario;
    }

}
