package com.grupo11.service.impl;

import com.grupo11.model.entity.Tutor;
import com.grupo11.repository.TutorRepository;
import com.grupo11.service.TutorService;
import com.grupo11.exception.ResourceNotFoundException; // Asegúrate de que esta clase esté en tu proyecto
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class TutorServiceImpl implements TutorService {

    private final TutorRepository tutorRepository;

    @Override
    public Tutor create(Tutor tutor) {
        return tutorRepository.save(tutor);  // Aquí estaba el error, corregido a "tutor"
    }

    @Override
    public Tutor findById(Long id) {
        return tutorRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Tutor no encontrado"));
    }

    @Transactional(readOnly = true)
    @Override
    public List<Tutor> getAll() {
        return tutorRepository.findAll();
    }

    @Transactional
    @Override
    public Tutor update(Long id, Tutor updatedTutor) {
        Tutor tutor = findById(id);
        tutor.setEspecialidad(updatedTutor.getEspecialidad());
        tutor.setDisponibilidad(updatedTutor.getDisponibilidad());
        tutor.setFeedback(updatedTutor.getFeedback());
        return tutorRepository.save(tutor);
    }

    @Transactional
    @Override
    public void delete(Long id) {
        Tutor tutor = findById(id);
        tutorRepository.delete(tutor);
    }
}



