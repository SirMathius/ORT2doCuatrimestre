package ar.edu.ort.tp1clase5.compo;

import java.util.ArrayList;

import ar.edu.ort.tp1clase5.compo.otro.paquete.Lancha;

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

		// Casting
		// UpCasting

		Vehiculo vehiculoAuto = new Auto("marca", false);
		Vehiculo vehiculoMoto = new Moto("marca", "azul");
		
		ArrayList<Vehiculo> misVehiculos = new ArrayList<>();
		
		misVehiculos.add(auto);
		misVehiculos.add(moto);
		misVehiculos.add(new Lancha("marca", "color"));
		misVehiculos.add(vehiculoAuto);
		misVehiculos.add(vehiculoMoto);
		
		for (Vehiculo veh : misVehiculos) {
			veh.mostrarDatos();
			if(veh instanceof Moto) {
				((Moto)veh).hacerWillie();
			}
		}
		
		//DownCasting
		
		((Auto)vehiculoAuto).hacerDrift();
		
		//ClassCast Exception
		//((Auto)vehiculoMoto).hacerDrift();
		
		
		((Moto)vehiculoMoto).hacerWillie();

		
		System.out.println("--------fin---------");
		
	}

}
