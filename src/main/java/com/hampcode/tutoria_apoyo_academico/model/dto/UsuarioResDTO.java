package com.hampcode.tutoria_apoyo_academico.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioResDTO {

    private String nombre;

    private String email;

    private String tipo;

    private String password;

    private LocalDate fecha_nacimiento;

    private LocalDate cratedAt;

    private LocalDate updatedAt;

}
