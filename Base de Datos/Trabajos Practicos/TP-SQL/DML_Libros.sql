﻿--delete from Libros
INSERT INTO LIBRO VALUES
(5078912,'LAS MIL Y UNA NOCHES','GALLAND A.','no',20.30,34.20,1948, Null)
INSERT INTO LIBRO VALUES
(6094527,'FUENTEOVEJUNA','LOPE DE VEGA','no',18.35,32.10,1978, Null)
INSERT INTO LIBRO VALUES
(7034567,'DICCIONARIO ITALIANO-ESPANOL','CERRUTI J.','di',32.70,32.70,1992, Null)
INSERT INTO LIBRO VALUES
(8235698,'ETICA Y DEONTOLOGIA DOCENTE','RUIZ DANIEL J.','ez',54.20,76.30,1990, Null)
INSERT INTO LIBRO VALUES
(8753124,'TABLE GAMES','MARRAN','ju',12.50,13.25,1991, Null)
INSERT INTO LIBRO VALUES
(9076234,'BOTANICA MEDICINAL','TRABUT L.','es',123.48,143.20,1978, Null)
INSERT INTO LIBRO VALUES
(9456789,'EL CORONEL NO TIENE QUIEN LE ESCRIBA','GARCIA MARQUEZ GABRIEL','no',23.20,31.21,1978, Null)
INSERT INTO LIBRO VALUES
(9876079,'HISTORIA DE JULIO CESAR','OCHOA EUGENIO','es',154.30,167.20,1946, Null)
INSERT INTO LIBRO VALUES
(10545377,'LA HOJARASCA','GABRIEL GARCIA MARQUEZ','no',12.10,15.20,1988, Null)
INSERT INTO LIBRO VALUES
(10558904,'FICCIONES','BORGES JORGE LUIS','cu',23.70,25.40,1979, Null)
INSERT INTO LIBRO VALUES
(10574387,'SALON DE LECTURA','DENEVI MARCO','cu',14.50,16.10,1980, Null)
INSERT INTO LIBRO VALUES
(10654324,'HISTORIA ARGENTINA','BUSANICHE J.L.','es',56.30,59.30,1985, Null)
INSERT INTO LIBRO VALUES
(10789443,'DICCIONARIO INGLES-ESPANOL','APPLETON-CUYAS','di',98.30,123.50,1986, Null)
--
--Tipo Libro
--
INSERT INTO TIPOLIBRO VALUES
('cu', 'Cuentos')
INSERT INTO TIPOLIBRO VALUES
('di', 'Diccionario')
INSERT INTO TIPOLIBRO VALUES
('es',  'Estudio')
INSERT INTO TIPOLIBRO VALUES
('ju', 'Juegos')
INSERT INTO TIPOLIBRO VALUES
('no', 'Novela')
--
--COPIAS
--
INSERT INTO COPIAS VALUES (5078912, 1, Null)
INSERT INTO COPIAS VALUES (6094527, 1, Null)
INSERT INTO COPIAS VALUES (7034567, 1, Null)
INSERT INTO COPIAS VALUES (8235698, 1, Null)
INSERT INTO COPIAS VALUES (8753124, 1, Null)
INSERT INTO COPIAS VALUES (9076234, 1, Null)
INSERT INTO COPIAS VALUES (9456789, 1, Null)
INSERT INTO COPIAS VALUES (9876079, 1, Null)
INSERT INTO COPIAS VALUES (10545377, 1, Null)
INSERT INTO COPIAS VALUES (10558904, 1, Null)
INSERT INTO COPIAS VALUES (10574387, 1, Null)
INSERT INTO COPIAS VALUES (10654324, 1, Null)
INSERT INTO COPIAS VALUES (10789443, 1, Null)

INSERT INTO COPIAS VALUES(5078912, 2, Null)
INSERT INTO COPIAS VALUES(6094527, 2, Null)
INSERT INTO COPIAS VALUES(7034567, 2, Null)
INSERT INTO COPIAS VALUES(8235698, 2, Null)
INSERT INTO COPIAS VALUES(8753124, 2, Null)
INSERT INTO COPIAS VALUES(9076234, 2, Null)
INSERT INTO COPIAS VALUES(9456789, 2, Null)
INSERT INTO COPIAS VALUES(9876079, 2, Null)
INSERT INTO COPIAS VALUES(10545377, 2, Null)
INSERT INTO COPIAS VALUES(10558904, 2, Null)
INSERT INTO COPIAS VALUES(10574387, 2, Null)
INSERT INTO COPIAS VALUES(10654324, 2, Null)
INSERT INTO COPIAS VALUES(10789443, 2, Null)

