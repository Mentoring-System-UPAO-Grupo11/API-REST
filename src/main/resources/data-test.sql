
-- Insertar en la tabla usuario
INSERT INTO usuario (nombre, email, password, fecha_nacimiento, created_at, updated_at)
VALUES ('Ana García', 'anawa.garcia5@gmail.com', 'password123', '1999-07-20', CURRENT_DATE, CURRENT_DATE);

-- Insertar en la tabla estudiante
INSERT INTO estudiante (id, intereses, preferencias, historial_academico)
VALUES (currval('usuario_id_seq'), 'Ciencia', 'Clases online', 'Historial académico de ejemplo');

--Insertar Usuario
INSERT INTO usuario (nombre, email, password, fecha_nacimiento, created_at, updated_at)
VALUES ('Carlos Pérez', 'carlos.pere5@gmail.com', 'pass123', '1985-12-15', CURRENT_DATE, CURRENT_DATE)
    RETURNING id;
--Insertar Tutor
INSERT INTO tutor (id, especialidad, disponibilidad, tarifa, favoritos_id)
VALUES (CURRVAL('usuario_id_seq'), 'Matemáticas', 'Lunes a Viernes', 20.0, NULL);

--Insertar Usuario
INSERT INTO usuario (nombre, email, password, fecha_nacimiento, created_at, updated_at)
VALUES ('Laura Fernández', 'laura.fernandez@gmail.com', 'password456', '1982-03-22', CURRENT_DATE, CURRENT_DATE)
    RETURNING id;

-- Insertar Tutor
INSERT INTO tutor (id, especialidad, disponibilidad, tarifa, favoritos_id)
VALUES (CURRVAL('usuario_id_seq'), 'Lenguaje', 'Martes y Jueves', 25.0, NULL);
--Insertar datos en la tabla sesiones
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
VALUES (1, 50.00, '2024-09-17', 'PAID'),
       (2, 30.00, '2024-09-17', 'PENDING');

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
