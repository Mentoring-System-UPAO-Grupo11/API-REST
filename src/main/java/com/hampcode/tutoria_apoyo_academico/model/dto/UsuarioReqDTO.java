package com.hampcode.tutoria_apoyo_academico.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioReqDTO {

    @NotNull(message = "El nombre no puede ser vacio")
    @Size(max = 100, message = "El nombre no puede exceder los 100 caracteres")
    private String nombre;
    @NotNull(message = "El tipo no puede ser vacio")
    @Size(max = 100, message = "El tipo no puede exceder los 100 caracteres")
    private String tipo;
    @Email(message = "Debe ser una dirección de correo electrónico con formato correcto")
    @Size(max = 100, message = "El correo electrónico no puede exceder los 100 caracteres")
    private String email;
    @NotBlank(message = "La contraseña no puede ir vacia")
    @Size(min = 6, max = 12, message = "La contraseña debe tener entre 6 y 12 caracteres")
    private String password;
    @NotBlank(message = "Deber ingresar una fecha de nacimiento")
    private LocalDate fecha_nacimiento;

}
