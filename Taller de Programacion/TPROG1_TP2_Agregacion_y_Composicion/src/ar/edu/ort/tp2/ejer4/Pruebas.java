package ar.edu.ort.tp2.ejer4;

public class Pruebas {

	public static void main(String[] args) {

		Vivienda test = new Vivienda(1, "sarasa", 1234, "5º", "A");
		test.agregarPersona("Pepe", "Pipo", 35);
		test.agregarPersona("Chapo", "Lepe", 46);
		test.agregarPersona("Ricardo", "Iorio", 64);
		test.agregarMueble("silla", "madera", "azul");
		test.agregarMueble("mesa", "metal", "gris");
		test.mostrarDatos();

	}

}
