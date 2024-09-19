package com.hampcode.tutoria_apoyo_academico.service.impl;

import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import com.hampcode.tutoria_apoyo_academico.repository.TutorRepository;
import com.hampcode.tutoria_apoyo_academico.service.TutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorRepository tutorRepository;

    @Override
    public List<Tutor> buscarPorEspecialidad(String especialidad) {
        List<Tutor> tutorDB = tutorRepository.findByEspecialidad(especialidad);
        System.out.println(tutorDB);
        return  tutorDB;
    }

    public List<Tutor> findAll(){
        return tutorRepository.findAll();
    }
}


