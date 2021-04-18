package ar.edu.ort.tp1clase6;

import java.util.ArrayList;

public class Main2 {

	public static void main(String[] args) {

		ArrayList<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
		vehiculos.add(new Auto("Marca", "Color"));
		vehiculos.add(new Auto("Marca2", "Color2"));
		vehiculos.add(new Moto("MarcaMoto", "ColorMoto"));
		vehiculos.add(new Auto("Marca", "Color"));
		vehiculos.add(new Auto("Marca", "Color"));
		vehiculos.add(new Moto("MarcaMoto2", "ColorMoto2"));
		vehiculos.add(new Camioneta(2010));

		
		hacerPirueta(vehiculos);
		
		Mostrable mostrable = new Auto("Marca3", false);
		mostrable.mostrar();
	}

	private static void hacerPirueta(ArrayList<Vehiculo> vehiculos) {
		for (Vehiculo vehiculo : vehiculos) {
			
		//Polimorfismo
			
			vehiculo.hacerPirueta();
//			vehiculo.mostrar();
//			vehiculo.obtenerPrecio();
			
			if (vehiculo instanceof Mostrable) {
				((Auto)vehiculo).mostrar();
//			}else if (vehiculo instanceof Moto){
//				((Moto)vehiculo).hacerPirueta();
//
			}
		}
	}

}
