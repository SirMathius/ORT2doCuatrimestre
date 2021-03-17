package ar.edu.ort.tp1.clase2.clases;

import java.util.ArrayList;

public class Funcion {

	private String dia;
	private String horaInicio;
	private ArrayList<Asiento> asientos;

	public Funcion(String dia, String horaInicio) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.asientos = new ArrayList<Asiento>();
	}

}
