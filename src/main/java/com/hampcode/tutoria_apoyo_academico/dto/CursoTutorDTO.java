package com.hampcode.tutoria_apoyo_academico.dto;

import com.hampcode.tutoria_apoyo_academico.entidades.Horario;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CursoTutorDTO {

    private int totalCupos;
    private int alumnosInscritos;
    private int cursoId;
    private List<Horario> horarios = new ArrayList<>();

    public CursoTutorDTO(int totalCupos, int alumnosInscritos, int cursoId) {
        this.totalCupos = totalCupos;
        this.alumnosInscritos = alumnosInscritos;
        this.cursoId = cursoId;
    }




}
