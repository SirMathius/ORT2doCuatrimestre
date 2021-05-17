package ar.edu.ort.tp1clase7;

import javax.management.RuntimeErrorException;

// Su nombre no puede ser null ni estar vacio
// Su anio no puede ser menor a 1800 ni mayor a 2021

public class Persona {
	
	private String nombre;
	private int anioNac;
	
	
	public Persona(String nombre, int anioNac) {
		super();
		this.setNombre(nombre);
		this.setAnioNac(anioNac);
	}


	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", anioNac=" + anioNac + "]";
	}


	private void setNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			// NOMBRE INVALIDO
			// lanzar excepcion
			throw new RuntimeException("Nombre invalido");
		}
		this.nombre = nombre;
	}


	private void setAnioNac(int anioNac) {
		
		if (anioNac < 1800 || anioNac > 2021) {
			// ANIO INVALIDO
			// lanzar excepcion
			throw new RuntimeException("Año invalido");
		}
		this.anioNac = anioNac;
	}
	
	
	
	
	
	
}
