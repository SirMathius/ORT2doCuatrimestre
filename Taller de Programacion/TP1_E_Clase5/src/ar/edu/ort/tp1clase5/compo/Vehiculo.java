package ar.edu.ort.tp1clase5.compo;

public class Vehiculo {

	private String marca;
	private String color;

	// NUNCA
	public boolean elProfeSeSaca2;
	// NUNCA
	protected int valorProtegido;

	private void unMetodoPrivado() {
		System.out.println("Soy privado");
	}

	public void conducir() {
		System.out.println("estoy conduciendo");
	}

	public void mostrarDatos() {
		System.out.printf("mi marca es: %s - y mi color es: %s \n", marca, color);
	}

}
