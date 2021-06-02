package ar.edu.ort.tp5.ej2;

public class AnioV2 {


	// Recibe el n�mero de mes (entre 1 y 12) y devuelve el nombre del mes en
	// cuesti�n.
	// posicionamiento directo.

	public String getNombreDelMes(int numeroMes) {
		
		return Mes.values()[numeroMes - 1].getNombreMes();
	}
	
	public Mes getNombreDelMesEnum(int numeroMes) {
		//devuelve el enum
		return Mes.values()[numeroMes - 1];
	}


	// Recibe el n�mero de mes y devuelve la cantidad de d�as transcurridos en el
	// a�o antes de comenzar el mes en cuesti�n.

	
	public int diasTranscurridos(int numeroMes) {

		return Mes.values()[numeroMes-1].getDiasTranscurridos();
	}


}
