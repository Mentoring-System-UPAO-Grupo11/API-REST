package com.hampcode.tutoria_apoyo_academico.service;

import com.hampcode.tutoria_apoyo_academico.model.dto.ResenaDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Resena;
import com.hampcode.tutoria_apoyo_academico.repository.ResenaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ResenaService {
    private final ResenaRepository resenaRepository;

    public ResenaService(ResenaRepository resenaRepository) {
        this.resenaRepository = resenaRepository;
    }

    public List<ResenaDTO> obtenerTodasLasResenas() {
        return resenaRepository.findAll().stream()
                .map(resena -> {
                    ResenaDTO dto = new ResenaDTO();
                    dto.setCalificacion(resena.getCalificacion());
                    dto.setComentario(resena.getComentario());
                    dto.setAutor(resena.getAutor().getNombre());
                    dto.setTutor(resena.getTutor().getNombre());
                    return dto;
                }).collect(Collectors.toList());
    }
}
