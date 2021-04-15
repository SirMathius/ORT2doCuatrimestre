package ar.edu.ort.tp1clase6;

public class Moto extends Vehiculo {

	public Moto(String marca, String color) {
		super(marca, color);
		System.out.println("Constructor Moto");
	}

	public boolean hacerWillie() {
		System.out.println("hago Willie");
		return true;
	}

}
