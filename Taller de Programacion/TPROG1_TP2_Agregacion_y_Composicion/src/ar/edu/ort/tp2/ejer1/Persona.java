package ar.edu.ort.tp2.ejer1;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	
	public Persona(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<NumeroTelefonico>();
		emails = new ArrayList<Email>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);
		mostrarTelefonos();
		mostrarEmails();
	}

	private void mostrarEmails() {
		System.out.println("Email: ");
		for (Email email : emails) {
			System.out.println(email.getValor());
		}
		
	}

	private void mostrarTelefonos() {
		System.out.println("Telefonos: ");
		for (NumeroTelefonico telefono : telefonos) {
			System.out.println(telefono.getValor());
		}
		
	}
	
	public void agregarTelefono (NumeroTelefonico numeroTelefonico) {
		this.telefonos.add(numeroTelefonico);
	}
	
	public void agregarEmail (Email email) {
		this.emails.add(email);
	}
}
