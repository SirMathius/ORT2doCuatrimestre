package ar.edu.ort.tp5.ej3;

import java.util.ArrayList;

public class GastoAnual {

	private ArrayList<Rubro> rubros;

	public GastoAnual(ArrayList<Rubro> rubros) {

		this.rubros = new ArrayList<>();

	}

	public void agregarGastos(Mes mes, String nombreRubro, double importe) throws RuntimeException {

		if (importe < 0) {
			throw new RuntimeException("Importe invalido");
		}
		
	}
	
	private Rubro obtenerRubro(String nombreRubro) {
		
	}
	
	private Rubro buscarRubro(String nombreRubro) {
		
	}
	
	

}
