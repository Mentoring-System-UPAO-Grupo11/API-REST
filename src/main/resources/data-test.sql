-- Insertar Usuarios Base
INSERT INTO usuario (id, nombre, email, password, fecha_nacimiento, created_at, updated_at, tipo_usuario)
VALUES (1, 'Carlos Pérez', 'cperez@upao.edu.pe', 'pass123', '2000-05-17', '2024-09-17', NULL,'ESTUDIANTE'),
       (2, 'Ana Gómez', 'agomez@upao.edu.pe', 'ana456', '1999-07-20', '2024-09-17', NULL, 'TUTOR');

-- Insertar Tutor (usando el mismo ID de usuario)
--INSERT INTO tutor (id, especialidad, disponibilidad, tarifa)
--VALUES (1,'Matemáticas', 'Lunes a Viernes', 50.00);

-- Insertar Estudiante (usando el mismo ID de usuario)
--INSERT INTO estudiante (id, intereses, preferencias, historial_academico)
--VALUES (2, 'Ingeniería de Software', 'Mañanas', 'Promedio 17.5');

-- Insertar datos en la tabla sesiones
INSERT INTO sesiones (id, precio, fecha, duracion, tema, estado)
VALUES (1, 20.00, '2024-09-18', 60, 'Álgebra Lineal', 'Completada'),
       (2, 30.00, '2024-09-19', 90, 'Cálculo Diferencial', 'Pendiente');

-- Insertar datos en la tabla materiales
INSERT INTO materiales (id, tipo, descripcion, enlace)
VALUES (1, 'PDF', 'Guía de ejercicios de álgebra lineal', 'https://example.com/guia-algebra'),
       (2, 'Video', 'Explicación de cálculo diferencial', 'https://example.com/video-calculo');

-- Insertar datos en la tabla evaluaciones
INSERT INTO evaluaciones (id, calificacion, comentarios)
VALUES (1, 8, 'Buen desempeño, pero puede mejorar en algunos conceptos.'),
       (2, 9, 'Excelente sesión, muy clara.');

-- Insertar datos en la tabla pagos
INSERT INTO pagos (id, monto, created_at, payment_status)
VALUES (1, 50.00, '2024-09-17', 'COMPLETADO'),
       (2, 30.00, '2024-09-17', 'PENDIENTE');

-- Insertar datos en la tabla favoritos
INSERT INTO favoritos (id)
VALUES (1);

-- Insertar datos en la tabla paquete_sesiones
INSERT INTO paquete_sesiones (id, nombre, contenido)
VALUES (1, 'Paquete Básico', 'Incluye 5 sesiones de tutoría en cualquier materia.'),
       (2, 'Paquete Avanzado', 'Incluye 10 sesiones de tutoría y acceso a materiales de estudio adicionales.'),
       (3, 'Paquete Premium', 'Incluye 20 sesiones de tutoría, materiales de estudio, y soporte prioritario.');

-- Insertar datos en la tabla reportes
INSERT INTO reportes (id, calificacion, comentario, asistencia)
VALUES (1, 10, 'Excelente tutor', 'Asistió a todas las clases');

-- Insertar datos en la tabla busquedas
INSERT INTO busquedas (id, terminos, resultados)
VALUES (1, 'tutor matemáticas', 'Carlos Pérez');
