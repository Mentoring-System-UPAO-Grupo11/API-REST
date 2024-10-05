
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

import java.util.Optional;

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
    @PostMapping("/recuperarContraseña")
    public ResponseEntity<String> recuperarContraseña(@RequestBody String email) {

        System.out.println("HOLAAAAA ESTAS EN recuperarContraseña");
        try {
            // Verificar si el correo existe
            Optional<Usuario> usuarioOpt = userService.buscarPorCorreo(email);

            if (usuarioOpt.isPresent()) {
                // Si el usuario existe, enviar el correo de recuperación

                System.out.println("SE ENCONTRO EL USUARIOOOOOOOOOOOOOOOOOOOOOOOOOOO");
                userService.enviarCorreoRecuperacion(usuarioOpt.get());
                return new ResponseEntity<>("Correo de recuperación enviado con éxito", HttpStatus.OK);
            } else {
                // Si el correo no existe, devolver un mensaje de error
                return new ResponseEntity<>("El correo no está registrado", HttpStatus.BAD_REQUEST);
            }
        } catch (RuntimeException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
            return new ResponseEntity<>("Error al intentar recuperar la contraseña", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
