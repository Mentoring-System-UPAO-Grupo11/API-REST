package com.hampcode.tutoria_apoyo_academico.mapper;

import com.hampcode.tutoria_apoyo_academico.config.ModelMapper;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UsuarioMapper {
    private ModelMapper modelMapper;

    public Usuario convertToEntity(UsuarioResDTO usuarioResDTO) {
        return modelMapper.map(usuarioResDTO, Usuario.class);
    }

    public UsuarioDTO convertToDTO(Usuario user) {
        return modelMapper.map(user, UsuarioDTO.class);
    }

    public List<UsuarioDTO> convertToListDTO(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(this::convertToDTO)
                .toList();
    }
}
