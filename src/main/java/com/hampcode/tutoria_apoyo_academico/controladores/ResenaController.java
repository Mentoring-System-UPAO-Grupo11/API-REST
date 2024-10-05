package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.servicios.ResenaService;
import com.hampcode.tutoria_apoyo_academico.dto.RegistrarResenaDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Resena;
import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/resena")
public class ResenaController {

    @Autowired
    ResenaService resenaService;


    @PostMapping("/registrarResena")
    public ResponseEntity<String> registrarResena(@RequestBody RegistrarResenaDTO registrarResenaDTO) {
        return resenaService.registrarReseña(registrarResenaDTO);
    }

    @GetMapping("/verReseñaPorDocente/{idDocente}")
    public ResponseEntity<List<Resena>> visualizarReseñasPorTutor(@PathVariable int idDocente){
        return resenaService.visualizarReseñasPorTutor(idDocente);
    }

}

