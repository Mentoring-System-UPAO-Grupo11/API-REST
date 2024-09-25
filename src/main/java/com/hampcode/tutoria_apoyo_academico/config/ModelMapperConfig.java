package com.hampcode.tutoria_apoyo_academico.config;

import com.hampcode.tutoria_apoyo_academico.model.dto.EstudianteDTO;
import com.hampcode.tutoria_apoyo_academico.model.dto.TutorDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Estudiante;
import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}