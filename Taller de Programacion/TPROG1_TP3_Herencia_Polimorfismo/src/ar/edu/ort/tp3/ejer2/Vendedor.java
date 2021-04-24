package ar.edu.ort.tp3.ejer2;

import javax.management.remote.SubjectDelegationPermission;

public class Vendedor extends SubContratado {

	private float porcentaje;

	public Vendedor(String nombre, int edad, float cantHoras, float precioHora, float porcentaje) {
		super(nombre, edad, cantHoras, precioHora);
		this.setPorcentaje(porcentaje);
	}

	private void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}

	public String toString() {
		return this.getNombre() + " gana: " + this.calcularPago();

	}

	public float calcularPago() {
		return (super.calcularPago())*((this.porcentaje/100)+1);
	}
}
