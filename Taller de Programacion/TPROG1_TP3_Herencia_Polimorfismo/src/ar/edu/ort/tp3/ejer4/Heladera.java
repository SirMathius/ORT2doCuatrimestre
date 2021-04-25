package ar.edu.ort.tp3.ejer4;

public class Heladera extends Electrodomestico {


	//capacidad (en litros) y si es no frost
	private float capacidadLitros;
	private boolean frost;
	
	
	public Heladera(String tipo, String marca, String modelo, int numSerie, int voltaje, boolean encendido,
			float precio, float capacidadLitros, boolean frost) {
		super(tipo, marca, modelo, numSerie, voltaje, encendido, precio);
		
		this.setCapacidadLitros(capacidadLitros);
		this.setFrost(frost);
	}


	private void setCapacidadLitros(float capacidadLitros) {
		this.capacidadLitros = capacidadLitros;
	}


	private void setFrost(boolean frost) {
		this.frost = frost;
	}
	
	private String esFrost() {
		String esFrost;
		if (frost) {
			esFrost = "Frost";
		}else {
			esFrost = "no Frost";
		}
		return esFrost;
	}


	@Override
	public String toString() {
		return "Heladera " +this.getMarca()+"modelo " +this.getModelo() 
		+", "+ this.esFrost()+", capacidad "+this.capacidadLitros+" litros: $"+this.getPrecio();
	}
	
	//Heladera Whirlpool, modelo H2745, no frost, capacidad 250 litros: $14999.

	
	
	
	
}
