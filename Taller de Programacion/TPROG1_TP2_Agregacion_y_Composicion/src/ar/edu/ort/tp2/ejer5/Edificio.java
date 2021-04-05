package ar.edu.ort.tp2.ejer5;

import java.util.ArrayList;

public class Edificio {

	private ArrayList<Vivienda> viviendas;

	public Edificio() {
		viviendas = new ArrayList<>();
	}

	public void realizarMudanza(String piso1, String dep1, String piso2, String dep2) {

		Vivienda vivienda1 = buscarVivienda(piso1, dep1);

		Vivienda vivienda2 = buscarVivienda(piso2, dep2);

		this.mudarPersonas(vivienda1, vivienda2);
		this.mudarMuebles(vivienda1, vivienda2);

		System.out.println("Se a realizado la mudanza");
		System.out.println("");

	}

	private void mudarPersonas(Vivienda desde, Vivienda hasta) {
		ArrayList<Persona> personasAMudar = desde.desalojarPersonas();
		hasta.asignarPersonas(personasAMudar);

	}

	private void mudarMuebles(Vivienda desde, Vivienda hasta) {
		ArrayList<Mueble> mueblesAMudar = desde.vaciarDepartamento();
		hasta.asignarMuebles(mueblesAMudar);

	}

	private Vivienda buscarVivienda(String piso, String dep) {
		int idx = 0;
		Vivienda buscada = null;

		while (idx < this.viviendas.size() && buscada == null) {

			if (this.viviendas.get(idx).esPisoYDep(piso, dep)) {
				buscada = this.viviendas.get(idx);
			}

			idx++;
		}

		return buscada;
	}

	public void agregarVivienda(Vivienda vivienda) {
		viviendas.add(vivienda);
	}

}
