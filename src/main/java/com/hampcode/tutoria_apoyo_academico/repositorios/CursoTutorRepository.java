package com.hampcode.tutoria_apoyo_academico.repositorios;

import com.hampcode.tutoria_apoyo_academico.entidades.CursoTutor;
import com.hampcode.tutoria_apoyo_academico.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoTutorRepository extends JpaRepository<CursoTutor, Integer> {

}
