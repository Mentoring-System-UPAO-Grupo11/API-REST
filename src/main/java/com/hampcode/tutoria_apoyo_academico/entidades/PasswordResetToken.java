package com.hampcode.tutoria_apoyo_academico.entidades;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="password_reset_token")
public class PasswordResetToken {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String token;

//    @OneToOne(targetEntity = Usuario.class, fetch = FetchType.EAGER)
//    @JoinColumn(nullable = false, name = "usuario_id")
//    private Usuario usuario;
//
//    @Column(nullable = false)
//    private LocalDateTime expiryDate;
}
