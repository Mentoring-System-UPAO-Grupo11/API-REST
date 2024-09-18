package com.hampcode.tutoria_apoyo_academico.domain.entities;

import com.hampcode.tutoria_apoyo_academico.domain.enums.Role;
import jakarta.persistence.*;



@Entity
@DiscriminatorValue("ESTUDIANTE")
public class Estudiante extends Usuario {

    @Column(name = "intereses", length = 50)
    private String intereses_academicos;

    @Column(name = "preferencias", length = 50)
    private String preferencias;

    @Column(name = "historial_academico",columnDefinition = "TEXT")
    private String historial_academico;


    /*@OneToOne
            @JoinColumn(name = "usuario_id", referencedColumnName = "id"
                    , foreignKey = @ForeignKey(name = "FK_estudiante_usuario"))
    Usuario usuario;*/
//

}
