package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.entidades.PasswordResetToken;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import com.hampcode.tutoria_apoyo_academico.repositorios.PasswordResetTokenRepository;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.UUID;

@Service
public class PasswordResetService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PasswordResetTokenRepository tokenRepository;

    @Autowired
    private EmailService emailService;

    public String initiatePasswordReset(String email) {
        if (usuarioRepository.existsByEmail(email)) {
            Usuario usuario = usuarioRepository.findByEmailQuery(email);
            try {
                String token = UUID.randomUUID().toString();
                PasswordResetToken passwordResetToken = new PasswordResetToken();
                passwordResetToken.setToken(token);
                passwordResetToken.setUsuario(usuario);
                passwordResetToken.setExpiryDate(LocalDateTime.now().plusHours(1));
                tokenRepository.save(passwordResetToken);

                String titleEmail = "¡Somos MentoringSystem!";
                String messageEmail = "\n\nHola, solicitaste un restablecimiento de contraseña para tu cuenta "+ email +", \na continuación copia y pega el siguiente token en el formulario para continuar.";
                String resetLink = titleEmail + messageEmail +" \n\nTOKEN: " + token;
                emailService.sendEmail(usuario.getEmail(), "Password Reset Request \uD83D\uDD12", resetLink);
                return "Token enviado exitosamente";
            } catch (Exception e) {
                e.printStackTrace();
                return "Token no enviado "+e.getMessage();
            }
        }
        return "Token no encontrado";
    }

    public void resetPassword(String token, String newPassword) {
        PasswordResetToken passwordResetToken = tokenRepository.findByToken(token);
        if (passwordResetToken != null && passwordResetToken.getExpiryDate().isAfter(LocalDateTime.now())) {
            Usuario usuario = passwordResetToken.getUsuario();
            usuario.setPassword(newPassword); // Make sure to hash the password before saving
            usuarioRepository.save(usuario);
            tokenRepository.delete(passwordResetToken);
        } else {
            throw new RuntimeException("Invalid or expired password reset token");
        }
    }
}