package com.hampcode.tutoria_apoyo_academico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TutoriaApoyoAcademicoApplication {

    public static void main(String[] args) {
        SpringApplication.run(TutoriaApoyoAcademicoApplication.class, args);
    }

}
