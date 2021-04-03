package ar.edu.ort.tp2.ejer3;

import java.util.ArrayList;

public class Hito {
	
	private String fecha;
	private String descripcion;
	private ArrayList<Persona> personasInvolucradas;
	
	public Hito(String fecha, String descripcion, ArrayList<Persona> personasInvolucradas) {
		
		setFecha(fecha);
		setDescripcion(descripcion);
		personasInvolucradas = new ArrayList<>();
	}

	private void setFecha(String fecha) {
		this.fecha = fecha;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String toString() {
		return "Hito [fecha=" + fecha + ", descripcion=" + descripcion + "]";
	}

	public void agregarPersona(Persona persona) {
		personasInvolucradas.add(persona);
		
	}

	public void removerPersona(Persona persona) {
		personasInvolucradas.remove(persona);
		
	}

	

}
