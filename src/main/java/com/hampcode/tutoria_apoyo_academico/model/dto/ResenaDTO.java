package com.hampcode.tutoria_apoyo_academico.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResenaDTO {
    private Double calificacion;
    private String comentario;
    private String autor;
    private String tutor;
}