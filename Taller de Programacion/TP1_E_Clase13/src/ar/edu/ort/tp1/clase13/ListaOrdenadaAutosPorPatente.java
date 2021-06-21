package ar.edu.ort.tp1.clase13;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaAutosPorPatente extends ListaOrdenadaNodos<String, Auto> {

	@Override
	public int compare(Auto dato1, Auto dato2) {

		return dato1.getPatente().compareTo(dato2.getPatente());
	}

	@Override
	public int compareByKey(String clave, Auto elemento) {

		return clave.compareTo(elemento.getPatente());
	}

	
	
}
