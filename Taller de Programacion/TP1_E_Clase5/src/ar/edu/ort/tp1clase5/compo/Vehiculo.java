package ar.edu.ort.tp1clase5.compo;

import java.util.ArrayList;

public class Vehiculo {

	private ArrayList<Persona> pasajeros;
	private String marca;
	private String color;

	// atributo con visibilidad default
	String atrivDefault;

	// NUNCA
	public boolean elProfeSeSaca2;
	// NUNCA
	protected int valorProtegido;

	// Constructor
	public Vehiculo(String marca, String color) {
		this.marca = marca;
		this.color = color;
		this.pasajeros = new ArrayList<>();
		System.out.println("constructor de la clase Vehiculo");
	}

	public Vehiculo(String marca) {
		this(marca, "Negro");
	}

	private void unMetodoPrivado() {
		System.out.println("Soy privado");
	}

	public void conducir() {
		System.out.println("estoy conduciendo");
	}

	public void mostrarDatos() {
		System.out.printf("mi marca es: %s - y mi color es: %s \n", marca, color);
	}

	protected void agregarPasajero(Persona p) {
		this.pasajeros.add(p);

	}

}
