package com.hampcode.tutoria_apoyo_academico.mapper;

import com.hampcode.tutoria_apoyo_academico.config.ModelMapper;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
public class UsuarioMapper {
    /*private ModelMapper modelMapper;

    public Usuario convertToEntity(UsuarioRequestDTO usuarioRequestDTO) {
        return modelMapper.map(usuarioRequestDTO, Usuario.class);
    }

    public UseuarioResponseDTO convertToDTO(Usuario user) {
        return modelMapper.map(user, UsuarioResponseDTO.class);
    }

    public List<UsuarioResponseDTO> convertToListDTO(List<Usuario> users) {
        return users.stream()
                .map(this::convertToDTO)
                .toList();
    }*/
}
