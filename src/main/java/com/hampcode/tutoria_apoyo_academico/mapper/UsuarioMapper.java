package com.hampcode.tutoria_apoyo_academico.mapper;


import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioResDTO;
import com.hampcode.tutoria_apoyo_academico.model.dto.UsuarioReqDTO;
import com.hampcode.tutoria_apoyo_academico.model.entities.Usuario;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioMapper {


    private ModelMapper modelMapper;
    @Autowired
    public UsuarioMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Usuario convertToEntity(UsuarioReqDTO usuarioReqDTO) {
        return modelMapper.map(usuarioReqDTO, Usuario.class);
    }

    public UsuarioResDTO convertToDTO(Usuario usuario) {
        return modelMapper.map(usuario, UsuarioResDTO.class);
    }

    public List<UsuarioResDTO> convertToListDTO(List<Usuario> usuarios) {
        return usuarios.stream()
                .map(this::convertToDTO)
                .toList();
    }
}
