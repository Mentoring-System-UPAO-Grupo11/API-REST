package com.grupo11.tutoria.service;

import com.grupo11.tutoria.model.MaterialEducativo;
import com.grupo11.tutoria.repository.MaterialEducativoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class MaterialEducativoService {

    @Autowired
    private MaterialEducativoRepository repository;

    // Lógica para subir el archivo y guardar información en la base de datos
    public MaterialEducativo subirMaterial(MultipartFile archivo) throws IOException {
        String rutaArchivo = guardarArchivo(archivo);
        MaterialEducativo material = new MaterialEducativo();
        material.setNombre(archivo.getOriginalFilename());
        material.setTipo(archivo.getContentType());
        material.setRutaArchivo(rutaArchivo);
        material.setFechaSubida(LocalDateTime.now());

        return repository.save(material);
    }

    // Guardar el archivo en el sistema de archivos
    private String guardarArchivo(MultipartFile archivo) throws IOException {
        String directorio = "materiales/";  // Ruta donde se guardarán los archivos
        Path path = Paths.get(directorio + archivo.getOriginalFilename());
        Files.copy(archivo.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
        return path.toString();
    }

    // Listar todos los materiales educativos subidos
    public List<MaterialEducativo> listarMateriales() {
        return repository.findAll();
    }
}
