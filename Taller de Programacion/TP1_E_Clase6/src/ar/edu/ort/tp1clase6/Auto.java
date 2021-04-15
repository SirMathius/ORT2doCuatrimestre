package ar.edu.ort.tp1clase6;

public class Auto extends Vehiculo {
	
	private boolean aireAcondicionado;

	public Auto(String marca, String color) {
		super(marca, color);
		System.out.println("constructor Auto");
		this.aireAcondicionado = false; 
	}
	
	public Auto(String marca, String color, boolean aireAcondicionado) {
		super(marca, color);
		System.out.println("constructor Auto");
		this.aireAcondicionado = aireAcondicionado; 
	}
	
	public Auto(String marca, boolean aireAcondicionado) {
		super(marca);
		System.out.println("constructor Auto");
		this.aireAcondicionado = aireAcondicionado; 
	}

	public boolean hacerDrift() {
		System.out.println("hago drift");
		return false;
	}


}
