package com.hampcode.tutoria_apoyo_academico.service;

import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import com.hampcode.tutoria_apoyo_academico.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TutorService {

    public List<Tutor> buscarPorEspecialidad(String especialidad);

    public List<Tutor> findAll();
}
