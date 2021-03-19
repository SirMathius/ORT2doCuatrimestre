package ar.edu.ort.tp1.ejer1;

import java.util.ArrayList;

public class Grupo {

	// Atributos

	private String nombre;
	private ArrayList<String> integrantes;

	// Constructor

	public Grupo(String nombre) {

		this.nombre = nombre;
		this.integrantes = new ArrayList<>();
	}

	// Metodos

	public String getNombre() {

		return this.getNombre();

	}

	private void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public int getCantidadIntegrantes(ArrayList<String> integrantes) {

		return integrantes.size();

	}

	public void agregarIntegrante(String nombreIntegrante) {

		if (!buscarRepetido(nombreIntegrante)) {

			integrantes.add(nombreIntegrante);

		}

	}

	private boolean buscarRepetido(String nombreIntegrante) {
		int idx = 0;
		boolean integranteRepetido = false;

		while (idx < this.integrantes.size() && integranteRepetido) {

			if (nombreIntegrante == integrantes.get(idx)) {
				integranteRepetido = true;
			}

			idx++;

		}

		return integranteRepetido;

	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {

		int posicion = 0;
		boolean encontrado = false;

		while (posicion < integrantes.size() && encontrado == false) {

			if (nombreIntegrante == integrantes.get(posicion)) {

				return posicion;

			}

			posicion++;
		}

		return -1;
	}

	public String obtenerIntegrante(int posicion) {

		return integrantes.get(posicion);
	}

	public String buscarIntegrante(String nombre) {

		int idx = 0;

		while (idx < integrantes.size() && nombre != integrantes.get(idx)) {

			if (nombre == integrantes.get(idx)) {

				return integrantes.get(idx);
			}
		}

		return null;
	}

	public String removerIntegrante(String nombreIntegrante) {

		String integrante = this.buscarIntegrante(nombreIntegrante);

		if (integrante != null) {
			integrantes.remove(integrante);

			return integrante;
		}

		return null;
	}

	private void mostrarIntegrantes() {

		int totalIntegrantes = integrantes.size();
		System.out.println(totalIntegrantes);

		for (String nombre : integrantes) {
			System.out.println(nombre);

		}
	}

	public void mostrar() {
		System.out.println(this.nombre);
		this.mostrarIntegrantes();
	}

	public void vaciar() {
		integrantes.removeAll(integrantes);
	}

}
