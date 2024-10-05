package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.*;
import com.hampcode.tutoria_apoyo_academico.dto.RegistrarResenaDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Estudiante;
import com.hampcode.tutoria_apoyo_academico.entidades.Resena;
import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ResenaService {

    @Autowired
    private ResenaRepository resenaRepository; // Repositorio para manejar operaciones de la base de datos

    @Autowired
    private EstudianteRepository estudianteRepository; // Repositorio para manejar estudiantes

    @Autowired
    private TutorRepository tutorRepository; // Repositorio para manejar tutores

    public ResponseEntity<String> registrarReseña(RegistrarResenaDTO registrarResenaDTO) {
        System.out.println("nuevaRseñaRESEÑAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println("SÑDLHSALKJDHLKSHDASLDHLKASDKLJASHDLSJADHASHDHASD");
        try {
            System.out.println("1CREANDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSDJASD");
            // 1. Validar si el estudiante existe
            Estudiante estudiante = estudianteRepository.findById(registrarResenaDTO.getEstudianteId().intValue())
                    .orElseThrow(() -> new IllegalArgumentException("Estudiante no encontrado"));
            System.out.println("2CREANDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSDJASD");
            // 2. Validar si el tutor existe
            Tutor tutor = tutorRepository.findById(registrarResenaDTO.getTutorId())
                    .orElseThrow(() -> new IllegalArgumentException("Tutor no encontrado"));

            System.out.println("3CREANDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSDJASD");
            // 3. Crear la nueva reseña
            Resena nuevaReseña = new Resena();
            nuevaReseña.setContenido(registrarResenaDTO.getContenido());
            nuevaReseña.setCalificacion(registrarResenaDTO.getCalificacion());
            nuevaReseña.setEstudiante(estudiante); // Asocia el estudiante
            nuevaReseña.setTutor(tutor); // Asocia el tutor
            System.out.println("TERMINANDOOODAOSDASOOSDOASODREANDOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOSDJASD");
            // 4. Guardar la reseña en la base de datos

            resenaRepository.save(nuevaReseña);

            // 5. Devolver respuesta exitosa
            return ResponseEntity.status(201).body("Reseña registrada con éxito");
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        } catch (Exception e) {
            System.out.println("ERRRRRRRRRRRRRRRRRRRRRRRRRRRRORRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRRR" + e.getMessage());
            return ResponseEntity.status(500).body("Error al registrar la reseña: " + e.getMessage());
        }
    }

    public ResponseEntity<List<Resena>> visualizarReseñasPorTutor(int idDocente) {
        return ResponseEntity.ok(resenaRepository.findByTutor_Id(idDocente));
    }
}
