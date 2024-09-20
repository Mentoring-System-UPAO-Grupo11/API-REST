-- Tabla Usuario
CREATE TABLE usuarios (
                          id_usuario SERIAL PRIMARY KEY,
                          nombre VARCHAR(255) NOT NULL,
                          email VARCHAR(255) NOT NULL UNIQUE,
                          contrasena VARCHAR(255) NOT NULL,
                          rol VARCHAR(50) NOT NULL
);

-- Datos ficticios para Usuario
INSERT INTO usuarios (nombre, email, contrasena, rol) VALUES
                                                          ('Carlos Pérez', 'carlos.perez@gmail.com', 'password123', 'Tutor'),
                                                          ('María González', 'maria.gonzalez@hotmail.com', 'password123', 'Estudiante'),
                                                          ('José Ramírez', 'jose.ramirez@yahoo.com', 'password123', 'Tutor'),
                                                          ('Lucía Martínez', 'lucia.martinez@gmail.com', 'password123', 'Estudiante'),
                                                          ('Ana López', 'ana.lopez@outlook.com', 'password123', 'Tutor');

-- Tabla Tutor
CREATE TABLE tutores (
                         id_tutor SERIAL PRIMARY KEY,
                         especialidad VARCHAR(255) NOT NULL,
                         disponibilidad VARCHAR(255) NOT NULL,
                         calificacion DECIMAL(3, 2),
                         usuario_id INT REFERENCES usuarios(id_usuario)
);

-- Datos ficticios para Tutor
INSEINSERT INTO tutores (especialidad, disponibilidad, calificacion, usuario_id) VALUES
                                                                         ('Matemáticas', 'Lunes a Viernes 09:00-18:00', 4.5, 1),
                                                                         ('Programación en Python', 'Sábados 10:00-14:00', 4.7, 3),
                                                                         ('Bases de Datos', 'Lunes a Miércoles 08:00-12:00', 4.8, 5);
-- Tabla Estudiante
CREATE TABLE estudiantes (
                             id_estudiante SERIAL PRIMARY KEY,
                             nivel_estudio VARCHAR(255),
                             usuario_id INT REFERENCES usuarios(id_usuario)
);

-- Datos ficticios para Estudiante
INSERT INTO estudiantes (nivel_estudio, usuario_id) VALUES
                                                        ('Cálculo, Física', 2),
                                                        ('Programación Web, Ingeniería de Software', 4);

-- Tabla Sesión
CREATE TABLE sesiones (
                          id_sesion SERIAL PRIMARY KEY,
                          tutor_id INT REFERENCES tutores(id_tutor),
                          estudiante_id INT REFERENCES estudiantes(id_estudiante),
                          fecha TIMESTAMP WITH TIME ZONE NOT NULL,
                          duracion TIME NOT NULL,
                          estado VARCHAR(50),
                          tema VARCHAR(255)
);

-- Datos ficticios para Sesión
INSERT INTO sesiones (tutor_id, estudiante_id, fecha, duracion, estado, tema) VALUES
                                                                                  (1, 2, '2024-09-18 10:00:00+00', '01:00:00', 'Programada', 'Cálculo Diferencial'),
                                                                                  (1, 4, '2024-09-19 11:00:00+00', '02:00:00', 'En curso', 'Álgebra Lineal'),
                                                                                  (3, 2, '2024-09-20 15:00:00+00', '01:00:00', 'Completada', 'Python Básico');

-- Tabla MaterialEducativo
CREATE TABLE materiales_educativos (
                                       id_material SERIAL PRIMARY KEY,
                                       tipo VARCHAR(50),
                                       descripcion TEXT,
                                       enlace TEXT,
                                       sesion_id INT REFERENCES sesiones(id_sesion)
);

-- Datos ficticios para MaterialEducativo
INSERT INTO materiales_educativos (tipo, descripcion, enlace, sesion_id) VALUES
                                                                             ('PDF', 'Guía de Cálculo Diferencial', 'http://ejemplo.com/calculo.pdf', 1),
                                                                             ('Video', 'Explicación de Álgebra Lineal', 'http://ejemplo.com/algebra.mp4', 2);

-- Tabla Pago
CREATE TABLE pagos (
                       id_pago SERIAL PRIMARY KEY,
                       sesion_id INT REFERENCES sesiones(id_sesion),
                       monto DECIMAL(10, 2) NOT NULL,
                       metodo_pago VARCHAR(50),
                       estado VARCHAR(50)
);

-- Datos ficticios para Pago
INSERT INTO pagos (sesion_id, monto, metodo_pago, estado) VALUES
                                                              (1, 30.00, 'Tarjeta de Crédito', 'Completado'),
                                                              (2, 60.00, 'Paypal', 'Completado'),
                                                              (3, 45.00, 'Tarjeta de Débito', 'Completado');

-- Tabla Reseña
CREATE TABLE resenas (
                         id_resena SERIAL PRIMARY KEY,
                         calificacion INT NOT NULL,
                         comentarios TEXT,
                         usuario_id INT REFERENCES usuarios(id_usuario),
                         tutor_id INT REFERENCES tutores(id_tutor)
);

-- Datos ficticios para Reseña
INSERT INTO resenas (calificacion, comentarios, usuario_id, tutor_id) VALUES
                                                                          (5, 'Excelente tutor, muy claro.', 2, 1),
                                                                          (4, 'Buena clase, aunque podría mejorar el ritmo.', 4, 1),
                                                                          (5, 'Explicación muy precisa y útil.', 2, 3);

-- Tabla Asistencia
CREATE TABLE asistencias (
                             id_asistencia SERIAL PRIMARY KEY,
                             estado VARCHAR(50),
                             fecha_asistencia TIMESTAMP,
                             estudiante_id INT REFERENCES estudiantes(id_estudiante),
                             sesion_id INT REFERENCES sesiones(id_sesion)
);

-- Datos ficticios para Asistencia
INSERT INTO asistencias (estado, fecha_asistencia, estudiante_id, sesion_id) VALUES
                                                                                 ('Asistió', '2024-09-18 10:00:00+00', 2, 1),
                                                                                 ('No asistió', '2024-09-19 11:00:00+00', 4, 2);
