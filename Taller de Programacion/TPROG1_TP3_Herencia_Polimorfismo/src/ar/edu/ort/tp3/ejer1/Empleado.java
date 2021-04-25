package ar.edu.ort.tp3.ejer1;

public abstract class Empleado {

	private String nombre;
	private int edad;

	public Empleado() {

	}

	public Empleado(String nombre, int edad) {
		this.setNombre(nombre);
		this.setEdad(edad);

	}

	public String getNombre() {
		return this.nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "[Nombre=" + nombre + ", edad=" + edad + "]";
	}

	public abstract float calcularPago();
}
