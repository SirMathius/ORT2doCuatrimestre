package ar.edu.ort.tp3.ejer2;

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

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String toString() {
		return "[Nombre=" + nombre + ", edad=" + edad + "]";
	}

	public abstract float calcularPago();

}
