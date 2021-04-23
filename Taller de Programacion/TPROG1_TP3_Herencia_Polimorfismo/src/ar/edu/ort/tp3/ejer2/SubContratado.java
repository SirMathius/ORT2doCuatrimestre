package ar.edu.ort.tp3.ejer2;

public class SubContratado extends Empleado{

	private float cantHoras;
	private float precioHora;
	
	public SubContratado() {
		
	}
	public SubContratado(String nombre, int edad, float cantHoras, float precioHora) {
		super(nombre, edad);
		this.setCantHoras(cantHoras);
		this.setPrecioHora(precioHora);
		
	}
	
	private void setCantHoras(float cantHoras) {
		this.cantHoras = cantHoras;
	}
	private void setPrecioHora(float precioHora) {
		this.precioHora = precioHora;
	}
	
	
	public String toString() {
		return "SubContratado " + this.getNombre() + " gana: " + this.calcularPago();
		
	}
	
	public float calcularPago() {
		return this.cantHoras*this.precioHora;
	}
}
