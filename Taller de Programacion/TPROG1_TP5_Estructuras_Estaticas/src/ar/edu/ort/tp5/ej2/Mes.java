package ar.edu.ort.tp5.ej2;

public enum Mes {

	ENERO("Enero", 0), FEBRERO("Febrero", 31), MARZO("Marzo", 59), ABRIL("Abril", 90), MAYO("Mayo", 120),
	JUNIO("junio", 151), JULIO("Julio", 181), AGOSTO("Agosto", 212), SEPTIEMBRE("Septiembre", 243),
	OCTUBRE("Octubre", 273), NOVIEMBRE("Noviembre", 304), DICIEMBRE("Diciembre", 334);

	private String nombreMes;
	private int diasTranscurridos;

	Mes(String nombreMes, int diasTranscurridos) {

		this.nombreMes = nombreMes;

	}

	public String getNombreMes() {
		return nombreMes;
	}
	
	public int getDiasTranscurridos() {
		return diasTranscurridos;
	}

}
