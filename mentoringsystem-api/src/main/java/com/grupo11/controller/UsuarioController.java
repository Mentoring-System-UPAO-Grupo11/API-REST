package com.grupo11.controller;

import com.grupo11.dto.UsuarioDTO;
import com.grupo11.model.entity.Usuario;
import com.grupo11.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    @PostMapping("/registrar")
    public ResponseEntity<Usuario> registrar(@RequestBody UsuarioDTO usuarioDTO) {
        Usuario usuario = usuarioService.registrar(usuarioDTO);
        return ResponseEntity.ok(usuario);
    }
}

