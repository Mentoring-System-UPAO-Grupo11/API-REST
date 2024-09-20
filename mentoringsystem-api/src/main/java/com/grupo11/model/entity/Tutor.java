package com.grupo11.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tutor")
public class Tutor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "especialidad", nullable = false, length = 255)
    private String especialidad;

    @Column(name = "disponibilidad", nullable = false, length = 255)
    private String disponibilidad;

    @Column(name = "feedback", length = 255)
    private String feedback;
}


