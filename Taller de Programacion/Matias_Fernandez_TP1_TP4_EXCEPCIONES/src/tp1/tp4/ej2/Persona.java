package tp1.tp4.ej2;

public class Persona {

	
	private final int VALOR_AUN_VIVE = -9999;
	
	private String nombreCompleto;
	private int anioNacimiento;
	private int anioFallecimiento;
	private int anioActual;
	
	
	public Persona(String nombreCompleto, int anioNacimiento) {
		super();
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);

	}
	
	public Persona(String nombreCompleto, int anioNacimiento, int anioFallecimiento) {
		super();
		this.setNombreCompleto(nombreCompleto);
		this.setAnioNacimiento(anioNacimiento);
		this.setAnioFallecimiento(anioFallecimiento);

	}



	public String getNombreCompleto() {
		return nombreCompleto;
	}


	private void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}


	public int getAnioNacimiento() {
		return anioNacimiento;
	}


	private void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}


	public int getAnioFallecimiento() {
		return anioFallecimiento;
	}


	public void setAnioFallecimiento(int anioFallecimiento) {
		this.anioFallecimiento = anioFallecimiento;
	}


	private void setAnioActual(int anioActual) {
		this.anioActual = anioActual;
	}
	
	
	public boolean vive() {
		return (this.anioFallecimiento != 0)?(false):(true);
	}

	@Override
	public String toString() {
		return "Persona [VALOR_AUN_VIVE=" + VALOR_AUN_VIVE + ", nombreCompleto=" + nombreCompleto + ", anioNacimiento="
				+ anioNacimiento + ", anioFallecimiento=" + anioFallecimiento + ", anioActual=" + anioActual + "]";
	}
	
	

}
