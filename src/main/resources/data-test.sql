-- Insertar datos en la tabla usuario
INSERT INTO usuario (nombre, email, contraseña, tipo, fecha_nacimiento, created_at, update_at, role_id) VALUES
                                                                                                            ('Carlos Pérez', 'carlos.perez@gmail.com', 'pass123', 'ESTUDIANTE', '2000-05-17', '2024-09-17', NULL, (SELECT id FROM role WHERE name = 'USER')),
                                                                                                            ('Ana García', 'ana.garcia@gmail.com', 'password', 'TUTOR', '1985-11-12', '2024-09-17', NULL, (SELECT id FROM role WHERE name = 'USER'));

-- Insertar datos en la tabla estudiante
INSERT INTO estudiante (id, intereses_academicos, preferencias, historial_academico) VALUES
    (1, 'Matemáticas, Física', 'Aprendizaje autónomo', 'Historial de buen rendimiento académico');

-- Insertar datos en la tabla tutor
INSERT INTO tutor (id, especialidad, disponibilidad, tarifa) VALUES
    (2, 'Matemáticas Avanzadas', 'Lunes a viernes, 9:00 - 18:00', 25.50);

-- Insertar datos en la tabla sesiones
INSERT INTO sesiones (precio, fecha, duracion, tema, estado, tutor_id, estudiante_id) VALUES
                                                                                          (20.00, '2024-09-18', 60, 'Álgebra Lineal', 'Completada', 2, 1),
                                                                                          (30.00, '2024-09-19', 90, 'Cálculo Diferencial', 'Pendiente', 2, 1);

-- Insertar datos en la tabla materiales
INSERT INTO materiales (tipo, descripcion, enlace, sesion_id) VALUES
                                                                  ('PDF', 'Guía de ejercicios de álgebra lineal', 'https://example.com/guia-algebra', 1),
                                                                  ('Video', 'Explicación de cálculo diferencial', 'https://example.com/video-calculo', 2);

-- Insertar datos en la tabla evaluaciones
INSERT INTO evaluaciones (calificacion, comentarios, sesion_id) VALUES
                                                                    (8, 'Buen desempeño, pero puede mejorar en algunos conceptos.', 1),
                                                                    (9, 'Excelente sesión, muy clara.', 2);

-- Insertar datos en la tabla pagos
INSERT INTO pagos (monto, created_at, payment_status, estudiante_id, sesion_id) VALUES
                                                                                    (50.00, '2024-09-17', 'COMPLETADO', 1, 1),
                                                                                    (30.00, '2024-09-17', 'PENDIENTE', 1, 2);

-- Insertar datos en la tabla favoritos
INSERT INTO favoritos (estudiante_id) VALUES
    (1);

-- Insertar datos en la tabla reportes
INSERT INTO reportes (calificacion, comentario, asistencia, tutor_id, estudiante_id) VALUES
    (10, 'Excelente tutor', 'Asistió a todas las clases', 2, 1);

-- Insertar datos en la tabla busquedas
INSERT INTO busquedas (terminos, resultados, usuario_id) VALUES
    ('tutor matemáticas', 'Carlos Pérez', 1);
