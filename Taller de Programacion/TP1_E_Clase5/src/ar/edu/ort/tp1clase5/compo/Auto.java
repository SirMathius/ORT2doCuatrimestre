package ar.edu.ort.tp1clase5.compo;

public class Auto extends Vehiculo {

	public boolean hacerDrift() {
		return false;
	}

	public void ejemploDeVisibilidad() {

		super.mostrarDatos();

		// no se puede acceder a miembros privados del padre
//		super.marca;
//		String unaVariable = super.marca;
//		super.unMetodoPrivado();
		super.elProfeSeSaca2 = false;
		if (elProfeSeSaca2) {

			System.out.println("esta mal");

		}

		super.valorProtegido = 2;
	}

}
