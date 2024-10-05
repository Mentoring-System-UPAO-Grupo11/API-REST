package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.dto.PermisoUsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.PermisoUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hampcode.tutoria_apoyo_academico.repositorios.PermisoRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.PermisoUsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.entidades.Permiso;
import com.hampcode.tutoria_apoyo_academico.entidades.PermisoUsuario;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import java.util.List;

@Service
public class PermisoUsuarioService {


    @Autowired
    private PermisoUsuarioRepository permisoUsuarioRepository;

    @Autowired
    private UsuarioRepository usuarioRepository; // Asegúrate de tener este repositorio
    @Autowired
    private PermisoRepository permisoRepository; // Asegúrate de tener este repositorio


    public void actualizarPermisos(Long id, List<Long> permisoIds) {
        // Paso 1: Eliminar todos los permisos existentes del usuario
        List<PermisoUsuario> permisosExistentes = permisoUsuarioRepository.findByUsuarioId(id);
        permisoUsuarioRepository.deleteAll(permisosExistentes);

        // Paso 2: Asignar nuevos permisos al usuario
        for (Long permisoId : permisoIds) {
            Permiso permiso = permisoRepository.findById(permisoId)
                    .orElseThrow(() -> new RuntimeException("Permiso no encontrado: " + permisoId));

            PermisoUsuario nuevoPermisoUsuario = new PermisoUsuario();
            nuevoPermisoUsuario.setUsuario(usuarioRepository.findById(id.intValue())
                    .orElseThrow(() -> new RuntimeException("Usuario no encontrado: " + id)));
            nuevoPermisoUsuario.setPermiso(permiso);

            // Paso 3: Guardar el nuevo PermisoUsuario
            permisoUsuarioRepository.save(nuevoPermisoUsuario);
    }
    }
    public PermisoUsuario buscarPorId(Long id) {
        return permisoUsuarioRepository.findById(id).orElse(null);
    }

    public PermisoUsuario crearPermisoUsuario(PermisoUsuarioDTO permisoUsuarioDTO) {

        System.out.println("PERMISOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO");
        Usuario usuario = usuarioRepository.findById(permisoUsuarioDTO.getIdUsuario().intValue())
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));

        Permiso permiso = permisoRepository.findById(permisoUsuarioDTO.getIdPermiso())
                .orElseThrow(() -> new RuntimeException("Permiso no encontrado"));

        PermisoUsuario permisoUsuario = new PermisoUsuario(usuario, permiso);
        return permisoUsuarioRepository.save(permisoUsuario);
    }
}

