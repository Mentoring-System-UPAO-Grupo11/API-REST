package com.grupo11.service.impl;

import com.grupo11.dto.UsuarioDTO;
import com.grupo11.model.entity.Usuario;
import com.grupo11.repository.UsuarioRepository;
import com.grupo11.service.UsuarioService;
import com.grupo11.exception.ResourceNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UsuarioServiceImpl implements UsuarioService {

    private final UsuarioRepository usuarioRepository;

    @Override
    public Usuario registrar(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setContrasena(usuarioDTO.getContraseña());
        usuario.setRol(usuarioDTO.getRol());
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario findById(Long id) {
        return usuarioRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Usuario no encontrado"));
    }

    @Override
    public List<Usuario> getAll() {
        return usuarioRepository.findAll();
    }

    @Override
    public Usuario update(Long id, UsuarioDTO usuarioDTO) {
        Usuario usuario = findById(id);
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setContrasena(usuarioDTO.getContraseña());
        usuario.setRol(usuarioDTO.getRol());
        return usuarioRepository.save(usuario);
    }

    @Override
    public void delete(Long id) {
        Usuario usuario = findById(id);
        usuarioRepository.delete(usuario);
    }
}

