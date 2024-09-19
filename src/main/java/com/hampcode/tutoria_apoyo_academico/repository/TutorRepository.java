package com.hampcode.tutoria_apoyo_academico.repository;

import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {

    List<Tutor> findByEspecialidad(String especialidad);

}
