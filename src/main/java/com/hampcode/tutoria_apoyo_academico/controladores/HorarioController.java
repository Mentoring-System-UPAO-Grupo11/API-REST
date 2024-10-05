package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.entidades.Horario;
import com.hampcode.tutoria_apoyo_academico.servicios.HorarioService;
import com.hampcode.tutoria_apoyo_academico.dto.HorarioDTO;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@RestController
@RequestMapping("/horario")
public class HorarioController {



    @Autowired
    HorarioService horarioService;

    @PostMapping("/registrarHorarioACurso/{idTutorCurso}")
    public ResponseEntity<String> registrarHorarioACurso(@RequestBody HorarioDTO horarioDTO,@PathVariable int idTutorCurso){

        return horarioService.registrarHorarioAlCursoDel(horarioDTO, idTutorCurso);
    }

    //CONSULTA PARA OBTENER LOS HORARIOS DISPONIBLES
    @GetMapping("/disponibles")
    public List<Horario> obtenerHorariosDisponibles(
            @RequestParam("fecha") String fechaString,
            @RequestParam("hora") String horaString) {

        LocalDate fecha = LocalDate.parse(fechaString); // Convertir la fecha desde el parámetro
        LocalTime hora = LocalTime.parse(horaString);   // Convertir la hora desde el parámetro

        return horarioService.obtenerHorariosDisponibles(fecha, hora);
    }
}

