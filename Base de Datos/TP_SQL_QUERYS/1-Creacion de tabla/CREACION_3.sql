
CREATE TABLE LIBRO (NRO_LIBRO int not null PRIMARY KEY, 
                     TITULO char(40),
                     AUTOR char(30),
                     TIPO char(2) FOREIGN KEY REFERENCES TIPOLIBRO(TIPO),
                     PRECIO_ORI smallmoney,
                     PRECIO_ACT smallmoney, 
                     EDICION smallint,
					 ESTADO char(1))