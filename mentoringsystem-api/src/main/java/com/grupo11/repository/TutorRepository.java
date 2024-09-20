package com.grupo11.repository;

import com.grupo11.model.entity.Tutor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TutorRepository extends JpaRepository<Tutor, Long> {
    // Métodos personalizados de consulta, si es necesario.
}

