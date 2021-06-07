package ar.edu.ort.tp1.tp5Ej1;

public class TP5Test1 {

	public static void main(String[] args) {
		
		Anio a2 = new Anio();
				
		System.out.println();
		System.out.println("Obtener Nombre de un mes:");
		System.out.println(a2.getNombreMes(12));
		System.out.println(a2.getNombreMes(5));
		System.out.println("------------------");
		System.out.println("Hasta Septiembre han transcurrido: "+a2.diasTranscurridos(9)+" dias");
		System.out.println("Mi cumpleaños es el dia: "+(a2.diasTranscurridos(9)+14)+" del año");
	}
}
