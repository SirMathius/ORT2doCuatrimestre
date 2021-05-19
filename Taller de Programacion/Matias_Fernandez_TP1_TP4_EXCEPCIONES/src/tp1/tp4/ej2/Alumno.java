package tp1.tp4.ej2;

public class Alumno extends Persona {

	private int numeroLegajo;
	
	public Alumno(int numeroLegajo, String nombreCompleto, int anioNacimiento) {
		super(nombreCompleto, anioNacimiento);

		this.setNumeroLegajo(numeroLegajo);
		
	}

	private int getNumeroLegajo() {
		return numeroLegajo;
	}

	private void setNumeroLegajo(int numeroLegajo) {
		this.numeroLegajo = numeroLegajo;
	}

	@Override
	public String toString() {
		return "Alumno [numeroLegajo=" + numeroLegajo + "]";
	}
	
	

}
