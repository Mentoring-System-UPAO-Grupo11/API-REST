package com.hampcode.tutoria_apoyo_academico.dto;

import lombok.Getter;
import lombok.Setter;


@Getter@Setter
public class RegistrarResenaDTO {

    private String contenido;
    private int calificacion;
    private Long estudianteId; // Puedes incluir el ID del estudiante
    private Long tutorId; // Puedes incluir el ID del tutor

    public RegistrarResenaDTO(String contenido, int calificacion, Long estudianteId, Long tutorId) {

        this.contenido = contenido;
        this.calificacion = calificacion;
        this.estudianteId = estudianteId;
        this.tutorId = tutorId;
    }



}

