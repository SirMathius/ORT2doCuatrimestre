package ar.edu.ort.tp2.ejer5;

public class Mueble {

	private String nombre;
	private String material;
	private String color;

	public Mueble(String nombre, String material, String color) {
		setNombre(nombre);
		setMaterial(material);
		setColor(color);
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

	private void setColor(String color) {
		this.color = color;
	}

	public String getDatos() {

		return this.nombre + " de " + this.material + " color " + this.color;

	}

}
