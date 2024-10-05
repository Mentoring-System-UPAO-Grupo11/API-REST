package com.hampcode.tutoria_apoyo_academico.servicios;

import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import com.hampcode.tutoria_apoyo_academico.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
    
@Service
    public class UsuarioServicio {

    @Autowired
    UsuarioRepository usuarioRepository;


    public void registrarUsuario(Usuario usuarioNuevo) {
        usuarioRepository.save(usuarioNuevo);
    }
}
