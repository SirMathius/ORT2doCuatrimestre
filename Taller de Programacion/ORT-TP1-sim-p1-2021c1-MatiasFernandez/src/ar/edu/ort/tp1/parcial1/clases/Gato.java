package ar.edu.ort.tp1.parcial1.clases;

public class Gato extends Mascota {

	private static final double MULT_ALIMENTACION = 0.033;
	private static final int PORC_DESC_PESO = -1;

	public Gato(String nombre, double peso, boolean vacuna, Estado estado) {
		super(nombre, peso, vacuna, estado);
	}

	@Override
	public void comer(double comida) {
		super.comer(comida, MULT_ALIMENTACION);
	}

	@Override
	public void defecar() {
		this.actualizarPeso(PORC_DESC_PESO);
		System.out.println("Limpia mi arena humano!");
	}

}
