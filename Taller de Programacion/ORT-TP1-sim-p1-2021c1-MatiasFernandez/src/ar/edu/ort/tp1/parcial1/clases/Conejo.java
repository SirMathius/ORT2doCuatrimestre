package ar.edu.ort.tp1.parcial1.clases;

public class Conejo extends Mascota {

	private static final double MULT_ALIMENTACION = 0.022;
	private static final double PORC_DESC_PESO = -2;

	public Conejo(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	@Override
	public void comer(double comida) {
		
	}

	@Override
	public void defecar() {
		// TODO Auto-generated method stub
		
	}
}
