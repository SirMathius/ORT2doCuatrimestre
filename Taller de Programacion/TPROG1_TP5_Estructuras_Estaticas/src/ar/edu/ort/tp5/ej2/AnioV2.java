package ar.edu.ort.tp5.ej2;

public class AnioV2 {


	// Recibe el número de mes (entre 1 y 12) y devuelve el nombre del mes en
	// cuestión.
	// posicionamiento directo.

	public String getNombreDelMes(int numeroMes) {
		
		return Mes.values()[numeroMes - 1].getNombreMes();
	}
	
	public Mes getNombreDelMesEnum(int numeroMes) {
		//devuelve el enum
		return Mes.values()[numeroMes - 1];
	}


	// Recibe el número de mes y devuelve la cantidad de días transcurridos en el
	// año antes de comenzar el mes en cuestión.

	
	public int diasTranscurridos(int numeroMes) {

		return Mes.values()[numeroMes-1].getDiasTranscurridos();
	}


}
