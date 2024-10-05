package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.CursoTutorRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.HorarioRepository;
import com.hampcode.tutoria_apoyo_academico.dto.HorarioDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Curso;
import com.hampcode.tutoria_apoyo_academico.entidades.CursoTutor;
import com.hampcode.tutoria_apoyo_academico.entidades.Horario;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class HorarioService {



    @Autowired
    HorarioRepository horarioRepository;

    @Autowired
    CursoTutorRepository cursoTutorRepository;

    public ResponseEntity<String> registrarHorarioAlCursoDel(HorarioDTO horarioDTO,int idCursoTutor){

        Optional<CursoTutor> optionalCursoTutor=cursoTutorRepository.findById(idCursoTutor);
        CursoTutor cursoTutorEncontrado = optionalCursoTutor.get();
        Horario nuevoHorario =new Horario(horarioDTO.getDia(),horarioDTO.getAula(), horarioDTO.getHoraInicio(), horarioDTO.getHoraInicio(), true, cursoTutorEncontrado,horarioDTO.getFecha());
        horarioRepository.save(nuevoHorario);
        return ResponseEntity.ok("Horario registrado");
    }

    public List<Horario> obtenerHorariosDisponibles(LocalDate fecha, LocalTime hora) {
        System.out.println("fecha: " + fecha);
        System.out.println("hora: " + hora);

        List<Horario> horariosDisponibles = horarioRepository.findAvailableHorarios(fecha, hora);

        horariosDisponibles.forEach(item -> {
            System.out.println("Horario disponible: " + item);
        });

        return horariosDisponibles;
    }
}
