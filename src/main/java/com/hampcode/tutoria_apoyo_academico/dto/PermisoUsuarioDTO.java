package com.hampcode.tutoria_apoyo_academico.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PermisoUsuarioDTO {
    private Long idUsuario;
    private Long idPermiso;

    public PermisoUsuarioDTO(Long idUsuario, Long idPermiso) {
        this.idUsuario = idUsuario;
        this.idPermiso = idPermiso;
    }



}
