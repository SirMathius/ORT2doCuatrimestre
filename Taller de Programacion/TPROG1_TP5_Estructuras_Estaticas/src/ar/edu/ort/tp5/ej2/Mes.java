package ar.edu.ort.tp5.ej2;

public enum Mes {

	ENERO("Enero"), FEBRERO("Febrero"), MARZO("Marzo"), ABRIL("Abril"), MAYO("Mayo"), JUNIO("junio"), JULIO("Julio"),
	AGOSTO("Agosto"), SEPTIEMBRE("Septiembre"), OCTUBRE("Octubre"), NOVIEMBRE("Noviembre"), DICIEMBRE("Diciembre");

	private String nombreMes;

	Mes(String nombreMes) {

		this.nombreMes = nombreMes;

	}

	public String getNombreMes() {
		return nombreMes;
	}

}
