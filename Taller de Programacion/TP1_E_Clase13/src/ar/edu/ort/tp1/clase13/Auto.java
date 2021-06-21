package ar.edu.ort.tp1.clase13;

public class Auto {

	private Integer anio;
	private String patente;
	
	
	public Auto(Integer anio, String patente) {
		this.anio = anio;
		this.patente = patente;
	}


	public Integer getAnio() {
		return anio;
	}


	public String getPatente() {
		return patente;
	}


	@Override
	public String toString() {
		return "Auto [anio=" + anio + ", patente=" + patente + "]";
	}
	

	
}
