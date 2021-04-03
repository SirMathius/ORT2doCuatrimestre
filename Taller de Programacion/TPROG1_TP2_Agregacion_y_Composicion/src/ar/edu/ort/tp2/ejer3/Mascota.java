package ar.edu.ort.tp2.ejer3;

public class Mascota {

	private String nombre;
	private String tipoDeAnimal;

	public Mascota(String nombre, String tipoDeAnimal) {

		setNombre(nombre);
		setTipoDeAnimal(tipoDeAnimal);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setTipoDeAnimal(String tipoDeAnimal) {
		this.tipoDeAnimal = tipoDeAnimal;
	}

	public String getValor() {
		return this.tipoDeAnimal + ", " + this.nombre;
	}

}
