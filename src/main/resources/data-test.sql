INSERT INTO usuario (id,nombre, email, password,tipo, fecha_nacimiento, created_at, update_at) VALUES
    (1,'Carlos Pérez', 'jpaliminoc5@upao.edu.pe', 'pass123', 'estudiante','2000-05-17', '2024-09-17', NULL);


-- Insertar datos en la tabla estudiante
INSERT INTO estudiante (id,nombre, email, password, fecha_nacimiento, created_at, update_at,intereses, preferencias, historial_academico)
VALUES (1,'Carlos Pérez', 'jpaliminoc5@upao.edu.pe', 'pass123', '2000-05-17', '2024-09-17', NULL,'computo', 'Aprendizaje autónomo', 'Historial de buen rendimiento académico' );

-- Insertar datos en la tabla tutor
INSERT INTO tutor (id,nombre, email, password,  fecha_nacimiento, created_at, especialidad, disponibilidad, tarifa) VALUES
    (1,'Ana García', 'ana.garcia@gmail.com', 'password', '1985-11-12', '2024-09-17', NULL,'Matemáticas Avanzadas', 'Lunes a viernes, 9:00 - 18:00', 25.50);

-- Insertar datos en la tabla sesiones
INSERT INTO sesiones (precio, fecha, duracion, tema, estado, id) VALUES
                                                                                          (20.00, '2024-09-18', 60, 'Álgebra Lineal', 'Completada', 2, ),
                                                                                          (30.00, '2024-09-19', 90, 'Cálculo Diferencial', 'Pendiente',1);

-- Insertar datos en la tabla materiales
INSERT INTO materiales (tipo, descripcion, enlace, id) VALUES
                                                                  ('PDF', 'Guía de ejercicios de álgebra lineal', 'https://example.com/guia-algebra', 1),
                                                                  ('Video', 'Explicación de cálculo diferencial', 'https://example.com/video-calculo', 2);

-- Insertar datos en la tabla evaluaciones
INSERT INTO evaluaciones (calificacion, comentarios, id) VALUES
                                                                    (8, 'Buen desempeño, pero puede mejorar en algunos conceptos.', 1),
                                                                    (9, 'Excelente sesión, muy clara.', 2);

-- Insertar datos en la tabla pagos
INSERT INTO pagos (monto, created_at, payment_status, id) VALUES
                                                                                    (50.00, '2024-09-17', 'COMPLETADO', 1, ),
                                                                                    (30.00, '2024-09-17', 'PENDIENTE', 2, );

-- Insertar datos en la tabla favoritos
INSERT INTO favoritos (id) VALUES
    (1);

INSERT INTO paquete_sesiones (id,nombre, contenido) VALUES
                                                     (1, 'Paquete Básico', 'Incluye 5 sesiones de tutoría en cualquier materia.'),
                                                     (2, 'Paquete Avanzado', 'Incluye 10 sesiones de tutoría y acceso a materiales de estudio adicionales.'),
                                                     (3, 'Paquete Premium', 'Incluye 20 sesiones de tutoría, materiales de estudio, y soporte prioritario.');


-- Insertar datos en la tabla reportes
INSERT INTO reportes (calificacion, comentario, asistencia, id) VALUES
    (10, 'Excelente tutor', 'Asistió a todas las clases', 2, );

-- Insertar datos en la tabla busquedas
INSERT INTO busquedas (terminos, resultados, id) VALUES
    ('tutor matemáticas', 'Carlos Pérez', 1);
