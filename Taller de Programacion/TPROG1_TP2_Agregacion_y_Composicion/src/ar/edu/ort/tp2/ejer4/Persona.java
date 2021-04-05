package ar.edu.ort.tp2.ejer4;

public class Persona {

	private String nombre;
	private String apellido;
	private int edad;

	public Persona(String nombre, String apellido, int edad) {
		setNombre(nombre);
		setApellido(apellido);
		setEdad(edad);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setApellido(String apellido) {
		this.apellido = apellido;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public String getDatos() {

		return this.nombre + this.apellido + ", " + this.edad + " años";

	}

}
