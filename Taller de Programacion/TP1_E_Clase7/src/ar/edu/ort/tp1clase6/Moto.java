package ar.edu.ort.tp1clase6;

public class Moto extends Vehiculo {

	public Moto(String marca, String color) {
		super(marca, color);
		System.out.println("Constructor Moto");
	}

	@Override
	public boolean hacerPirueta() {
		System.out.println("hago Willie");
		return true;
	}

	@Override
	public void acelerar(int cantidad) {
		super.acelerar(cantidad);
		System.out.println("Pero soy una moto");
	}
	
	public void saludarDuenio(String nombreDueño) {
		System.out.println("hola dueño soy moto");
	}
}
