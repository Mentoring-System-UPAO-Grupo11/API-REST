package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.servicios.HorarioService;
import com.hampcode.tutoria_apoyo_academico.dto.HorarioDTO;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/horario")
public class HorarioController {



    @Autowired
    HorarioService horarioService;

    @PostMapping("/registrarHorarioACurso/{idTutorCurso}")
    public ResponseEntity<String> registrarHorarioACurso(@RequestBody HorarioDTO horarioDTO,@PathVariable int idTutorCurso){

        return horarioService.registrarHorarioAlCursoDel(horarioDTO, idTutorCurso);
    }
}

