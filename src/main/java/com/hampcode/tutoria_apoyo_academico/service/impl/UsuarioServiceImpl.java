package com.hampcode.tutoria_apoyo_academico.service.impl;

import com.hampcode.tutoria_apoyo_academico.mapper.UsuarioMapper;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioReqDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import com.hampcode.tutoria_apoyo_academico.repository.UsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioMapper usuarioMapper;
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario getUserbyId(Integer userId) {
        return usuarioRepository.findById(userId).orElse(null);
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    @Override
    public List<UsuarioResDTO> getAllUsers() {
        List<Usuario> users = usuarioRepository.findAll();
        return usuarioMapper.convertToListDTO(users);
    }





    @Override
    public Usuario createUsuario(UsuarioReqDTO usuarioReqDTO) {
        if (usuarioRepository.findByEmail(usuarioReqDTO.getEmail()).isPresent()) {
            throw new RuntimeException("El correo ya está en uso");
        } Usuario usuario = usuarioMapper.convertToEntity(usuarioReqDTO);
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario updateUsuario(Integer usuarioId, UsuarioReqDTO usuarioDTO) {
        Usuario user1 = getUserbyId(usuarioId);

        if (user1 == null) {
            throw new RuntimeException("Usuario no encontrado");
        }
        if (usuarioDTO.getNombre() != null) user1.setNombre(usuarioDTO.getNombre());
        if (usuarioDTO.getEmail() != null) user1.setEmail(usuarioDTO.getEmail());
        if (usuarioDTO.getPassword() != null) user1.setPassword(usuarioDTO.getPassword());
        if (usuarioDTO.getFecha_nacimiento() != null) user1.setFecha_nacimiento(usuarioDTO.getFecha_nacimiento());

        return usuarioRepository.save(user1);
    }
}
