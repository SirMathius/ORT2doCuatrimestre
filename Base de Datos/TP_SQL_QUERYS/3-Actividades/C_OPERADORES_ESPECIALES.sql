/*
1. Obtener los cinco primeros caracteres de los nombres de todos los lectores de libros
*/

SELECT SUBSTRING (NOMBRE, 1, 5) AS SHORT
FROM LECTOR ;


/*
2. Listar los nombres y la direcci�n de los lectores que tienen libros a pr�stamo (usar
subconsultas)
*/

SELECT NOMBRE, DIRECCION
FROM LECTOR
WHERE NRO_LECTOR = ANY(SELECT NRO_LECTOR FROM PRESTAMO WHERE F_DEVOL IS NULL);

/*
3. Listar el n�mero, t�tulo y precio actual del libro que tenga el m�ximo precio original.
*/

SELECT NRO_LIBRO, TITULO, PRECIO_ACT
FROM LIBRO
WHERE PRECIO_ORI = (SELECT MAX(PRECIO_ORI) FROM LIBRO);

/*
4. Listar el n�mero, t�tulo y precio original de aquellos libros cuyos precios originales sean
m�s altos que el promedio de precios actuales de todos los libros.
*/

SELECT NRO_LIBRO, TITULO, PRECIO_ORI
FROM LIBRO 
WHERE PRECIO_ORI > (SELECT AVG(PRECIO_ACT) AS PROMEDIO_ACT FROM LIBRO);

/*
5. Listar los n�meros, t�tulos y precios originales de aquellos libros cuyos precios
originales sean mayores que todos y cada uno de los precios originales de las novelas.
*/

SELECT NRO_LIBRO, TITULO, PRECIO_ORI
FROM LIBRO
WHERE PRECIO_ORI > (SELECT MAX(PRECIO_ORI) AS MAXIMO_ORI FROM LIBRO WHERE TIPO = 'no');

/*
6. Listar los n�meros, t�tulos y precios originales de aquellos libros cuyos precios
originales sean mayores que alguno cualquiera de los precios originales de las novelas
*/

SELECT NRO_LIBRO, TITULO, PRECIO_ORI
FROM LIBRO
WHERE  PRECIO_ORI > ANY (SELECT PRECIO_ORI AS MAXIMO_ORI FROM LIBRO WHERE TIPO = 'no');