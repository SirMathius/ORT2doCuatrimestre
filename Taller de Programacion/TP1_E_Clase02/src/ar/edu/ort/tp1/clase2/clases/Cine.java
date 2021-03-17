package ar.edu.ort.tp1.clase2.clases;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	private String pelicula;
	private ArrayList<Funcion> funciones;

	public Cine(String nombre, String peli) {

		this.nombre = nombre;
		this.pelicula = pelicula;
		this.funciones = new ArrayList<Funcion>();
	}

	public boolean procesarEntradas(ArrayList<Entrada> entradasAProcesar) {
		int idx = 0;
		boolean entradasOk = true;

		while (idx < entradasAProcesar.size() && entradasOk) {

			idx++;
		}
		return entradasOk;
	}
}
