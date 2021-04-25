package ar.edu.ort.tp3.ejer4;

public class Lavarropa extends Electrodomestico {

	// carga máxima (en kg) y si es automático o semi automático.
	private float cargaMaxima;
	private boolean semiAutomatico;

	public Lavarropa(String tipo, String marca, String modelo, int numSerie, int voltaje, boolean encendido,
			float precio, float cargaMaxima, boolean semiAutomatico) {
		super(tipo, marca, modelo, numSerie, voltaje, encendido, precio);

		this.setCargaMaxima(cargaMaxima);
		this.setAutomatico(semiAutomatico);

	}

	private void setCargaMaxima(float cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}

	private void setAutomatico(boolean automatico) {
		this.semiAutomatico = automatico;
	}

	private String esSemiAutomatico() {
		String semiAutomatico;
		if (this.semiAutomatico) {
			semiAutomatico = "semi Automatico";
		} else {
			semiAutomatico = "Automatico";
		}
		return semiAutomatico;
	}

	@Override
	public String toString() {
		return "Lavarropa " + this.getMarca() + " " + this.esSemiAutomatico() + ", carga maxima" + this.cargaMaxima
				+ "kg, " + "modelo " + this.getModelo() + ": $" + this.getPrecio();
	}

	@Override
	public void imprimir() {
		System.out.println(this.toString());
	}

	// Lavarropas Drean semi automático, carga máxima 6kg, modelo CONCEPT 5.05:
	// $6799.

}
