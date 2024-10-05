package com.hampcode.tutoria_apoyo_academico.repositorios;

import com.hampcode.tutoria_apoyo_academico.entidades.PermisoUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PermisoUsuarioRepository extends JpaRepository<PermisoUsuario, Long> {

    List<PermisoUsuario> findByUsuarioId(Long usuarioId);
}