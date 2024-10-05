package com.hampcode.tutoria_apoyo_academico.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;
import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter@Setter
@NoArgsConstructor
public class UsuarioDTO {
    private String nombre;
    private String email;
    private String password;
    private LocalDate fecha_nacimiento;
    private LocalDate createdAt;
    private Perfil perfil;
}