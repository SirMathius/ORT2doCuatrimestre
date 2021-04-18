package ar.edu.ort.tp1clase6;

public class Auto extends Vehiculo implements Mostrable, Apreciable {
	
	private boolean aireAcondicionado;
	private int velocidad;

	public Auto(String marca, String color) {
		super(marca, color);
		System.out.println("constructor Auto");
		this.aireAcondicionado = false; 
		this.velocidad = 0;
	}
	
	public Auto(String marca, String color, boolean aireAcondicionado) {
		super(marca, color);
		System.out.println("constructor Auto");
		this.aireAcondicionado = aireAcondicionado; 
		this.velocidad = 0;

	}
	
	public Auto(String marca, boolean aireAcondicionado) {
		super(marca);
		System.out.println("constructor Auto");
		this.aireAcondicionado = aireAcondicionado; 
		this.velocidad = 0;

	}

	@Override
	public boolean hacerPirueta() {
		System.out.println("hago drift");
		return false;
	}

	@Override
	public void acelerar(int cantidad) {
		System.out.printf("Velocidad inicial: %d - Velocidad final: %d\n", this.velocidad, this.velocidad+cantidad);
		this.velocidad+=cantidad;
	}
	
	public void saludarDuenio(String nombreDueño) {
		System.out.println("hola dueño soy auto");
	}

	@Override
	public void mostrar() {
		System.out.println();		
	}

	@Override
	public void ocultar() {
		System.out.println();
		
	}

	@Override
	public double obtenerPrecio() {
		return 101.23;
	}
	
	
}
