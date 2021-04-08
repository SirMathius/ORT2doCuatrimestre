package ar.edu.ort.tp1clase5.compo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo vehiculo = new Vehiculo("pepe", "pipo");
		Auto auto = new Auto(null, null);
		Moto moto = new Moto(null, null);

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

		Vehiculo v = new Vehiculo("pepe", "pipo");
		v.valorProtegido = 10;
		v.atrivDefault = "esta como publico";
	}

}
