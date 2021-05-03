package ar.edu.ort.tp1.parcial1.clases;

public abstract class Mascota implements Animal {

	private String nombre;
	private double peso;
	private boolean vacuna;
	private Estado estado;
	private static final String MSG_COM_FELIZ = " dice: He comido demasiado";
	private static final String MSG_COM_HAMBRIENTO = " dice: Muchas gracias tenía hambre";
	private static final String MSG_COM_ENFERMO = " dice: No tenía mucha hambre, pero gracias";

	private static final int CIEN = 100;

	public Mascota(String nombre, double peso, boolean vacuna, Estado estado) {

		this.nombre = nombre;
		this.peso = peso;
		this.vacuna = vacuna;
		this.estado = estado;

	}

	void comer(double comida, double multiplicador) {
		switch (estado) {
		case ENFERMO:

			System.out.println(this.nombre+" dice: "+MSG_COM_ENFERMO);
			break;
		case HAMBRIENTO:
			System.out.println(this.nombre+" dice: "+MSG_COM_HAMBRIENTO);
			estado = Estado.FELIZ;
			break;

		case FELIZ:
			System.out.println(this.nombre+" dice: "+MSG_COM_FELIZ);
			estado = Estado.ENFERMO;
			break;

		default:
			break;
		}
		System.out.println("El estado de "+ this.nombre + " es: "+this.estado);
		
		this.peso = peso +(comida*multiplicador);
	}


	public String getNombre() {
		return nombre;
	}

	public void actualizarPeso(double porcentaje) {
		this.peso += peso * porcentaje / CIEN;
	}

	public boolean estaVacunada() {
		return vacuna;
	}

}
