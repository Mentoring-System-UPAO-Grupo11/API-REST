package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.CursoRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.CursoTutorRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.TutorRepository;
import com.hampcode.tutoria_apoyo_academico.dto.CursoTutorDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Curso;
import com.hampcode.tutoria_apoyo_academico.entidades.CursoTutor;
import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CursoTutorService {

    @Autowired
    CursoTutorRepository cursoTutorRepository;
    @Autowired
    TutorRepository tutorRepository;
    @Autowired
    CursoRepository cursoRepository;

    public ResponseEntity<String> agregarCursoaTutor(CursoTutorDTO cursoTutor, int idTutor) {
        Optional<Tutor> optionalTutor = tutorRepository.findById((long) idTutor);
        Tutor tutorEncontrado = optionalTutor.get();
        Optional<Curso> optionalCurso = cursoRepository.findById(cursoTutor.getCursoId());
        Curso cursoEncontrado = optionalCurso.get();
        CursoTutor cursoTutor1 = new CursoTutor(cursoTutor.getTotalCupos(), cursoTutor.getAlumnosInscritos(), cursoEncontrado, tutorEncontrado);
        cursoTutorRepository.save(cursoTutor1);
        return ResponseEntity.ok("Curso agregado");

    }
}

