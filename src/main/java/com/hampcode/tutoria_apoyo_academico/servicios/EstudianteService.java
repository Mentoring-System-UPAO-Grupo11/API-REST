package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.repositorios.PerfilRepositorio;
import com.hampcode.tutoria_apoyo_academico.entidades.Estudiante;
import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.hampcode.tutoria_apoyo_academico.repositorios.EstudianteRepository;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepositorio;

    @Autowired
    PerfilRepositorio perfilRepositorio;

    public List<Estudiante> listarTodosLosEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    public Optional<Estudiante> listarEstudiantePorId(int id) {
        return estudianteRepositorio.findById(id);
    }

    public ResponseEntity<String> registrarEstudiante(Estudiante nuevoEstudiante) {
        nuevoEstudiante.setPerfil(new Perfil("fotoDefecto.png", null, false,nuevoEstudiante));
        estudianteRepositorio.save(nuevoEstudiante);
        return ResponseEntity.ok("El estudiante ha sido registrado exitosamente.");
    }

    public void eliminarEstudiantePorId(int id) {
        estudianteRepositorio.deleteById(id);
    }

}

