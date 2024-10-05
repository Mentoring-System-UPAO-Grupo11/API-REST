package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.PerfilRepositorio;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.dto.UsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import java.util.Optional;
import org.eclipse.angus.mail.iap.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class PerfilService {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    PerfilRepositorio perfilRepositorio;

    public ResponseEntity<String> modificarPerfil(UsuarioDTO usuarioMod, int idUsuario) {

        Optional<Usuario> UsuarioEncontrado = usuarioRepository.findById(idUsuario);
        if (UsuarioEncontrado.isPresent()) {
            Usuario usuario = UsuarioEncontrado.get();
            usuario.setEmail(usuarioMod.getEmail());
            usuario.setFecha_nacimiento(usuarioMod.getFecha_nacimiento());
            usuario.setNombre(usuarioMod.getNombre());
            usuario.setPassword(usuarioMod.getPassword());

            // Actualizar el perfil si existe
            Perfil perfilExistente = usuario.getPerfil();
            if (perfilExistente != null) {
                // Actualizar datos del perfil existente
                perfilExistente.setFotoPerfil(usuarioMod.getPerfil().getFotoPerfil());
                perfilExistente.setPreferencias(usuarioMod.getPerfil().getPreferencias());
                perfilExistente.setFondoOscuro(usuarioMod.getPerfil().isFondoOscuro());
                // No necesitas asignar de nuevo el perfil, ya que ya está asociado al usuario
            } else {
                // Si no existe un perfil, puedes crear uno nuevo
                Perfil nuevoPerfil = usuarioMod.getPerfil();
                nuevoPerfil.setUsuario(usuario); // Asegúrate de asignar la relación
                usuario.setPerfil(nuevoPerfil);
            }
            usuarioRepository.save(usuario);
            return ResponseEntity.ok("Perfil modificado");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Usuario no encontrado");
        }
    }

}
