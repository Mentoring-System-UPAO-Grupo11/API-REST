package com.grupo11.service;

import com.grupo11.dto.UsuarioDTO;
import com.grupo11.model.entity.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario registrar(UsuarioDTO usuarioDTO);
    Usuario findById(Long id);
    List<Usuario> getAll();
    Usuario update(Long id, UsuarioDTO usuarioDTO);
    void delete(Long id);
}
