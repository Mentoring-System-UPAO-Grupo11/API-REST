package com.hampcode.tutoria_apoyo_academico.controladores;

import com.hampcode.tutoria_apoyo_academico.servicios.EmailService;
import com.hampcode.tutoria_apoyo_academico.servicios.PasswordResetService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private PasswordResetService passwordResetService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/forgot-password/{email}")
    public ResponseEntity<String> forgotPassword(@PathVariable("email") String email) {
        System.out.println(email);
        return ResponseEntity.ok(passwordResetService.initiatePasswordReset(email));
    }

    @PostMapping("/reset-password/{token}/{newPass}")
    public ResponseEntity<String> resetPassword(@PathVariable("token") String token, @PathVariable("newPass") String newPassword) {
        passwordResetService.resetPassword(token, newPassword);
        return ResponseEntity.ok("Password reset successful");
    }
}