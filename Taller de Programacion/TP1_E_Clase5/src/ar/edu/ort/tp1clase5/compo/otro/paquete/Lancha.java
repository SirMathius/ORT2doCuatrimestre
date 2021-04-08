package ar.edu.ort.tp1clase5.compo.otro.paquete;

import ar.edu.ort.tp1clase5.compo.Persona;
import ar.edu.ort.tp1clase5.compo.Vehiculo;

public class Lancha extends Vehiculo {

	public Lancha(String marca, String color) {
		super(marca, color);
		System.out.println("Constructor Lancha");
	}

	public void abordarPersona(Persona p) {

		super.agregarPasajero(p);
// visibilidad default no puede acceder
		// System.out.println(atrivDefault);

	}

}
