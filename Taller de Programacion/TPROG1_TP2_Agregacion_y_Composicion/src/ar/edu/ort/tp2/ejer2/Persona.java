package ar.edu.ort.tp2.ejer2;

import java.util.ArrayList;

public class Persona {
	
	private String nombre;
	private String apellido;
	private ArrayList<NumeroTelefonico> telefonos;
	private ArrayList<Email> emails;
	private ArrayList<Mascota> mascotas;
	
	public Persona(String nombre, String apellido) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		telefonos = new ArrayList<>();
		emails = new ArrayList<>();
		mascotas = new ArrayList<>();
	}
	
	public void mostrarTodo() {
		System.out.println(this.apellido + ", " + this.nombre);
		mostrarTelefonos();
		mostrarEmails();
		mostrarMascotas();
	}

	private void mostrarMascotas() {
		System.out.println("Mascotas: ");
		for (Mascota mascota : mascotas) {
			System.out.println(mascota.getValor());
		}
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
	
	public void agregarMascota (Mascota mascota) {
		this.mascotas.add(mascota);
	}
	
	public Mascota buscarMascota(String tipoYnombre) {

		Mascota buscado = null;

		int idx = 0;
		while (idx < this.mascotas.size() && buscado == null) {

			if (this.mascotas.get(idx).getValor().equals(tipoYnombre)) {

				buscado = this.mascotas.get(idx);
			}

			idx++;
		}

		return buscado;
	}

	public Mascota removerMascota(String tipoYnombre) {

		Mascota mascota = this.buscarMascota(tipoYnombre);

		if (mascota != null) {
			mascotas.remove(mascota);
		}

		return mascota;
	}
	
	public NumeroTelefonico buscarTelefono(String numero) {

		NumeroTelefonico buscado = null;

		int idx = 0;
		while (idx < this.telefonos.size() && buscado == null) {

			if (this.telefonos.get(idx).getValor().equals(numero)) {

				buscado = this.telefonos.get(idx);
			}

			idx++;
		}

		return buscado;
	}

	public NumeroTelefonico removerTelefono(String numero) {

		NumeroTelefonico numeroABorrar = this.buscarTelefono(numero);

		if (numeroABorrar != null) {
			telefonos.remove(numeroABorrar);
		}

		return numeroABorrar;
	}
	
	public Email buscarEmail(String email) {

		Email buscado = null;

		int idx = 0;
		while (idx < this.emails.size() && buscado == null) {

			if (this.emails.get(idx).getValor().equals(email)) {

				buscado = this.emails.get(idx);
			}

			idx++;
		}

		return buscado;
	}

	public Email removerEmail(String email) {

		Email emailABorrar = this.buscarEmail(email);

		if (emailABorrar != null) {
			emails.remove(emailABorrar);
		}

		return emailABorrar;
	}
	
	public void borrarTodo() {
		this.emails.clear();
		this.telefonos.clear();
		this.mascotas.clear();
	}
}
