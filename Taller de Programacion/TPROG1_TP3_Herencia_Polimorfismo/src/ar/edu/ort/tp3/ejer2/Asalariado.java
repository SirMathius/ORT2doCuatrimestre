package ar.edu.ort.tp3.ejer2;

public class Asalariado extends Empleado {
	
	private float sueldo;
	
	public Asalariado() {
		
	}
	
	public Asalariado(String nombre, int edad,float sueldo) {
		super(nombre, edad);
		this.setSueldo(sueldo);
		
	}
	
	private void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}

	public String toString() {
		return "Asalariado " + this.getNombre() + " gana: " + this.calcularPago();
		
		//Asalariado Jose gana:10000.0 
	}
	public float calcularPago() {
		return this.sueldo;
		
	}

}
