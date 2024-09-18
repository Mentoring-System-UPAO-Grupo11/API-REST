package com.hampcode.tutoria_apoyo_academico.service;

import com.hampcode.tutoria_apoyo_academico.domain.entities.Reporte;

import java.util.List;

public interface ReporteService {
    Reporte createReporte(Reporte reporte);
    List<Reporte> getAllReportes();
}
