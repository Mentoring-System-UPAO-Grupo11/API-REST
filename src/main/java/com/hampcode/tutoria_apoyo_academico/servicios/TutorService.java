package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.especificaciones.TutorSpecificacions;
import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import com.hampcode.tutoria_apoyo_academico.repositorios.TutorRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import com.hampcode.tutoria_apoyo_academico.dto.DatosTutorDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Service
public class TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    @Autowired
    private UsuarioRepository usuarioRepository;

    public ResponseEntity<String> registrarTutor(Tutor tutorNuevo, int idUsuario) {

        Optional<Usuario> usuarioEncontrado = usuarioRepository.findById(idUsuario);

        if (usuarioEncontrado.isPresent()) {
            tutorRepository.save(tutorNuevo);
            return ResponseEntity
                    .ok("Tutor Registrado");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Usuario no encontrado");
        }
    }

    public ResponseEntity<String> registrarTutor(Tutor tutorNuevo) {
        tutorNuevo.setPerfil(new Perfil("fotoDefecto.png", null, false, tutorNuevo));
        tutorRepository.save(tutorNuevo);
        return ResponseEntity.ok("Tutor registrado ");
    }

    public List<Tutor> findAll() {
        return tutorRepository.findAll();
    }

    public List<Tutor> filtrarTutores(Double tarifa, String especialidad, Double reseñasPromedio) {
        Specification<Tutor> specification = Specification.where(null); // Especificación inicial vacía

        if (tarifa != null) {
            specification = specification.and(TutorSpecificacions.tarifaMenorOIgual(tarifa));
        }

        if (especialidad != null && !especialidad.isEmpty()) {
            specification = specification.and(TutorSpecificacions.especialidadIgualA(especialidad));
        }

        if (reseñasPromedio != null) {
            specification = specification.and(TutorSpecificacions.reseñasPromedioGreaterThanEqual(reseñasPromedio));
        }

        return tutorRepository.findAll(specification);
    }

    public ResponseEntity<String> modificarDatosTutor(DatosTutorDTO tutorDatos, int idTutor) {

        Optional<Tutor> optionalTutor = tutorRepository.findById((long) idTutor);
        Tutor tutorEncontrado = optionalTutor.get();
        tutorEncontrado.setTarifa(tutorDatos.getTarifa());
        tutorEncontrado.setEspecialidad(tutorDatos.getEspecialidad());
        tutorEncontrado.setPopularidad(tutorDatos.getPopularidad());
        tutorEncontrado.setTarifa(tutorDatos.getTarifa());
        tutorEncontrado.setEsParticular(tutorDatos.isEsParticular());
        usuarioRepository.save(tutorEncontrado);
        return ResponseEntity.ok("Datos actualizados");
    }

}
