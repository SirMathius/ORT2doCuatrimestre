package ar.edu.ort.tp1clase6;

public class Main {

	public static void main(String[] args) {
		
		//Vehiculo es abstracta y no se puede instancias
//		Vehiculo v = new Vehiculo("Ford", "Gris");
//  	v.acelerar(152);
		
		Auto a = new Auto("Otra marca", true);
		a.acelerar(45);
		
		Vehiculo av = new Auto("Otra marca", true);
		av.acelerar(55);
		
		Moto m = new Moto("Kawasaki", "Marron");
		m.acelerar(33);
		
		Vehiculo mv = new Moto("Kawasaki", "Marron");
		mv.acelerar(22);

	}

}
