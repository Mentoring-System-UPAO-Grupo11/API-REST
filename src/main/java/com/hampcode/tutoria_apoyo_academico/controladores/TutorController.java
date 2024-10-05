package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import com.hampcode.tutoria_apoyo_academico.servicios.TutorService;
import com.hampcode.tutoria_apoyo_academico.dto.DatosTutorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @PostMapping("/registrarTutor/{idUsuario}")
    public ResponseEntity<String> registrarTutor(@RequestBody Tutor tutor, @PathVariable int idUsuario) {
        return tutorService.registrarTutor(tutor, idUsuario);
    }

    @PutMapping("/modificarDatos/{idTutor}")
    public ResponseEntity<String> modificarDatosTutor(@RequestBody DatosTutorDTO tutorDatos,@PathVariable int idTutor){
        return tutorService.modificarDatosTutor(tutorDatos,idTutor);
    }

    @GetMapping("/filtrar")
    public List<Tutor> filtrarTutoresPor(
            @RequestParam(required = false) Double tarifa,
            @RequestParam(required = false) String especialidad,
            @RequestParam(required = false) Double reseñasPromedio) {
        return tutorService.filtrarTutores(tarifa, especialidad, reseñasPromedio);
    }

    @GetMapping("/listarTodosLosTutores")
    public List<Tutor> obtenerTodosLosTutores() {
        return tutorService.findAll();
    }

}

