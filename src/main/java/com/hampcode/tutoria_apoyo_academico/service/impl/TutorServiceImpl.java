package com.hampcode.tutoria_apoyo_academico.service.impl;

import com.hampcode.tutoria_apoyo_academico.model.entities.Tutor;
import com.hampcode.tutoria_apoyo_academico.repository.TutorRepository;
import com.hampcode.tutoria_apoyo_academico.service.TutorService;
import com.hampcode.tutoria_apoyo_academico.specifications.TutorSpecificacions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class TutorServiceImpl implements TutorService {

    @Autowired
    private TutorRepository tutorRepository;
    
    public List<Tutor> findAll(){
        return tutorRepository.findAll();
    }

    @Override
    public List<Tutor> filtrarTutores(Double tarifa, String especialidad, Double reseñasPromedio) {
        Specification<Tutor> specification = Specification.where(null); // Especificación inicial vacía

        if (tarifa != null) {
            specification = specification.and(TutorSpecificacions.tarifaLessThanEqual(tarifa));
        }

        if (especialidad != null && !especialidad.isEmpty()) {
            specification = specification.and(TutorSpecificacions.especialidadEquals(especialidad));
        }

        if (reseñasPromedio != null) {
            specification = specification.and(TutorSpecificacions.reseñasPromedioGreaterThanEqual(reseñasPromedio));
        }

        return tutorRepository.findAll(specification);
    }
}


