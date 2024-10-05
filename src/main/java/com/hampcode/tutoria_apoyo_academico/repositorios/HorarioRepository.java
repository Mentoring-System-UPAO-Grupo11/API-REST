package com.hampcode.tutoria_apoyo_academico.repositorios;

import com.hampcode.tutoria_apoyo_academico.entidades.Estudiante;
import com.hampcode.tutoria_apoyo_academico.entidades.Horario;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

    @Query(""
            + "SELECT h "
            + "FROM Horario h "
            + "WHERE h.fecha = :fecha "
            + "AND :hora BETWEEN h.horaInicio AND h.horaFin "
            + "AND h.disponible = true")
    List<Horario> findAvailableHorarios(@Param("fecha") LocalDate fecha, @Param("hora") LocalTime hora);
}
