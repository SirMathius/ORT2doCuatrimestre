package ar.edu.ort.tp2.ejer1;

public class Pruebas {

	public static void main(String[] args) {
		
		Persona test = new Persona("pipo", "pepe");
		
		test.agregarTelefono(new NumeroTelefonico(TipoDeLinea.CELULAR, 54, 4256, 75));
		
		test.agregarEmail(new Email("pipo.popi@elmail.com"));
		
		test.mostrarTodo();
	}

}
