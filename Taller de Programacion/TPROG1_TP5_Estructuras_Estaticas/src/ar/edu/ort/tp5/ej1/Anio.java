package ar.edu.ort.tp5.ej1;

public class Anio {

	private String[] nombres = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "junio", "Julio", "Agosto", "Septiembre",
			"Octubre", "Noviembre", "Diciembre" };

	private int[] cantDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	// Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
	// cuestión.
	// posicionamiento directo.

	public String getNombreDelMes(int numeroMes) {

		return this.nombres[numeroMes - 1];
	}

	// Recibe el número de mes y devuelve la cantidad de días transcurridos en el
	// año antes de comenzar el mes en cuestión.

	public int diasTranscurridos(int numeroMes) {
		int acum = 0;
		int index = 0;
		while(index<numeroMes-1) {
			
			acum+= this.cantDias[index];
			index++;
			
		}
		return acum;
	}

}
