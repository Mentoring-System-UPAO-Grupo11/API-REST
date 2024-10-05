
package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import com.hampcode.tutoria_apoyo_academico.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioControlador {

    @Autowired
    private UsuarioServicio userService;

    @PostMapping("/registrarUsuario")
    public ResponseEntity<String> registerUser(@RequestBody Usuario nuevoUsuario) {

        try {
            nuevoUsuario.setPerfil(new Perfil("fotoDefecto.png", null, false, nuevoUsuario));
            userService.registrarUsuario(nuevoUsuario);
            return new ResponseEntity<String>("Cuenta creada con éxito", HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
