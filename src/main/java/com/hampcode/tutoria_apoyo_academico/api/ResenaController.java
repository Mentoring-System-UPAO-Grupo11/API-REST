package com.hampcode.tutoria_apoyo_academico.api;

import com.hampcode.tutoria_apoyo_academico.model.dto.ResenaDTO;
import com.hampcode.tutoria_apoyo_academico.service.ResenaService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resenas")
public class ResenaController {
    private final ResenaService resenaService;

    public ResenaController(ResenaService resenaService) {
        this.resenaService = resenaService;
    }

    @GetMapping
    public List<ResenaDTO> obtenerResenas() {
        return resenaService.obtenerTodasLasResenas();
    }
}