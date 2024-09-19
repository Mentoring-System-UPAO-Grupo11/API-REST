package com.hampcode.tutoria_apoyo_academico.api;

import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;

public class UsuarioController {
    /*@Autowired
    private UsuarioService userService;

    private LoginRequestDTO loginRequestDTO;
    @Autowired
    private ProfileService profileService;
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody UserRequestDTO userRequestDTO) {
        try {
            userService.createUser(userRequestDTO);
            return new ResponseEntity<>("Cuenta creada con éxito", HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        try {
            List<UserResponseDTO> users = userService.getAllUsers();
            return new ResponseEntity<>(users, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>("Error al obtener la lista de usuarios", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateUser(@PathVariable("id") Integer id, @RequestBody UserRequestDTO userRequestDTO) {
        try {
            userService.updateUser(id, userRequestDTO);
            return new ResponseEntity<>("Usuario actualizado con éxito", HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id) {
        try {
            userService.deleteUser(id);
            return new ResponseEntity<>("Usuario eliminado con éxito", HttpStatus.NO_CONTENT);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>("Error interno del servidor", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }*/
}
