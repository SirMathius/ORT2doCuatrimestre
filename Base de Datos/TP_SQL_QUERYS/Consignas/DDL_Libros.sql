/* DDL de Creacion de Tablas */

CREATE TABLE LIBRO (NRO_LIBRO int not null PRIMARY KEY, 
                     TITULO char(40),
                     AUTOR char(30),
                     TIPO char(2),
                     PRECIO_ORI smallmoney,
                     PRECIO_ACT smallmoney, 
                     EDICION smallint,
					 ESTADO char(1))
--
CREATE TABLE TIPOLIBRO (TIPO char(2) not null PRIMARY KEY,
			DESCTIPO char(40))
--
CREATE TABLE LECTOR (NRO_LECTOR int not null PRIMARY KEY,
                     NOMBRE char(22),
                     DIRECCION char(30),
                     TRABAJO char(10),
                     SALARIO smallmoney,
					 ESTADO char(1))
--
CREATE TABLE COPIAS (NRO_LIBRO int not null,
                       NRO_COPIA smallint not null,
					   ESTADO char(1)
					   CONSTRAINT LIRBO_COPIA PRIMARY KEY (NRO_LIBRO, NRO_COPIA)
)
--
CREATE TABLE PRESTAMO (NRO_PRESTAMO int not null IDENTITY (1,1) PRIMARY KEY,
					   NRO_LECTOR int,
                       NRO_LIBRO int,
                       NRO_COPIA smallint,
                       F_PREST datetime,
                       F_DEVOL datetime)

