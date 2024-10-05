package com.hampcode.tutoria_apoyo_academico.dto;

import java.util.List;

public class ModificarPermisosDTO {

    private List<Long> permisoIds;

    // Constructor
    public ModificarPermisosDTO() {
    }

    public ModificarPermisosDTO(List<Long> permisoIds) {
        this.permisoIds = permisoIds;
    }

    // Getters y Setters
    public List<Long> getPermisoIds() {
        return permisoIds;
    }

    public void setPermisoIds(List<Long> permisoIds) {
        this.permisoIds = permisoIds;
    }
}

