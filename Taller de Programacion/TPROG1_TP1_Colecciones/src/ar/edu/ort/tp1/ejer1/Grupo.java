package ar.edu.ort.tp1.ejer1;

import java.util.ArrayList;

public class Grupo {

	// Atributos

	private String nombre;
	private ArrayList<String> integrantes;

	// Constructor

	public Grupo(String nombre) {

		this.nombre = nombre;
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
		String integrante;

		while (idx < this.integrantes.size() && integranteRepetido) {

			if (nombreIntegrante == integrantes.get(idx)) {
				integranteRepetido = true;
			}

			idx++;

		}
		
		return integranteRepetido;

	}
	
	private int obtenerPosicionIntegrante(String nombreIntegrante) {
		
		int posicion;
		
		
		
		
		return 1;
	}

	
	
	
	
	
	
}
