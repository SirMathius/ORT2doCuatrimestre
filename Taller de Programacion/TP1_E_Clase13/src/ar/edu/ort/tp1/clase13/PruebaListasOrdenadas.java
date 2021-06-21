package ar.edu.ort.tp1.clase13;

import ar.edu.ort.tp1.tdas.interfaces.ListaOrdenada;

public class PruebaListasOrdenadas {

	public static void main(String[] args) {

		// ListaOrdenadaAutosPorAnio listaAutosAnio = new ListaOrdenadaAutosPorAnio();
		ListaOrdenada<Integer, Auto> listaAutosAnio = new ListaOrdenadaAutosPorAnio();
		// ListaOrdenadaNodos<Integer, Auto> listaAutosAnio = new
		// ListaOrdenadaAutosPorAnio();

		listaAutosAnio.add(new Auto(2021, "AD 123 ZD"));
		listaAutosAnio.add(new Auto(2000, "DCA 456"));
		listaAutosAnio.add(new Auto(1995, "AAA 123"));
		listaAutosAnio.add(new Auto(2019, "AB 321 AF"));

		ListaOrdenada<Integer, Auto> listaAutosAnioDesc = new ListaOrdenadaAutosPorAnioDesc();

	//	listaAutosAnioDesc.add(new Auto(2021, "AD 123 ZD"));
	//	listaAutosAnioDesc.add(new Auto(2000, "DCA 456"));
	//	listaAutosAnioDesc.add(new Auto(1995, "AAA 123"));
	//	listaAutosAnioDesc.add(new Auto(2019, "AB 321 AF"));
		ListaOrdenadaAutosPorPatente autosPorPatente = new ListaOrdenadaAutosPorPatente();


		for (Auto auto : listaAutosAnio) {
			System.out.println(auto);
			listaAutosAnioDesc.add(auto);
			autosPorPatente.add(auto);
		}

		System.out.println("----------------------");

		for (Auto auto : listaAutosAnioDesc) {
			System.out.println(auto);
		}

		System.out.println("----------------------");
		

	//	autosPorPatente.add(new Auto(2021, "AD 123 ZD"));
	//	autosPorPatente.add(new Auto(2000, "DCA 456"));
	//	autosPorPatente.add(new Auto(1995, "AAA 123"));
	//	autosPorPatente.add(new Auto(2019, "AB 321 AF"));

		for (Auto auto : autosPorPatente) {
			System.out.println(auto);
		}
	}

}
