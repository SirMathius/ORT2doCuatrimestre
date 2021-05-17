package ar.edu.ort.tp1clase6;

public class Camioneta extends Vehiculo {

	public Camioneta(int anio) {
		super(anio);
	}

	@Override
	public boolean hacerPirueta() {
		System.out.println("Marcha atras");
		return false;
	}
	
	public void saludarDuenio(String nombreDueño) {
		System.out.println("hola dueño soy camioneta");
	}
}
