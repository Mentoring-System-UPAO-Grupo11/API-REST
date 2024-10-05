package com.hampcode.tutoria_apoyo_academico.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;



@Getter@Setter
public class DatosTutorDTO {

    private String especialidad;
    private Float popularidad;
    private Float tarifa;
    private boolean esParticular;

    public DatosTutorDTO(String especialidad, Float popularidad, Float tarifa, boolean esParticular) {
        this.especialidad = especialidad;
        this.popularidad = popularidad;
        this.tarifa = tarifa;
        this.esParticular = esParticular;
    }

}

