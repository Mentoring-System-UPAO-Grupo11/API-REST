package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.servicios.CursoTutorService;
import com.hampcode.tutoria_apoyo_academico.dto.CursoTutorDTO;
import org.eclipse.angus.mail.iap.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cursoTutor")
public class    CursoTutorController {

    @Autowired
    private CursoTutorService cursoTutorService;

    @PostMapping("/agregarCursoATutor/{idTutor}")
    public ResponseEntity<String> agregarCursoATutor(@RequestBody CursoTutorDTO cursoTutorDTO,@PathVariable int idTutor){
        return cursoTutorService.agregarCursoaTutor(cursoTutorDTO, idTutor);
    }

}

