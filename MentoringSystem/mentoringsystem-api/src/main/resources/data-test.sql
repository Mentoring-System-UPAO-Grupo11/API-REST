-- Tabla usuarios
INSERT INTO usuarios (nombre, email, tipo) VALUES
                                               ('Carlos Pérez', 'carlos.perez@gmail.com', 'tutor'),
                                               ('María González', 'maria.gonzalez@hotmail.com', 'estudiante'),
                                               ('José Ramírez', 'jose.ramirez@yahoo.com', 'tutor'),
                                               ('Lucía Martínez', 'lucia.martinez@gmail.com', 'estudiante'),
                                               ('Ana López', 'ana.lopez@outlook.com', 'tutor');

-- Tabla tutores
INSERT INTO tutores (id, especialidad, disponibilidad, tarifa) VALUES
                                                                   (1, 'Matemáticas', 'Lunes a Viernes 09:00-18:00', 30.00),
                                                                   (3, 'Programación en Python', 'Sábados 10:00-14:00', 45.00),
                                                                   (5, 'Bases de Datos', 'Lunes a Miércoles 08:00-12:00', 50.00),
                                                                   (1, 'Cálculo', 'Martes y Jueves 10:00-12:00', 40.00),
                                                                   (3, 'Ingeniería de Software', 'Viernes 13:00-17:00', 60.00);

-- Tabla estudiantes
INSERT INTO estudiantes (id, intereses_academicos, preferencias, historial_academico) VALUES
                                                                                          (2, 'Cálculo, Física', 'Clases en la mañana', 'Excelentes calificaciones en Matemáticas'),
                                                                                          (4, 'Programación Web, Ingeniería de Software', 'Clases los fines de semana', 'Promedio alto en programación'),
                                                                                          (2, 'Estadística, Algebra', 'Tutorías intensivas', 'Historial académico destacable en álgebra'),
                                                                                          (4, 'Base de Datos', 'Clases en la tarde', 'Buen rendimiento en materias técnicas'),
                                                                                          (2, 'Física Aplicada', 'Sesiones prácticas', 'Altos puntajes en exámenes de física');

-- Tabla sesiones
INSERT INTO sesiones (tutor_id, estudiante_id, fecha, hora, duracion, tema, estado) VALUES
                                                                                        (1, 2, '2024-09-18 10:00:00+00', '10:00', '1 hour', 'Cálculo Diferencial', 'programada'),
                                                                                        (1, 4, '2024-09-19 11:00:00+00', '11:00', '2 hours', 'Álgebra Lineal', 'en curso'),
                                                                                        (3, 2, '2024-09-20 15:00:00+00', '15:00', '1 hour', 'Python Básico', 'completada'),
                                                                                        (5, 4, '2024-09-21 09:00:00+00', '09:00', '1 hour 30 minutes', 'SQL Avanzado', 'programada'),
                                                                                        (5, 2, '2024-09-22 08:00:00+00', '08:00', '2 hours', 'Modelado de Datos', 'completada');

-- Tabla materiales
INSERT INTO materiales (sesion_id, tipo, descripcion, enlace) VALUES
                                                                  (1, 'PDF', 'Guía de Cálculo Diferencial', 'http://ejemplo.com/calculo.pdf'),
                                                                  (2, 'Video', 'Explicación de Álgebra Lineal', 'http://ejemplo.com/algebra.mp4'),
                                                                  (3, 'Ejercicios', 'Ejercicios de Python Básico', 'http://ejemplo.com/python_exercises.pdf'),
                                                                  (4, 'Presentación', 'Diapositivas de SQL Avanzado', 'http://ejemplo.com/sql.ppt'),
                                                                  (5, 'Artículo', 'Artículo sobre Modelado de Datos', 'http://ejemplo.com/modelado.pdf');

-- Tabla evaluaciones
INSERT INTO evaluaciones (sesion_id, calificacion, comentarios) VALUES
                                                                    (1, 5, 'Excelente tutor, muy claro.'),
                                                                    (2, 4, 'Buena clase, aunque podría mejorar el ritmo.'),
                                                                    (3, 5, 'Explicación muy precisa y útil.'),
                                                                    (4, 3, 'La clase fue buena, pero demasiado rápida.'),
                                                                    (5, 5, 'Muy completo el material y la explicación.');

-- Tabla pagos
INSERT INTO pagos (sesion_id, monto, metodo_pago, estado) VALUES
                                                              (1, 30.00, 'Tarjeta de Crédito', 'completado'),
                                                              (2, 60.00, 'Paypal', 'completado'),
                                                              (3, 45.00, 'Tarjeta de Débito', 'completado'),
                                                              (4, 75.00, 'Transferencia Bancaria', 'pendiente'),
                                                              (5, 50.00, 'Paypal', 'completado');

-- Tabla busquedas
INSERT INTO busquedas (usuario_id, terminos, resultados) VALUES
                                                             (2, 'Clases de Cálculo Diferencial', 'Carlos Pérez, disponible'),
                                                             (4, 'Programación Web en Python', 'José Ramírez, disponible'),
                                                             (2, 'Álgebra Lineal tutor', 'Carlos Pérez, disponible'),
                                                             (4, 'SQL Avanzado', 'Ana López, disponible'),
                                                             (2, 'Modelado de Datos', 'Ana López, disponible');

-- Tabla favoritos
INSERT INTO favoritos (usuario_id, tipo, elemento_id) VALUES
                                                          (2, 'tutor', 1),
                                                          (2, 'tutor', 3),
                                                          (4, 'tutor', 5),
                                                          (4, 'material', 3),
                                                          (4, 'material', 5);

-- Tabla cursos
INSERT INTO cursos (nombre, descripcion) VALUES
                                             ('Python Básico', 'Curso introductorio de Python para principiantes.'),
                                             ('SQL Avanzado', 'Curso de SQL para gestión avanzada de bases de datos.'),
                                             ('Cálculo Diferencial', 'Curso completo de Cálculo Diferencial.'),
                                             ('Álgebra Lineal', 'Fundamentos y aplicaciones del Álgebra Lineal.'),
                                             ('Bases de Datos Relacionales', 'Diseño y gestión de bases de datos relacionales.');

-- Tabla resenas
INSERT INTO resenas (usuario_id, tutor_id, calificacion, comentarios) VALUES
                                                                          (2, 1, 5, 'Excelente tutor, siempre dispuesto a ayudar.'),
                                                                          (4, 3, 4, 'Buena clase, pero necesita mejorar la interacción.'),
                                                                          (2, 1, 5, 'Muy profesional y puntual.'),
                                                                          (4, 5, 5, 'Material muy bien explicado.'),
                                                                          (2, 5, 4, 'Clases muy claras y bien estructuradas.');
