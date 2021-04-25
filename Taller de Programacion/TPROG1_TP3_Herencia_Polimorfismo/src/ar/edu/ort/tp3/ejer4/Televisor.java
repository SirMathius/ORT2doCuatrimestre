package ar.edu.ort.tp3.ejer4;

public class Televisor extends Electrodomestico {

	// la dimensión (en pulgadas) y si es Smart o no
	private float dimensionPulgadas;
	private boolean smart;

	public Televisor(String tipo, String marca, String modelo, int numSerie, int voltaje, boolean encendido,
			float precio, float dimensionPulgadas, boolean smart) {
		super(tipo, marca, modelo, numSerie, voltaje, encendido, precio);
		this.setDimensionPulgadas(dimensionPulgadas);
		this.setSmart(smart);

	}

	private void setDimensionPulgadas(float dimensionPulgadas) {
		this.dimensionPulgadas = dimensionPulgadas;
	}

	private void setSmart(boolean smart) {
		this.smart = smart;
	}

	private String esSmart() {
		String smart;
		if (this.smart) {
			smart = " smart";
		} else {
			smart = " no smart";
		}
		return smart;
	}

	@Override
	public String toString() {
		//Televisor smart Philips 49 pulgadas, modelo 49PGFS: $14370.

		return "Televisor "+this.esSmart()+" "+this.getMarca()+" " + dimensionPulgadas + " pulgadas, modelo "+ this.getModelo()+": $"+this.getPrecio();
	}
	
	


}
