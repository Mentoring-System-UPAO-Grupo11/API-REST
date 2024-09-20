package com.grupo11.controller;

import com.grupo11.model.entity.Tutor;
import com.grupo11.service.TutorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/tutores")
public class TutorController {

    private final TutorService tutorService;

    @GetMapping
    public List<Tutor> getAll() {
        return tutorService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tutor> getById(@PathVariable Long id) {
        Tutor tutor = tutorService.findById(id);
        return ResponseEntity.ok(tutor);
    }

    @PostMapping
    public ResponseEntity<Tutor> create(@RequestBody Tutor tutor) {
        Tutor newTutor = tutorService.create(tutor);
        return ResponseEntity.ok(newTutor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Tutor> update(@PathVariable Long id, @RequestBody Tutor tutor) {
        Tutor updatedTutor = tutorService.update(id, tutor);
        return ResponseEntity.ok(updatedTutor);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        tutorService.delete(id);
        return ResponseEntity.noContent().build();
    }
}



