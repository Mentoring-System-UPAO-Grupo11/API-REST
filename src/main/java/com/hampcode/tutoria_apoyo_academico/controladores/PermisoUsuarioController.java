package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.entidades.PermisoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import com.hampcode.tutoria_apoyo_academico.repositorios.PermisoRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.PermisoUsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.servicios.PermisoUsuarioService;
import com.hampcode.tutoria_apoyo_academico.dto.ModificarPermisosDTO;
import com.hampcode.tutoria_apoyo_academico.dto.PermisoUsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.PermisoUsuario;
import com.hampcode.tutoria_apoyo_academico.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/permisos-usuarios")
public class PermisoUsuarioController {

    @Autowired
    private PermisoUsuarioService permisoUsuarioService;

    @Autowired
    private PermisoUsuarioRepository permisoUsuarioRepository;

    @Autowired
    private UsuarioRepository usuarioRepository; // Asegúrate de tener este repositorio
    @Autowired
    private PermisoRepository permisoRepository; // Asegúrate de tener este repositorio


    @PutMapping("/modificarPermiso/{id}")
    public ResponseEntity<String> modificarPermiso(@PathVariable Long id, @RequestBody ModificarPermisosDTO modificarPermisosDTO) {

        PermisoUsuario permisoUsuario = permisoUsuarioService.buscarPorId(id);
        if (permisoUsuario == null) {
            return ResponseEntity.notFound().build();
        }

        // Aquí puedes agregar lógica para actualizar los permisos
        List<Long> permisoIds = modificarPermisosDTO.getPermisoIds();

        permisoUsuarioService.actualizarPermisos(permisoUsuario.getId(), permisoIds);

        return ResponseEntity.ok("Permisos actualizados");
    }
}
