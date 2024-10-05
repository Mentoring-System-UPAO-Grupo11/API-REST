package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.PermisoRepository;
import com.hampcode.tutoria_apoyo_academico.entidades.Permiso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class PermisoService {
    @Autowired
    private PermisoRepository permisoRepository;

    public Permiso crearPermiso(Permiso permiso) {
        return permisoRepository.save(permiso);
    }
}
