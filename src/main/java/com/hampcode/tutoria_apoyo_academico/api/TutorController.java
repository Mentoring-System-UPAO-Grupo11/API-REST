package com.hampcode.tutoria_apoyo_academico.api;

import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import com.hampcode.tutoria_apoyo_academico.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tutores")
public class TutorController {

    @Autowired
    private TutorService tutorService;

    @GetMapping("/buscar")
    public ResponseEntity<List<Tutor>> buscarPorEspecialidad(@RequestParam String especialidad) {

        List<Tutor> tutores = tutorService.buscarPorEspecialidad(especialidad);

        System.out.println(tutores);

        if (tutores.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(tutores);
    }

    @GetMapping("/all")
    public List<Tutor> obtenerTodosLosTutores() {
        return tutorService.findAll();
    }


}
