package ar.edu.ort.tp5.ej1;

public class Main {

	public static void main(String[] args) {

		
		Anio prueba = new Anio();
		
		System.out.println("el mes 1 es: " + prueba.getNombreDelMes(1));
		System.out.println("Pasaron: "+ prueba.diasTranscurridos(1)+" dias");
		
		System.out.println("el mes 1 es: " + prueba.getNombreDelMes(5));
		System.out.println("Pasaron: "+ prueba.diasTranscurridos(5)+" dias");
		
		
	}

}
