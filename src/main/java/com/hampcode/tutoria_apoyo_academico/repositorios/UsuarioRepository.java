package com.hampcode.tutoria_apoyo_academico.repositorios;

import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    Optional<Usuario> findByEmail(String email);

    @Query(""
            + "SELECT u "
            + "FROM Usuario u "
            + "WHERE u.email = :email")
    Usuario findByEmailQuery(@Param("email") String email);

    @Query(""
            + "SELECT COUNT(u) > 0 "
            + "FROM Usuario u "
            + "WHERE u.email = :email")
    boolean existsByEmail(@Param("email") String email);

    public Usuario findByToken(String token);
}
