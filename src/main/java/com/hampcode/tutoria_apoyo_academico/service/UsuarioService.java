package com.hampcode.tutoria_apoyo_academico.service;

import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioReqDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface UsuarioService {
    List<UsuarioResDTO> getAllUsers();

    Usuario createUsuario(UsuarioReqDTO usuarioReqDTO);
    Usuario updateUsuario(Integer usuarioId, UsuarioReqDTO usuarioDTO);
    Optional<Usuario> findByEmail(String email);


}
