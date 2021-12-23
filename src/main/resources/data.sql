INSERT INTO categories (id, description)
VALUES
    (1, 'Historia'),
    (2, 'Gramática'),
    (3, 'Ciencias Naturales'),
    (4, 'Ingles'),
    (5, 'Matemáticas');

---------------------------------------------------------------------------

INSERT INTO statuses (id, description)
VALUES
    (1, 'Activo'),
    (2, 'Terminado'),
    (3, 'Forzado'),
    (4, 'Perdido'),
    (5, 'Ganado');

---------------------------------------------------------------------------

SET IDENTITY_INSERT questions ON;

INSERT INTO questions (id, description, category_id)
VALUES
    (1, '¿Qué significan las siglas ADN?', 3),
    (2, '¿Qué es la fotosíntesis?', 3),
    (3, '¿Cómo se oxigena el cuerpo humano durante la respiración?', 3),
    (5, '¿Qué utilizan los peces para respirar?', 3),
    (6, '¿Qué animales no necesitan aparearse para reproducirse?', 3),
    (7, '¿Cuáles de estos pueblos indígenas ocuparon el territorio colombiano en el periodo prehispánico?', 1),
    (8, '¿A qué suceso histórico hizo referencia Gabriel García Márquez en su obra cien años de soledad?', 1),
    (9, '¿Cuándo se separó Panamá de Colombia?', 1),
    (10, '¿Cuál fue el hecho que desencadeno el episodio conocido como el bogotazo? ', 1),
    (12, '¿En que época surgen los grupos paramilitares?', 1),
    (13, 'sustantivo y verbo son:', 2),
    (14, '¿Qué es la oración?', 2),
    (15, 'Para que una oración tenga sentido debe estar:', 2),
    (16, 'En la oración se realiza siempre una acción, es decir que siempre lleva un:', 2),
    (17, 'Llamamos sujeto a:', 2),
    (18, 'A cuántas unidades equivale 10 decenas de millar', 5),
    (19, 'Aproxima el número 58 a la decena', 5),
    (20, 'Escribe el número ordinal trigésimo quinto en cifras', 5),
    (21, 'Cuál es la representación gráfica del número nueve mil treinta y seis', 5),
    (22, 'Qué cantidad expresa el número romano V', 5),
    (23, 'I come ________ England', 4),
    (27, 'There aren\''t ________ people here', 4),
    (28, 'Tim ________ work tomorrow', 4),
    (29, '________ to school yesterday?', 4),
    (30, 'I went to the shop ________ some chocolate', 4);

SET IDENTITY_INSERT questions OFF;

--------------------------------------------------------------------------

SET IDENTITY_INSERT answer_options ON;

INSERT INTO answer_options (id, description, is_valid, question_id)
VALUES
    (1, 'Ácido desoxirribonucleico', 1, 1),
    (2, 'Ácido desoxindado', 0, 1),
    (3, 'Adrenalina', 0, 1),
    (4, 'Animales diurnos/nocturnos', 0, 1),
    (5, 'Es la conversión de materia inorgánica a materia orgánica gracias a la energía que aporta la luz del Sol', 1, 2),
    (6, 'consiste en la pérdida de agua en forma de vapor que se produce en las plantas', 0, 2),
    (7, 'Es el proceso de respiración aeróbica que tiene lugar en una planta', 0, 2),
    (8, 'son una familia de pigmentos de color verde', 0, 2),
    (9, 'En los pulmones el oxígeno inspirado pasa a la sangre', 1, 3),
    (10, 'Los pulmones almacenan el oxígeno que se está inspirando', 0, 3),
    (11, 'Los pulmones aumentan el oxígeno que tiene el aire inspirado', 0, 3),
    (12, 'En los pulmones el dióxido de carbono inspirado se transforma en oxígeno', 0, 3),
    (13, 'Branquias', 1, 5),
    (14, 'Hígado', 0, 5),
    (15, 'Pulmones', 0, 5),
    (16, 'Corazón', 0, 5),
    (17, 'Estrellas de mar', 1, 6),
    (18, 'Dragon de cómodo', 0, 6),
    (19, 'Perros', 0, 6),
    (20, 'Gallinas', 0, 6),
    (21, 'Chibchas y Arawak', 1, 7),
    (22, 'Incas y Quechuas', 0, 7),
    (23, 'Toltecas y Mayas', 0, 7),
    (24, 'Mexicas y Aztecas', 0, 7),
    (25, 'Masacre de las bananeras', 1, 8),
    (26, 'La violencia', 0, 8),
    (27, 'Batalla de Boyacá', 0, 8),
    (28, 'Narcotráfico ', 0, 8),
    (29, '1903', 1, 9),
    (30, '2003', 0, 9),
    (31, '1996', 0, 9),
    (32, '1803', 0, 9),
    (33, 'La muerte de Jorge Eliecer Gaitán', 1, 10),
    (34, 'La muerte de Camilo Torres', 0, 10),
    (35, 'La inauguración del teleférico', 0, 10),
    (36, 'Un florero', 0, 10),
    (37, 'En los 80', 1, 12),
    (38, 'En los 60', 0, 12),
    (39, 'En los 90', 0, 12),
    (40, 'En 2006', 0, 12),
    (41, 'partes de la oración', 1, 13),
    (42, 'preposiciones', 0, 13),
    (43, 'operaciones', 0, 13),
    (44, 'expresiones', 0, 13),
    (45, 'Una unidad de comunicación que posee sentido completo, independencia sintáctica y termina en pausa o punto', 1, 14),
    (46, 'formación de palabras', 0, 14),
    (47, 'conjunto de ideas', 0, 14),
    (48, 'sentido de la expresión', 0, 14),
    (49, 'Ordenada', 1, 15),
    (50, 'Clara', 0, 15),
    (51, 'Nítida', 0, 15),
    (52, 'Desordenada', 0, 15),
    (53, 'Verbo', 1, 16),
    (54, 'Principio', 0, 16),
    (55, 'Final', 0, 16),
    (56, 'Historia', 0, 16),
    (57, 'La persona, animal o cosa que realiza la acción del verbo o de quien se dice algo', 1, 17),
    (58, 'Expresiones escritas', 0, 17),
    (59, 'Las palabras agudas', 0, 17),
    (60, 'Un individuo que habla', 0, 17),
    (61, '100000 unidades', 1, 18),
    (62, '10000 unidades', 0, 18),
    (63, '1000 unidades', 0, 18),
    (64, '10000000 unidades', 0, 18),
    (65, '60', 1, 19),
    (66, '50', 0, 19),
    (67, '55', 0, 19),
    (68, '65', 0, 19),
    (69, '35', 1, 20),
    (70, '135', 0, 20),
    (71, '25', 0, 20),
    (72, '60', 0, 20),
    (73, '9036', 1, 21),
    (74, '90036', 0, 21),
    (75, '9360', 0, 21),
    (76, '936', 0, 21),
    (77, 'Cinco', 1, 22),
    (78, 'Uno', 0, 22),
    (79, 'Diez', 0, 22),
    (80, 'Veinte', 0, 22),
    (81, 'to', 1, 23),
    (82, 'from', 0, 23),
    (83, 'at', 0, 23),
    (84, 'in', 0, 23),
    (85, 'many', 1, 27),
    (86, 'a lot', 0, 27),
    (87, 'much', 0, 27),
    (88, 'some', 0, 27),
    (89, 'isn\''t going to', 1, 28),
    (90, 'isn\''t going', 0, 28),
    (91, 'isn\''t', 0, 28),
    (92, 'isn\''t to', 0, 28),
    (93, 'Did you walked', 1, 29),
    (94, 'Do you walk', 0, 29),
    (95, 'Did you walk', 0, 29),
    (96, 'Have you walked', 0, 29),
    (97, 'to buy', 1, 30),
    (98, 'for buy', 0, 30),
    (99, 'buy', 0, 30),
    (100, 'for buying', 0, 30);

SET IDENTITY_INSERT answer_options OFF;

----------------------------------------------------------------

INSERT INTO rewards (id, description, amount)
VALUES
    (1, '1', 500),
    (2, '2', 550),
    (3, '3', 620),
    (4, '4', 750),
    (5, '5', 1000);

---------------------------------------------------------------------------

INSERT INTO rounds (id, description, category_id, reward_id)
VALUES
    (1, 'Ronda 1', 1, 1),
    (2, 'Ronda 2', 2, 2),
    (3, 'Ronda 3', 3, 3),
    (4, 'Ronda 4', 4, 4),
    (5, 'Ronda 5', 5, 5);