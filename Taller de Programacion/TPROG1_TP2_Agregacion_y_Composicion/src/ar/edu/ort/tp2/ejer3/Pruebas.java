package ar.edu.ort.tp2.ejer3;

public class Pruebas {

	public static void main(String[] args) {

		Persona test = new Persona("pipo", "pepe");

		test.agregarTelefono(new NumeroTelefonico(TipoDeLinea.CELULAR, 54, 4256, 75));

		test.agregarEmail(new Email("pipo.popi@elmail.com"));

		test.agregarMascota(new Mascota("Perro", "Dogui"));

		test.mostrarTodo();

		System.out.println("");

		test.removerMascota("Dogui, Perro");

		test.removerEmail("pipo.popi@elmail.com");

		test.removerTelefono("CELULAR: (+ 54) 4256-0075");

		test.mostrarTodo();
		
		System.out.println("");

		test.agregarTelefono(new NumeroTelefonico(TipoDeLinea.CELULAR, 54, 4256, 75));

		test.agregarEmail(new Email("pipo.popi@elmail.com"));

		test.agregarMascota(new Mascota("Perro", "Dogui"));

		test.mostrarTodo();

		System.out.println("");
		
		test.borrarTodo();
		
		test.mostrarTodo();

	}

}
