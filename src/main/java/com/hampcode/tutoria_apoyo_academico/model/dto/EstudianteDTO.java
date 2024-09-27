package com.hampcode.tutoria_apoyo_academico.model.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {
    private String nombre;

    private String email;

    private String password;

    private LocalDate fecha_nacimiento;

    private String intereses_academicos;

    private String preferencias;

    private String historial_academico;
}
