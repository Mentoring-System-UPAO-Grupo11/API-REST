package com.hampcode.tutoria_apoyo_academico.scriptbd;

import com.hampcode.tutoria_apoyo_academico.repositorios.ResenaRepository;
import com.hampcode.tutoria_apoyo_academico.servicios.CursoService;
import com.hampcode.tutoria_apoyo_academico.servicios.CursoTutorService;
import com.hampcode.tutoria_apoyo_academico.servicios.EstudianteService;
import com.hampcode.tutoria_apoyo_academico.servicios.HorarioService;
import com.hampcode.tutoria_apoyo_academico.servicios.PermisoService;
import com.hampcode.tutoria_apoyo_academico.servicios.PermisoUsuarioService;
import com.hampcode.tutoria_apoyo_academico.servicios.ResenaService;
import com.hampcode.tutoria_apoyo_academico.servicios.TutorService;
import com.hampcode.tutoria_apoyo_academico.servicios.UsuarioServicio;
import com.hampcode.tutoria_apoyo_academico.dto.CursoTutorDTO;
import com.hampcode.tutoria_apoyo_academico.dto.DatosTutorDTO;
import com.hampcode.tutoria_apoyo_academico.dto.HorarioDTO;
import com.hampcode.tutoria_apoyo_academico.dto.PermisoUsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.dto.RegistrarResenaDTO;
import com.hampcode.tutoria_apoyo_academico.dto.UsuarioDTO;
import com.hampcode.tutoria_apoyo_academico.entidades.Curso;
import com.hampcode.tutoria_apoyo_academico.entidades.Estudiante;
import com.hampcode.tutoria_apoyo_academico.entidades.Permiso;
import com.hampcode.tutoria_apoyo_academico.entidades.Tutor;
import com.hampcode.tutoria_apoyo_academico.entidades.Usuario;
import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ScriptDataBase implements CommandLineRunner {

    @Autowired
    CursoService cursoService;

    @Autowired
    UsuarioServicio usuarioService;

    @Autowired
    TutorService tutorService;

    @Autowired
    HorarioService horarioService;

    @Autowired
    CursoTutorService cursoTutorService;

    @Autowired
    EstudianteService estudianteService;
    @Autowired
    PermisoService permisoService;
    @Autowired
    ResenaService resenaService;
    @Autowired
    PermisoUsuarioService permisoUsuarioService;

    @Override
    public void run(String... args) throws Exception {

        Curso curso = new Curso("CIENC - 101", "Algoritmia y programacion", "CIENCIAS", false, 4, 1);
        Curso curso1 = new Curso("CIENC - 109", "Lenguaje I", "CIENCIAS", false, 3, 1);
        Curso curso2 = new Curso("CIENC - 251", "Matematica II", "CIENCIAS", false, 3, 1);
        Curso curso3 = new Curso("CIENC - 135", "Matematica III", "CIENCIAS", false, 4, 1);
        Curso curso4 = new Curso("HUMA - 366", "Metodologia del aprendizaje universitario", "HUMANIDADES", false, 1, 3);
        Curso curso6 = new Curso("HUMA - 976", "Psicologia y desarrollo humano", "HUMANIDADES", false, 3, 3);
        Curso curso7 = new Curso("HUMA - 526", "Ciudadania y derechos humanos", "CIENCIAS", false, 2, 5);
        Curso curso11 = new Curso("ICSI - 510", "Patrones de diseño de software", "CIENCIAS", false, 4, 3);
        Curso curso12 = new Curso("CIEN - 651", "Estadistica descriptiva", "CIENCIAS", false, 2, 3);
        Curso curso13 = new Curso("HUMA - 1027", "Actividad formativa IV", "HUMANIDADES", false, 1, 5);
        Curso curso14 = new Curso("HUMA - 904", "Realidad nacional y regional", "HUMANIDADES", false, 3, 4);
        Curso curso15 = new Curso("ICSI - 406", "Estructura de datos", "CIENCIAS", false, 4, 4);
        Curso curso16 = new Curso("ICSI - 407", "Matematica discreta para la computacion", "CIENCIAS", false, 4, 3);
        Curso curso17 = new Curso("ICSI - 409", "Organizacion y gestion de empresas", "CIENCIAS", false, 3, 4);
        Curso curso18 = new Curso("ICSI - 512", "Paradigmas de programacion", "CIENCIAS", false, 4, 5);
        Curso curso19 = new Curso("ICSI - 513", "Ingenieria de requisitos", "CIENCIAS", false, 2, 6);
        Curso curso20 = new Curso("ICSI - 514", "Arquitectura de computadoras", "CIENCIAS", false, 4, 7);
        Curso curso21 = new Curso("ICSI - 429", "Inteligencia de procesos de negocios", "CIENCIAS", true, 2, 8);
        Curso curso22 = new Curso("ICSI - 436", "Desarrollo de aplicaciones para dispositivos moviles", "CIENCIAS", true, 2, 9);
        Curso curso23 = new Curso("ICSI - 547", "Auditorio de sistemas de informacion", "CIENCIAS", true, 2, 9);
        Curso curso24 = new Curso("ICSI - 554", "Sistemas gestuales y conversacionales", "CIENCIAS", true, 2, 9);

        cursoService.registrarCursoGeneral(curso);
        cursoService.registrarCursoGeneral(curso1);
        cursoService.registrarCursoGeneral(curso2);
        cursoService.registrarCursoGeneral(curso3);
        cursoService.registrarCursoGeneral(curso4);
        cursoService.registrarCursoGeneral(curso6);
        cursoService.registrarCursoGeneral(curso7);
        cursoService.registrarCursoGeneral(curso11);
        cursoService.registrarCursoGeneral(curso12);
        cursoService.registrarCursoGeneral(curso13);
        cursoService.registrarCursoGeneral(curso14);
        cursoService.registrarCursoGeneral(curso15);
        cursoService.registrarCursoGeneral(curso16);
        cursoService.registrarCursoGeneral(curso17);
        cursoService.registrarCursoGeneral(curso18);
        cursoService.registrarCursoGeneral(curso19);
        cursoService.registrarCursoGeneral(curso20);
        cursoService.registrarCursoGeneral(curso21);
        cursoService.registrarCursoGeneral(curso22);
        cursoService.registrarCursoGeneral(curso23);
        cursoService.registrarCursoGeneral(curso24);

        Estudiante estudiante2 = new Estudiante("Literatura, Historia", "Presencial", "Secundaria completa", "María Gómez", "maria.gomez@example.com", "password456", LocalDate.of(1999, 8, 22), LocalDate.now(), LocalDate.now());
        Estudiante estudiante3 = new Estudiante("Química, Biología", "Presencial", "Secundaria completa", "Carlos Ruiz", "carlos.ruiz@example.com", "password789", LocalDate.of(2001, 2, 18), LocalDate.now(), LocalDate.now());
        Estudiante estudiante4 = new Estudiante("Geografía, Filosofía", "Online", "Secundaria completa", "Lucía Torres", "lucia.torres@example.com", "password321", LocalDate.of(1998, 12, 30), LocalDate.now(), LocalDate.now());
        Estudiante estudiante5 = new Estudiante("Inglés, Arte", "Presencial, Online", "Secundaria completa", "Fernando López", "fernando.lopez@example.com", "password654", LocalDate.of(2002, 6, 5), LocalDate.now(), LocalDate.now());

        estudianteService.registrarEstudiante(estudiante2);
        estudianteService.registrarEstudiante(estudiante3);
        estudianteService.registrarEstudiante(estudiante4);
        estudianteService.registrarEstudiante(estudiante5);
// Crear un nuevo objeto Tutor
        Tutor t1 = new Tutor("Matemáticas", 4.5f, 50.0f, true, "Sofía Morales", "sofia.morales@example.com", "password105", LocalDate.of(1991, 6, 18), LocalDate.now(), null);
        Tutor t2 = new Tutor("Física", 4.0f, 40.0f, false, "Juan Pérez", "juan.perez@example.com", "password204", LocalDate.of(1988, 3, 25), LocalDate.now(), null);
        Tutor t3 = new Tutor("Química", 4.8f, 60.0f, true, "Laura García", "laura.garcia@example.com", "password305", LocalDate.of(1990, 9, 10), LocalDate.now(), null);
        Tutor t4 = new Tutor("Biología", 3.5f, 45.0f, false, "Pedro López", "pedro.lopez@example.com", "password406", LocalDate.of(1985, 12, 15), LocalDate.now(), null);
        Tutor t5 = new Tutor("Historia", 4.2f, 30.0f, true, "Ana Torres", "ana.torres@example.com", "password507", LocalDate.of(1993, 5, 20), LocalDate.now(), null);

// Ahora puedes usar t1 como desees, por ejemplo, para registrar el tutor
        tutorService.registrarTutor(t1);
        tutorService.registrarTutor(t2);
        tutorService.registrarTutor(t3);
        tutorService.registrarTutor(t4);
        tutorService.registrarTutor(t5);
//        tutorService.modificarDatosTutor(tutorDatos, 0);

        permisoService.crearPermiso(new Permiso("A001", "Permisos respecto a USUARIOS", true, true, true, true, true, true, true));
        permisoService.crearPermiso(new Permiso("A010", "Permisos respecto a RECURSOS", true, true, true, true, true, false, true));
        permisoService.crearPermiso(new Permiso("A009", "Permisos respecto a WEB", false, true, false, false, false, false, false));
        permisoService.crearPermiso(new Permiso("A008", "Permisos respecto a DISEÑO", true, true, true, true, true, true, true));
        permisoService.crearPermiso(new Permiso("A006", "Permisos respecto a TODO", false, false, false, false, false, true, true));
        permisoService.crearPermiso(new Permiso("A005", "Permisos respecto a ACCESOS", false, true, false, false, true, true, false));

        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(1l, 3l));
        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(1l, 2l));
        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(1l, 5l));
        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(2l, 3l));
        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(2l, 2l));
        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(2l, 5l));
        permisoUsuarioService.crearPermisoUsuario(new PermisoUsuarioDTO(2l, 1l));

        resenaService.registrarReseña(new RegistrarResenaDTO("Explica conceptos complejos con claridad", 6, 1L, 5L));
        resenaService.registrarReseña(new RegistrarResenaDTO("Podría mejorar en la dinámica de clase", 3, 1L, 5L));
        resenaService.registrarReseña(new RegistrarResenaDTO("Enseñanza adecuada, pero necesita más práctica", 2, 3L, 5L));
        resenaService.registrarReseña(new RegistrarResenaDTO("Muy carismático, aunque se distrae fácilmente", 4, 1L, 5L));
        resenaService.registrarReseña(new RegistrarResenaDTO("A veces sus expectativas son muy altas", 4, 2L, 6L));
        resenaService.registrarReseña(new RegistrarResenaDTO("Conocimientos sólidos, pero falta motivación", 4, 2L, 6L));
        resenaService.registrarReseña(new RegistrarResenaDTO("Faltó en varias ocasiones, pero las clases son buenas", 4, 2L, 6L));
        resenaService.registrarReseña(new RegistrarResenaDTO("El Dr. Pérez es un profesor apasionado por las matemáticas. .", 4, 1l, 7l));
        resenaService.registrarReseña(new RegistrarResenaDTO("La Sra. Gómez es, sin duda, una de mis profesoras favoritas. ", 4, 3l, 7l));
        resenaService.registrarReseña(new RegistrarResenaDTO("El Dr. Rodríguez es un buen profesor, pero su estilo de enseñanza puede ser un poco monótono", 4, 1l, 9l));

        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(36, 0, 4), 6);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(25, 0, 7), 7);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(23, 0, 5), 9);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(20, 0, 4), 6);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(22, 0, 2), 5);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(55, 0, 1), 8);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(22, 0, 8), 7);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(11, 0, 7), 7);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(55, 0, 5), 5);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(33, 0, 3), 5);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(26, 0, 5), 8);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(27, 0, 4), 6);
        cursoTutorService.agregarCursoaTutor(new CursoTutorDTO(34, 0, 7), 8);

        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Lunes", "G 101", LocalDate.of(2024, 10, 1), LocalTime.of(9, 0), LocalTime.of(11, 0), true), 1);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Martes", "A 102", LocalDate.of(2024, 10, 2), LocalTime.of(10, 0), LocalTime.of(12, 0), true), 2);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Miércoles", "G 103", LocalDate.of(2024, 10, 3), LocalTime.of(8, 0), LocalTime.of(10, 0), true), 3);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Jueves", "G 104", LocalDate.of(2024, 10, 4), LocalTime.of(11, 0), LocalTime.of(13, 0), true), 4);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Viernes", "G 105", LocalDate.of(2024, 10, 5), LocalTime.of(12, 0), LocalTime.of(14, 0), true), 5);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Sábado", "Y 106", LocalDate.of(2024, 10, 6), LocalTime.of(14, 0), LocalTime.of(16, 0), true), 6);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Domingo", "G 107", LocalDate.of(2024, 10, 7), LocalTime.of(15, 0), LocalTime.of(17, 0), true), 7);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Lunes", "G 108", LocalDate.of(2024, 10, 8), LocalTime.of(16, 0), LocalTime.of(18, 0), true), 8);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Martes", "G 109", LocalDate.of(2024, 10, 9), LocalTime.of(9, 0), LocalTime.of(11, 0), true), 9);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Martes", "G 109", LocalDate.of(2024, 10, 9), LocalTime.of(10, 0), LocalTime.of(14, 0), true), 7);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Miércoles", "P 110", LocalDate.of(2024, 10, 10), LocalTime.of(8, 30), LocalTime.of(10, 30), true), 10);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Jueves", "P 111", LocalDate.of(2024, 10, 11), LocalTime.of(13, 0), LocalTime.of(15, 0), true), 11);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Viernes", "A 112", LocalDate.of(2024, 10, 12), LocalTime.of(10, 0), LocalTime.of(12, 0), true), 12);
        horarioService.registrarHorarioAlCursoDel(new HorarioDTO("Sábado", "B 113", LocalDate.of(2024, 10, 13), LocalTime.of(11, 0), LocalTime.of(13, 0), true), 13);

    }
}

