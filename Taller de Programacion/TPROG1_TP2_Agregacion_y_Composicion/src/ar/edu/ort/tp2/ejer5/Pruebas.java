package ar.edu.ort.tp2.ejer5;

public class Pruebas {

	public static void main(String[] args) {

		Vivienda test = new Vivienda(1, "sarasa", 1234, "5º", "A");
		Vivienda test2 = new Vivienda(2, "lalala", 5678, "6º", "E");
		Edificio testEdi= new Edificio();
		testEdi.agregarVivienda(test);
		testEdi.agregarVivienda(test2);
		
		test.agregarPersona("Pepe", "Pipo", 35);
		test.agregarPersona("Chapo", "Lepe", 46);
		test.agregarPersona("Ricardo", "Iorio", 64);
		test.agregarMueble("silla", "madera", "azul");
		test.agregarMueble("mesa", "metal", "gris");
		
		test.mostrarDatos();
		test2.mostrarDatos();
		
		testEdi.realizarMudanza("5º", "A", "6º", "E");
		
		test.mostrarDatos();
		test2.mostrarDatos();
		
	

	}

}
