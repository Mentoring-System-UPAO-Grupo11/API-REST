package com.hampcode.tutoria_apoyo_academico.api;

import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    private UsuarioService userService;

    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UsuarioResDTO userResDTO) {
        try {
            userService.createUsuario(userResDTO);
            return new ResponseEntity<>("Cuenta creada con éxito", HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") Integer id, @RequestBody UsuarioResDTO userResDTO) {
        try {
            userService.updateUsuario(id, userResDTO);
            return new ResponseEntity<>("Usuario actualizado con éxito", HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
}
