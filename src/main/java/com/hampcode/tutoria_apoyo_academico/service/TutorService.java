package com.hampcode.tutoria_apoyo_academico.service;

import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import com.hampcode.tutoria_apoyo_academico.repository.TutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TutorService {

    public List<Tutor> findAll();

    public List<Tutor> filtrarTutores(Double tarifa, String especialidad, Double reseñasPromedio);
}
