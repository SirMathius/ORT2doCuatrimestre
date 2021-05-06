package ejer.agenda;

public class Main {

	public static void main(String[] args) {

		
		Resumen prueba = new Resumen();
		
		prueba.agregarMes("enero");
		prueba.agregarMes("febrero");
		prueba.agregarMes("marzo");
		prueba.agregarMes("abril");
		prueba.agregarMes("mayo");
		prueba.agregarMes("junio");
		prueba.agregarMes("julio");
		prueba.agregarMes("agosto");
		prueba.agregarMes("septiembre");
		prueba.agregarMes("octubre");
		prueba.agregarMes("noviembre");
		prueba.agregarMes("diciembre");
		prueba.ingresarValores();
		prueba.imprimirResumen();
		
	}

}