INSERT INTO COPIAS VALUES(5078912, 3, Null)
INSERT INTO COPIAS VALUES(6094527, 3, Null)
INSERT INTO COPIAS VALUES(7034567, 3, Null)
INSERT INTO COPIAS VALUES(8235698, 3, Null)
INSERT INTO COPIAS VALUES(8753124, 3, Null)
INSERT INTO COPIAS VALUES(9076234, 3, Null)
INSERT INTO COPIAS VALUES(9456789, 3, Null)
INSERT INTO COPIAS VALUES(9876079, 3, Null)
INSERT INTO COPIAS VALUES(10545377, 3, Null)
INSERT INTO COPIAS VALUES(10558904, 3, Null)
INSERT INTO COPIAS VALUES(10574387, 3, Null)
INSERT INTO COPIAS VALUES(10654324, 3, Null)
INSERT INTO COPIAS VALUES(10789443, 3, Null)

INSERT INTO COPIAS VALUES(5078912, 4, Null)
INSERT INTO COPIAS VALUES(6094527, 4, Null)
INSERT INTO COPIAS VALUES(7034567, 4, Null)
INSERT INTO COPIAS VALUES(8235698, 4, Null)
INSERT INTO COPIAS VALUES(8753124, 4, Null)
INSERT INTO COPIAS VALUES(9076234, 4, Null)
--
--Lector
--
INSERT INTO LECTOR VALUES 
(123456,'GOMEZ Arnoldo','Avda. La Reja 2234 - Capital','EMPLEADO',1234.50, Null)
INSERT INTO LECTOR VALUES 
(123467,'FERNANDEZ Guillermo','San Pedro 987 - Moron','EJECUTIVO',3245.50, Null)
INSERT INTO LECTOR VALUES 
(123478,'GARCIA Manuel','Avda de los Sioux 2211 - Korn','VENDEDOR',1345.50, Null)
INSERT INTO LECTOR VALUES 
(123489,'VALLEJOS Pancracio','San Martin 231 - Capital Fed.','EMPLEADO',734.60, Null)
INSERT INTO LECTOR VALUES 
(123490,'APPICCIAFUOCO Gerardo','De los Rosales 234 - Merlo','EMPLEADO',534.20, Null)
INSERT INTO LECTOR VALUES 
(123491,'BANKO Lou','Tres Sargentos 333 - V.Plot','VENDEDOR',1215.30, Null)
INSERT INTO LECTOR VALUES 
(123494,'CASTAÑA Jorge','Avda. de los Peruanos 1234','EJECUTIVO',2453.90, Null)
INSERT INTO LECTOR VALUES 
(124200,'MARENGHI Pick','De las Rosas 234 - Palomar','EMPLEADO',975.40, Null)
INSERT INTO LECTOR VALUES 
(124230,'PEREZ GIL Miguel','Los Tomatoes 125 - V.Adelina','COMERCIANT',1345.45, Null)
INSERT INTO LECTOR VALUES 
(124231,'MIRANDA Hermenegildo','San Cono 901 - V.Milagros','VENDEDOR',856.30, Null)
INSERT INTO LECTOR VALUES 
(124392,'MOLINO Gualterio','Potatoes 29357 - Palermo','COMERCIANT',2356.45, Null)
INSERT INTO LECTOR VALUES 
(125376,'PIE Lemon','Rivadavia 2890 - V.Tesei','EJECUTIVO',3020.40, Null)
INSERT INTO LECTOR VALUES 
(125678,'MARTINEZ Charles','De las Amapolas 124 B.Chino','COMERCIANT',2357.40, Null)
INSERT INTO LECTOR VALUES 
(125789,'YAMIMOTO Scutter','Biela 4325 Dpto.3 4P - Cap.','COMERCIANT',1876.50, Null)
--
--
--Prestamos
--
--
INSERT INTO PRESTAMO VALUES
(123456,10545377,1,'2018-03-01', '2018-03-10')
INSERT INTO PRESTAMO VALUES
(123491,10545377,2,'2018-03-02', null)
INSERT INTO PRESTAMO VALUES
(123478,10545377,3,'2018-03-03', null)
INSERT INTO PRESTAMO VALUES
(125376,10545377,1,'2018-03-15', '2018-03-20')
INSERT INTO PRESTAMO VALUES
(123456,10545377,2,'2018-03-02', '2018-06-10')

INSERT INTO PRESTAMO VALUES
(123456,10558904,1,'2018-03-01', null)
INSERT INTO PRESTAMO VALUES
(124231,10558904,2,'2018-03-02', '2018-03-03')
INSERT INTO PRESTAMO VALUES
(124231,10558904,2,'2018-03-05', null)



INSERT INTO PRESTAMO VALUES
(123478,9456789,1,'2018-03-02', '2018-03-08')
INSERT INTO PRESTAMO VALUES
(123490, 5078912 ,4 ,'2018-03-03', null)