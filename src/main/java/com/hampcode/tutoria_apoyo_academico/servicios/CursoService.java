package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.CursoRepository;
import com.hampcode.tutoria_apoyo_academico.entidades.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.*;

@Service
public class CursoService {

    @Autowired
    CursoRepository cursoRepository;

    public ResponseEntity<String> registrarCursoGeneral(Curso curso) {
        cursoRepository.save(curso);
        return ResponseEntity.ok("Curso registrado de manera global");
    }
}
