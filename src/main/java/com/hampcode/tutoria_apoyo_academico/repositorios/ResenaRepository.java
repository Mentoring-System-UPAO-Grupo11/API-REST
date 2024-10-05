package com.hampcode.tutoria_apoyo_academico.repositorios;

import com.hampcode.tutoria_apoyo_academico.entidades.Resena;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface ResenaRepository extends JpaRepository<Resena, Long>{


    public List<Resena> findByTutor_Id(int idDocente);
}
