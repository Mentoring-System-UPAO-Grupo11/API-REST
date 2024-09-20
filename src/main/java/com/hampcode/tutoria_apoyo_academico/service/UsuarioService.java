package com.hampcode.tutoria_apoyo_academico.service;

import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioService {
    List<UsuarioDTO> getAllUsers();

    Usuario createUsuario(UsuarioResDTO userResDTO);
    Usuario updateUsuario(Integer usuarioId, UsuarioResDTO usuarioDTO);
    Optional<Usuario> findByEmail(String email);


}
