package ar.edu.ort.tp5.ej2;

public class Main {

	public static void main(String[] args) {

		
		AnioV2 prueba = new AnioV2();
		
		System.out.println("el mes 1 es: " + prueba.getNombreDelMes(1));
		System.out.println("Pasaron: "+ prueba.diasTranscurridos(1)+" dias");
		
		System.out.println("el mes 1 es: " + prueba.getNombreDelMes(5));
		System.out.println("Pasaron: "+ prueba.diasTranscurridos(5)+" dias");
		
		
	}

}
