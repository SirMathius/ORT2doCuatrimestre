package ar.edu.ort.tp1.clase13;

import ar.edu.ort.tp1.tdas.implementaciones.ListaOrdenadaNodos;

public class ListaOrdenadaAutosPorAnioDesc extends ListaOrdenadaNodos<Integer, Auto> {

	@Override
	public int compare(Auto dato1, Auto dato2) {
		// TODO Auto-generated method stub
		return dato2.getAnio() - dato1.getAnio();
	}

	@Override
	public int compareByKey(Integer clave, Auto elemento) {
		// TODO Auto-generated method stub
		return elemento.getAnio() - clave;
	}

}
