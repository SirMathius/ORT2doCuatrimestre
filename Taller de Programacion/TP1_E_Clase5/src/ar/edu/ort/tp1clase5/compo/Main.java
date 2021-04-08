package ar.edu.ort.tp1clase5.compo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculo = new Vehiculo();
		Auto auto = new Auto();
		Moto moto = new Moto();

		vehiculo.conducir();
		vehiculo.mostrarDatos();
//		vehiculo.hacerDrift();               no se puede porquer es del hijo.

		auto.conducir();
		auto.mostrarDatos();
		auto.hacerDrift();

		moto.conducir();
		moto.mostrarDatos();
//		moto.hacerDrift();
		moto.hacerWillie();
	}

}
