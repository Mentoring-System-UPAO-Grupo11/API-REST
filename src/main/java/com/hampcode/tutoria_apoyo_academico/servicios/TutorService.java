package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TutorService {

    public List<Tutor> findAll();

    public List<Tutor> filtrarTutores(Double tarifa, String especialidad, Double reseñasPromedio);
}
