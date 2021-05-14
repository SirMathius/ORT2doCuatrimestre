/*
1. Indicar cu�les son los t�tulos y autores de los libros cuyo tipo sea �no� y sus precios
originales superen los $21.
*/

SELECT TITULO, AUTOR 
FROM LIBRO
WHERE TIPO = 'no' AND PRECIO_ORI > 21;

/*
2. �Cu�les son los n�meros, precios originales y ediciones de los libros cuyo tipo sea �no�
o que sus precios originales superen $21 y las ediciones sean posteriores a 1985?
*/

SELECT NRO_LIBRO, PRECIO_ORI, EDICION
FROM LIBRO
WHERE (TIPO ='no' OR PRECIO_ORI > 21) AND EDICION > 1985;

/*
3. Obtener la lista autores y ediciones de los libros cuyos nombres de autores comiencen
con la letra L
*/

SELECT AUTOR, EDICION
FROM LIBRO
WHERE AUTOR LIKE 'L%';

/*
4. Obtener la lista de autores y ediciones de los libros cuyos nombres de autores no
comiencen con la letra G. 
*/

SELECT AUTOR, EDICION
FROM LIBRO
WHERE AUTOR NOT LIKE 'G%';

/*
5. Obtener la lista de autores, precios originales y ediciones de los libros cuyos autores
tengan la hilera "RR" en alg�n lugar del nombre
*/

SELECT AUTOR, PRECIO_ORI, EDICION
FROM LIBRO
WHERE AUTOR LIKE '%RR%';

/*
6. Obtener la lista de t�tulos y ediciones de aquellos libros cuyos precios originales no
est�n comprendidos entre $12 y $25.
*/

SELECT TITULO, EDICION
FROM LIBRO
WHERE PRECIO_ORI NOT BETWEEN 12 AND 25;

/*
7. Obtener todos los tipos y ediciones DISTINTAS(en tipo y Edici�n) de los libros,
ordenado por Edici�n y a�o de edici�n ascendente.
*/

SELECT DISTINCT TIPO, EDICION
FROM LIBRO
ORDER BY EDICION ASC;

/*
8. Listar los n�meros, ediciones, tipos, precios originales, precios actuales y diferencias
de precios para todos los libros clasificado por tipo y por dicha diferencia en forma
ascendente, en ese orden.
*/

SELECT NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT, (PRECIO_ACT - PRECIO_ORI) AS DIFF_PRECIO
FROM LIBRO
ORDER BY TIPO ASC, DIFF_PRECIO ASC;

/*
9. Listar los n�meros, ediciones, tipos, precios originales, precios actuales y diferencias
de precios para todos los libros de estudio.
*/

SELECT NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT, (PRECIO_ACT - PRECIO_ORI) AS DIFF_PRECIO
FROM LIBRO
WHERE TIPO = 'es';

/*
10. �Cu�les son los n�meros, precios originales y ediciones de los libros cuyas ediciones
son posteriores a 1985 y adem�s o bien el tipo es �no� o el precio original supera $21?
*/

SELECT NRO_LIBRO, PRECIO_ORI, EDICION
FROM LIBRO
WHERE EDICION > 1985 AND (TIPO = 'no' OR PRECIO_ORI > 21);

/*
11. �Cu�les son los t�tulos y nombres de los autores de los libros cuyo tipo sea �no� o
aquellos cuyos precios de origen superan $21?
*/

SELECT TITULO, AUTOR
FROM LIBRO
WHERE TIPO = 'no' OR PRECIO_ORI > 21;

/*
12. Obtener la lista de t�tulos y precios originales de los libros que se editaron en 1948,
1978 y 1985
*/

SELECT TITULO, PRECIO_ORI
FROM LIBRO
WHERE EDICION IN (1948,1978,1985);

/*
13. Obtener los t�tulos y ediciones de los libros cuyos precios originales est�n dentro del
rango de $12 a $25 inclusive
*/

SELECT TITULO, PRECIO_ORI
FROM LIBRO
WHERE PRECIO_ORI BETWEEN 12 AND 25;

/*
14. Obtener la lista de t�tulos, precios originales y ediciones de aquellos libros cuyos t�tulos
tengan las letras "R" y "S" en alg�n lugar y en ese orden.
*/

SELECT TITULO, PRECIO_ORI, EDICION
FROM LIBRO
WHERE TITULO LIKE '%R%' AND TITULO LIKE '%S%';

/*
15. Obtener la lista de t�tulos, precios originales y ediciones de aquellos libros que tengan
la letra "A" en la segunda posici�n del t�tulo.
*/

SELECT TITULO, PRECIO_ORI, EDICION
FROM LIBRO
WHERE TITULO LIKE '_A%';

/*
16. Ordenar en secuencia ascendente por a�o de edici�n los t�tulos de los libros cuyo tipo
sea �no�. Listar tambi�n la edici�n.
*/

SELECT EDICION, TITULO
FROM LIBRO
WHERE TIPO = 'no'
ORDER BY EDICION ASC;

/*
17. Listar los n�meros, ediciones y tipos de libros cuyos precios originales superen los $20.
Clasificar por edici�n en forma descendente y por n�mero de libro ascendente en ese
orden.
*/

SELECT NRO_LIBRO, EDICION, TIPO
FROM LIBRO
WHERE PRECIO_ORI > 20
ORDER BY EDICION ASC,  NRO_LIBRO ASC;

/*
18. Listar los n�meros, ediciones, tipos, precios originales, precios actuales y diferencias
de precios para todos los libros cuyas diferencias de precio sean superiores a $10.
*/

SELECT NRO_LIBRO, EDICION, TIPO, PRECIO_ORI, PRECIO_ACT, (PRECIO_ACT - PRECIO_ORI) AS DIFF_PRECIO
FROM LIBRO
WHERE (PRECIO_ACT - PRECIO_ORI) > 10;

/*
19. Listar los n�meros, ediciones, tipos, precios originales, precios actuales y diferencias
de precios para todos los libros cuyas diferencias de precio sean superiores a $10,
clasificado por dicha diferencia en forma descendente.
*/

SELECT NRO_LIBRO, L.EDICION, TIPO, PRECIO_ORI, PRECIO_ACT, (PRECIO_ACT - PRECIO_ORI) AS DIFF_PRECIO
FROM LIBRO L
WHERE (PRECIO_ACT - PRECIO_ORI) > 10
ORDER BY DIFF_PRECIO DESC;