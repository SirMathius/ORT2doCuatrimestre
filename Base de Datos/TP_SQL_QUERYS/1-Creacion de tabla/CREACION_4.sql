
CREATE TABLE COPIAS (NRO_LIBRO int FOREIGN KEY REFERENCES LIBRO(NRO_LIBRO),
                       NRO_COPIA smallint,
					   ESTADO char(1))

CREATE TABLE PRESTAMO (NRO_LECTOR int FOREIGN KEY REFERENCES LECTOR(NRO_LECTOR),
                       NRO_LIBRO int FOREIGN KEY REFERENCES LIBRO(NRO_LIBRO),
                       NRO_COPIA smallint,
                       F_PREST datetime,
                       F_DEVOL datetime)