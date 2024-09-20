package com.grupo11.repository;

import com.grupo11.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // Método para verificar si un email ya está registrado
    boolean existsByEmail(String email);
}
