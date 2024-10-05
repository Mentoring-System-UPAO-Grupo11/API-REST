package com.hampcode.tutoria_apoyo_academico.controladores;
import com.hampcode.tutoria_apoyo_academico.servicios.PerfilService;
import com.hampcode.tutoria_apoyo_academico.dto.UsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Perfil;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import org.eclipse.angus.mail.iap.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/perfil")
@RestController
public class PerfilController {

    @Autowired
    PerfilService perfilServicio;

    @PutMapping("/editarPerfil/{idUsuario}")
    public ResponseEntity<String> cambiarPerfil(@RequestBody UsuarioDTO usuario, @PathVariable int idUsuario) {
        return perfilServicio.modificarPerfil(usuario, idUsuario);
    }
}

