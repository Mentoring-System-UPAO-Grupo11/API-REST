package com.grupo11.tutoria.controller;

import com.grupo11.tutoria.model.MaterialEducativo;
import com.grupo11.tutoria.service.MaterialEducativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/materiales")
public class MaterialEducativoController {

    @Autowired
    private MaterialEducativoService service;

    // Endpoint para subir materiales educativos
    @PostMapping("/subir")
    public ResponseEntity<?> subirMaterial(@RequestParam("archivo") MultipartFile archivo) {
        try {
            MaterialEducativo material = service.subirMaterial(archivo);
            return ResponseEntity.ok("Material subido exitosamente: " + material.getNombre());
        } catch (IOException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                    .body("No se pudo subir el material educativo. Verifica el archivo y vuelve a intentarlo.");
        }
    }

    // Endpoint para listar todos los materiales educativos subidos
    @GetMapping("/listar")
    public List<MaterialEducativo> listarMateriales() {
        return service.listarMateriales();
    }
}
