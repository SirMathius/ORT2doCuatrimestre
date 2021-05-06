package ar.edu.ort.tp1.pacial1.clases;

public abstract class Mueble implements Mostrable {
	//TODO A completar
	private String modelo;
	private float costoBase;
	private float porcentajeGanancia;

	public Mueble(String modelo, float costoBase, float porcentajeGanancia) {

		this.modelo = modelo;
		this.costoBase = costoBase;
		this.porcentajeGanancia = porcentajeGanancia;
		
	}
	
	
	public float calcularPrecioVenta() {
		
		
		return this.calcularPrecioCosto();
	
	}

	protected float getCostoBase() {
		return costoBase;
	}
	
	protected String getModelo() {
		return modelo;
	}

	public boolean modeloCorrecto(String modelo) {
	
		return modelo == this.modelo;
	}
	
	public abstract float calcularPrecioCosto();

}
