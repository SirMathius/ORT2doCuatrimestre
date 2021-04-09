package ar.edu.ort.tp1clase5.compo;

public class Moto extends Vehiculo {

	public Moto(String marca, String color) {
		super(marca, color);
		System.out.println("Constructor Moto");
	}

	public boolean hacerWillie() {
		System.out.println("hago Willie");
		return true;
	}

	public void subirPasajero(Persona p) {

		System.out.println("abrazamos al conductor");
		super.agregarPasajero(p);
		System.out.println("nos agarramos fuerte");
	}
}
