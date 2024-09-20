package com.hampcode.tutoria_apoyo_academico.service.impl;

import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import com.hampcode.tutoria_apoyo_academico.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl {


    private UsuarioRepository usuarioRepository;

    public Optional<Usuario> findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public Usuario createUser(UsuarioResDTO usuarioResDTO) {
        if (usuarioRepository.findByEmail(usuarioResDTO.getEmail()).isPresent()) {
            throw new RuntimeException("El correo ya está en uso");
        } Usuario user = usuarioMapper.convertToEntity(usuarioResDTO);
        return usuarioRepository.save(user);
    }
}
