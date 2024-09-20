package com.grupo11.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;
}

