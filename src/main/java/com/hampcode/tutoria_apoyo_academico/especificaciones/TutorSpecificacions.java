package com.hampcode.tutoria_apoyo_academico.especificaciones;

import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import org.springframework.data.jpa.domain.Specification;

public class TutorSpecificacions {

    public static Specification<Tutor> tarifaMenorOIgual(Double tarifa) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.lessThanOrEqualTo(root.get("tarifa"), tarifa);
    }

    public static Specification<Tutor> especialidadIgualA(String especialidad) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.equal(root.get("especialidad"), especialidad);
    }

    public static Specification<Tutor> reseñasPromedioGreaterThanEqual(Double reseñasPromedio) {
        return (root, query, criteriaBuilder) ->
                criteriaBuilder.greaterThanOrEqualTo(root.get("reseñasPromedio"), reseñasPromedio);
    }
}
