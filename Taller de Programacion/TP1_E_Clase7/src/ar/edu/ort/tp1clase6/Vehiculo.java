package ar.edu.ort.tp1clase6;

public abstract class Vehiculo extends SuperVehiculo {

	
	private String marca;
	private String color;
	private int anio;

	// Constructor
	public Vehiculo(String marca, String color) {
		this.marca = marca;
		this.color = color;
		System.out.println("constructor de la clase Vehiculo");
	}

	public Vehiculo(String marca) {
		this(marca, "Negro");
	}
	
	public Vehiculo(int anio) {
		this("Generica", "Negro");
		this.anio = anio;
	}
	
	public void acelerar(int cantidad) {
		System.out.printf("acelerando la cantidad de %d km/h\n", cantidad);
	};

	public void conducir() {
		System.out.println("estoy conduciendo");
	}

	public void mostrarDatos() {
		System.out.printf("mi marca es: %s - y mi color es: %s \n", marca, color);
	}

	public abstract boolean hacerPirueta();
	 

}
