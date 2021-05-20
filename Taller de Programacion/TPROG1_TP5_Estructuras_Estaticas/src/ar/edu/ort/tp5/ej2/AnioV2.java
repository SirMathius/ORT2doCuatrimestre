package ar.edu.ort.tp5.ej2;

public class AnioV2 {

	private int[] cantDias = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	
	private int[] diasTranscurridos = { 0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334 };

	// Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
	// cuestión.
	// posicionamiento directo.

	public String getNombreDelMes(int numeroMes) {
		
		return Mes.values()[numeroMes - 1].getNombreMes();
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
	
	public int diasTranscurridos2(int numeroMes) {

		return diasTranscurridos[numeroMes-1];
	}


}
