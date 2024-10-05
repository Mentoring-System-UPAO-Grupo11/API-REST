package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
    public class UsuarioServicio {

    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    private JavaMailSender mailSender;

    public void registrarUsuario(Usuario usuarioNuevo) {
        usuarioRepository.save(usuarioNuevo);
    }

    public Optional<Usuario> buscarPorCorreo(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public void enviarCorreoRecuperacion(Usuario usuario) {
        // Generar un token de recuperación (opcional)
        String token = generarTokenRecuperacion(usuario); // Implementa este método según tu lógica
        // Crear el mensaje de correo
        SimpleMailMessage mensaje = new SimpleMailMessage();
        mensaje.setTo(usuario.getEmail());
        mensaje.setSubject("Recuperación de contraseña");
        mensaje.setText("Haz clic en el siguiente enlace para recuperar tu contraseña: " + "http://localhost:8080/usuarioRest/recuperar?token=" + token);
        // Enviar el correo
        mailSender.send(mensaje);
    }
    private String generarTokenRecuperacion(Usuario usuario) {
        String tokenVerificadorContraseña = UUID.randomUUID().toString();
        usuario.setToken(tokenVerificadorContraseña);
        usuarioRepository.save(usuario);
        return tokenVerificadorContraseña;
    }

    public ResponseEntity<String> eliminarUsuario(int idUsuario) {
        System.out.println("Eliminado usuario");
        usuarioRepository.deleteById(idUsuario);
        return ResponseEntity.ok("Cuenta eliminada exitosamente");
    }

    public Usuario validarTokenRecuperacion(String token) {
        return usuarioRepository.findByToken(token);
    }
}
