package com.grupo11.service;

import com.grupo11.model.entity.Tutor;
import java.util.List;

public interface TutorService {
    Tutor create(Tutor tutor);
    Tutor findById(Long id);
    List<Tutor> getAll();
    Tutor update(Long id, Tutor tutor);
    void delete(Long id);
}

