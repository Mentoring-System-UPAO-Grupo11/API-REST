package com.hampcode.tutoria_apoyo_academico.repositorios;

import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepositorio extends JpaRepository<Perfil, Integer> {

}