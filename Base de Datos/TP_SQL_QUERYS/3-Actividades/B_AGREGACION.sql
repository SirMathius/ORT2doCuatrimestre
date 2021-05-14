/*
1. Obtener la suma y el promedio de los precios originales y el mínimo y el máximo de los
precios actuales para todos los libros cuyo año de edición sea mayor a 1970
*/

SELECT 
SUM(PRECIO_ORI) AS SUMA_ORI, 
AVG(PRECIO_ORI) AS PROMEDIO_ORI, 
MIN(PRECIO_ACT) AS MINIMO_ACT, 
MAX(PRECIO_ACT) AS MAXIMO_ACT
FROM LIBRO
WHERE EDICION > 1970;

/*
2. Obtener de la suma total de la suma de los precios originales más los actuales, el
promedio de dicha suma y el mínimo y el máximo de las diferencias de precios para
todos los libros cuyo año de edición sea superior a 1970.
*/

SELECT 
SUM(PRECIO_ORI + PRECIO_ACT) AS SUMA_TOTAL,
AVG(PRECIO_ORI + PRECIO_ACT) AS PROMEDIO_SUMA_TOTAL , 
MIN(PRECIO_ACT - PRECIO_ORI) AS MINIMO_DIFF, 
MAX(PRECIO_ACT - PRECIO_ORI) AS MAXIMO_DIFF
FROM LIBRO
WHERE EDICION > 1970;

/*
3. Listar la cantidad de libros, los distintos tipos de libros, el mínimo y el máximo del
precio original, pero sólo para aquellos libros cuyo precio original supere los $45. 
*/

SELECT 
COUNT(NRO_LIBRO) AS CANT_LIBROS,
TIPO,
MIN(PRECIO_ORI) AS MINIMO_ORI,
MAX(PRECIO_ORI) AS MAXIMO_ORI
FROM LIBRO
WHERE PRECIO_ORI > 45
GROUP BY TIPO;

/*
Listar los tipos de libros, totales de precios originales, promedios de precios actuales,
resumidos por tipo de libro y para los libros cuyas ediciones no sean de 1946, pero sólo
para aquellos tipos de libros cuya sumatoria de precios originales supere $40.
*/

SELECT
TIPO,
SUM(PRECIO_ORI) AS SUMA_ORI,
AVG(PRECIO_ACT) AS PROMEDIO_ACT
FROM LIBRO
WHERE EDICION != 1946
GROUP BY TIPO
HAVING SUM(PRECIO_ORI) > 30;

/*
5. Listar los tipos de libros y promedios de precios originales agrupados por tipos, para
aquellos tipos que tengan el promedio de sus precios originales por arriba del
promedio de precios originales de todos los libros.
*/

SELECT 
TIPO,
AVG(PRECIO_ORI) PROMEDIO_ORI
FROM LIBRO
GROUP BY TIPO
HAVING AVG(PRECIO_ORI) > (SELECT AVG(PRECIO_ORI) AS PROM_ORI_TOT FROM LIBRO);

/*
6. Listar los tipos de libros, totales de precios originales y promedios de precios actuales,
de aquellos libros que fueron editados entre 1946 y 1975, resumidos por tipo de libro.
*/

SELECT 
TIPO, 
SUM(PRECIO_ORI) TOTAL_ORI, 
AVG(PRECIO_ACT) AS PROMEDIO_ACT
FROM LIBRO
WHERE EDICION BETWEEN 1946 AND 1975
GROUP BY TIPO;

/*
7. Listar los tipos de libros, totales de precios originales y promedios de precios actuales,
de aquellos libros que no fueron editados en 1946, resumidos por tipo de libro
clasificado por promedio de precios actuales de menor a mayor.
*/

SELECT 
TIPO, 
SUM(PRECIO_ORI) SUMA_ORI, 
AVG(PRECIO_ACT) AS PROMEDIO_ACT
FROM LIBRO
WHERE EDICION != 1946
GROUP BY TIPO
ORDER BY PROMEDIO_ACT ASC;

/*
8. Listar los tipos de libros, totales de precios originales y promedios de precios actuales,
de aquellos libros que fueron editados entre 1946 y 1975, resumidos por tipo de libro.
*/

SELECT
TIPO,
SUM(PRECIO_ORI) AS TOTAL_ORI,
AVG(PRECIO_ACT) AS PROMEDIO_ACT
FROM LIBRO
WHERE EDICION BETWEEN 1946 AND 1975
GROUP BY TIPO;

/*
9. Listar el salario máximo agrupado por el tipo de trabajo.
*/

SELECT 
TRABAJO, 
MAX(SALARIO) AS MAX_SALARIO 
FROM LECTOR
GROUP BY TRABAJO;

/*
10. Listar el salario promedio agrupado por tipo de trabajo de los lectores que viven en
capital.
*/

SELECT
TRABAJO, 
AVG(SALARIO) AS PROMEDIO_SALARIO
FROM LECTOR
WHERE DIRECCION LIKE '%CAP%'
GROUP BY TRABAJO;