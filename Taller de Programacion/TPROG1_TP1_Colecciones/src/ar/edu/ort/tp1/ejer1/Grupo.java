package ar.edu.ort.tp1.ejer1;

import java.util.ArrayList;

public class Grupo {

	// Atributos

	private String nombre;
	private ArrayList<String> integrantes;

	// Constructor

	public Grupo(String nombre) {

		// this.nombre = nombre;
		this.setNombre(nombre);
		this.integrantes = new ArrayList<>();
	}

	// Metodos

	public String getNombre() {

		return this.getNombre();

	}

	private void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public int getCantidadIntegrantes() {

		return this.integrantes.size();

	}
	
	public void agregarIntegrante(String nuevo) {
		String integrante = this.buscarIntegrante(nuevo);

		if (integrante == null) {

			integrantes.add(nuevo);
			System.out.println(nuevo + " fue asignado al grupo " + this.nombre);

		} else {
			System.out.println(nuevo + " ya existe en el grupo " + this.nombre);
		}

	}

	public void agregarIntegrante_ALT1(String nombreIntegrante) {

		if (!this.integrantes.contains(nombreIntegrante)) {
			integrantes.add(nombreIntegrante);
		}

	}

	private int obtenerPosicionIntegrante(String nombreIntegrante) {

		int posicion = -1;
		int idx = 0;

		while (idx < this.integrantes.size() && posicion == -1) {
			if (this.integrantes.get(idx).equals(nombreIntegrante)) {
				posicion = idx;
			}

			idx++;

		}

		return posicion;
	}

	private int obtenerPosicionIntegrante_ALT(String nombreIntegrante) {

		return this.integrantes.indexOf(nombreIntegrante);
	}

	public String obtenerIntegrante(int posicion) {

		return this.integrantes.get(posicion);
	}

	public String buscarIntegrante(String nombre) {

		String buscado = null;

		int idx = 0;
		while (idx < this.integrantes.size() && buscado == null) {

			if (this.integrantes.get(idx).equals(nombre)) {

				buscado = this.integrantes.get(idx);
			}

			idx++;
		}

		return buscado;
	}

	public String removerIntegrante(String nombreIntegrante) {

		String integrante = this.buscarIntegrante(nombreIntegrante);

		if (integrante != null) {
			integrantes.remove(integrante);
		}

		return integrante;
	}

	public String removerIntegrante_ALT(String nombreIntegrante) {
		int posicion = this.obtenerPosicionIntegrante(nombreIntegrante);
		return this.integrantes.remove(posicion);
	}

	private void mostrarIntegrantes() {

		int totalIntegrantes = this.getCantidadIntegrantes();
		System.out.println("Total integrantes: " + totalIntegrantes);

		for (String nombre : integrantes) {
			System.out.println(nombre);

		}
	}

	public void mostrar() {
		System.out.println("\n-------------");
		System.out.println("Grupo: " + this.nombre);
		this.mostrarIntegrantes();
		System.out.println("-------------\n");
	}

	public void vaciar() {
		this.integrantes.clear();
	}

}
