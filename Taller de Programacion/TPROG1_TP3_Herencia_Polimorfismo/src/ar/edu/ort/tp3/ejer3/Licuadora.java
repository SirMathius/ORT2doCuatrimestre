package ar.edu.ort.tp3.ejer3;

public class Licuadora extends Electrodomestico {
	

	//s la potencia (en watts) y la cantidad de velocidades.
	private int potencia;
	private int cantVelocidades;
	
	public Licuadora(String tipo, String marca, String modelo, int numSerie, int voltaje, boolean encendido,
			float precio, int potencia, int cantVelocidades) {
		super(tipo, marca, modelo, numSerie, voltaje, encendido, precio);
		
		this.setPotencia(potencia);
		this.setCantVelocidades(cantVelocidades);
		
	}

	private void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	private void setCantVelocidades(int cantVelocidades) {
		this.cantVelocidades = cantVelocidades;
	}

	@Override
	public String toString() {
		return "Licuadora [potencia=" + potencia + ", cantVelocidades=" + cantVelocidades + "]";
	}
	
	
	
}
