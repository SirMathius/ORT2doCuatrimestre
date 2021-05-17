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

	//TODO A completar Métodos Faltantes
	
	
	public float calcularPrecioVenta() {
		
		//FIXME El 100 debe ser constante.
		return this.calcularPrecioCosto() + ((this.calcularPrecioCosto()*porcentajeGanancia)/100);
	
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
