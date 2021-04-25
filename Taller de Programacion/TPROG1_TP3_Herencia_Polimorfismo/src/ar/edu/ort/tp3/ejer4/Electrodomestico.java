package ar.edu.ort.tp3.ejer4;

public abstract class Electrodomestico {

	//se conoce la marca, el modelo, el número de serie, el voltaje, el estado
	//(encendido/apagado) y el precio
	
	private String tipo;
	private String marca;
	private String modelo;
	private int numSerie;
	private int voltaje;
	private boolean encendido;
	private float precio;
	
	public Electrodomestico(String tipo, String marca, String modelo, int numSerie, int voltaje, boolean encendido,
			float precio) {
		super();
		this.setTipo(tipo);
		this.setMarca(marca);
		this.setModelo(modelo);
		this.setNumSerie(numSerie);
		this.setVoltaje(voltaje);
		this.setEncendido(encendido);
		this.setPrecio(precio);
	}

	private void setTipo(String tipo) {
		this.tipo = tipo;
	}

	private void setMarca(String marca) {
		this.marca = marca;
	}

	private void setModelo(String modelo) {
		this.modelo = modelo;
	}

	private void setNumSerie(int numSerie) {
		this.numSerie = numSerie;
	}

	private void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}

	private void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	private void setPrecio(float precio) {
		this.precio = precio;
	}

	public void mostrarDatos() {
		//Solo se deberá mostrar el tipo de producto, la marca y el modelo.
		System.out.println(tipo + " " + marca + ", modelo=" + modelo);
		
	}
	
	//public abstract void mostrarEspecificaciones();

	public String getTipo() {
		return this.tipo;
	}

	public String getMarca() {
		return this.marca;
	}

	public String getModelo() {
		return modelo;
	}

	public float getPrecio() {
		return precio;
	}

	
	
	
	
	
}
