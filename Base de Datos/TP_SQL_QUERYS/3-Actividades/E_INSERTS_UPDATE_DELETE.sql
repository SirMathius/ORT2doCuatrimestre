/*
1. Agregar un nuevo LIBRO y sus respectivos valores a la tabla COPIAS.
*/

INSERT INTO LIBRO
(NRO_LIBRO, TITULO, AUTOR, TIPO, PRECIO_ORI, PRECIO_ACT, EDICION, ESTADO)
VALUES
(18181818, 'EL SE?OR DE LOS ANILLOS', 'J.R.R. TOKIEN', 'no', 1200.00, 2600.50, 2005, NULL);

INSERT INTO COPIAS
VALUES ( 18181818, 1, NULL);
INSERT INTO COPIAS
VALUES ( 18181818, 2, NULL);
INSERT INTO COPIAS
VALUES ( 18181818, 3, NULL);

/*
2. Modificar el precio Actual del Libro LAS MIL Y UNA NOCHES a 35.35
*/

UPDATE LIBRO
SET PRECIO_ACT = 35.35
WHERE TITULO = 'LAS MIL Y UNA NOCHES';

/*
3. Eliminar los lectores cuyo salario sea menor $ 1000. ?Cu?ntos lectores se han
eliminado?
*/

DELETE FROM LECTOR 
WHERE SALARIO < 1000;

/*
Msg 547, Level 16, State 0, Line 30
The DELETE statement conflicted with the REFERENCE constraint "FK__PRESTAMO__NRO_LE__182C9B23". The conflict occurred in database "DB1_TP", table "dbo.PRESTAMO", column 'NRO_LECTOR'.
The statement has been terminated.
*/