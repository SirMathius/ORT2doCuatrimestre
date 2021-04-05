package ar.edu.ort.tp2.ejer4;

import java.util.ArrayList;

public class Vivienda {

	private int numero;
	private ArrayList<Persona> personas;
	private ArrayList<Mueble> muebles;
	private Direccion direccion;

	public Vivienda(int numero, String calle, int altura, String piso, String departamento) {

		setNumero(numero);
		personas = new ArrayList<>();
		muebles = new ArrayList<>();
		direccion = new Direccion(calle, altura, piso, departamento);
	}

	private void setNumero(int numero) {
		this.numero = numero;
	}

	public void agregarPersona(String nombre, String apellido, int edad) {

		personas.add(new Persona(nombre, apellido, edad));

	}

	public void agregarMueble(String nombre, String material, String color) {

		muebles.add(new Mueble(nombre, material, color));

	}

	public Direccion agregarDireccion(String calle, int altura, String piso, String departamento) {

		return direccion = new Direccion(calle, altura, piso, departamento);

	}

	private void mostrarPersonas() {
		System.out.println("Personas: ");
		for (Persona persona : personas) {
			System.out.println(persona.getDatos());
		}
	}

	private void mostrarMuebles() {
		System.out.println("Muebles: ");
		for (Mueble mueble : muebles) {
			System.out.println(mueble.getDatos());
		}
	}
	
	private void mostrarDireccion() {
		System.out.println("Direccion: " + direccion.getDatos());
	}

	public void mostrarDatos() {

		System.out.println("Vivienda " + this.numero + " :");
		mostrarDireccion();
		mostrarPersonas();
		mostrarMuebles();
	}

	private class Direccion {

		private String calle;
		private int altura;
		private String piso;
		private String departamento;

		public Direccion(String calle, int altura, String piso, String departamento) {
			setCalle(calle);
			setAltura(altura);
			setPiso(piso);
			setDepartamento(departamento);

		}

		private void setCalle(String calle) {
			this.calle = calle;
		}

		private void setAltura(int altura) {
			this.altura = altura;
		}

		private void setPiso(String piso) {
			this.piso = piso;
		}

		private void setDepartamento(String departamento) {
			this.departamento = departamento;
		}

		public String getDatos() {
			return this.calle + " " + this.altura + ", " + this.piso + this.departamento;
		}

	}

}
