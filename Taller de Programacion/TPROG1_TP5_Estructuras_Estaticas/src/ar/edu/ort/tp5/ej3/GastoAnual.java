package ar.edu.ort.tp5.ej3;

import java.util.ArrayList;

public class GastoAnual {

	private ArrayList<Rubro> rubros;

	public GastoAnual() {

		this.rubros = new ArrayList<>();

	}

	public void agregarGastos(Mes mes, String nombreRubro, double importe) throws RuntimeException {

		if (importe < 0) {
			throw new RuntimeException("Importe invalido");
		}else {
			Rubro rubro = obtenerRubro(nombreRubro);
			rubro.agregarGasto(mes, importe);
		}

	}

	private Rubro obtenerRubro(String nombreRubro) {
		Rubro buscado = this.buscarRubro(nombreRubro);
		if (buscado == null) {
			buscado = new Rubro(nombreRubro);
			this.rubros.add(buscado);
		}
		return buscado;
	}

	private Rubro buscarRubro(String nombreRubro) {
		int idx = 0;
		Rubro buscado = null;
		while (buscado == null && idx < rubros.size()) {
			if (rubros.get(idx).getNombre() == nombreRubro) {
				buscado = rubros.get(idx);
			}
			idx++;
		}
		return buscado;
	}

	public double[][] consolidadoDeGastos() {

		double[][] matriz = new double[Mes.values().length][rubros.size()];

		for (int idxRubros = 0; idxRubros < rubros.size(); idxRubros++) {
			Rubro rubro = rubros.get(idxRubros);
			for (int idxMeses = 0; idxMeses < Mes.values().length; idxMeses++) {
				matriz[idxMeses][idxRubros] = rubro.getTotalGastos(Mes.values()[idxMeses]);

			}

		}

		return matriz;

	}

	public double gastoAcumulado(Mes mes) {

		double gastoAcumulado = 0;

		for (Rubro rubro : rubros) {

			gastoAcumulado += rubro.getTotalGastos(mes);

		}

		return gastoAcumulado;

	}

	public double gastoAcumulado(String rubro) {

		double gastoAcumulado = -1;

		Rubro buscado = buscarRubro(rubro);
		if (buscado != null) {
			gastoAcumulado = buscado.getGastoAcumulado();
		}

		return gastoAcumulado;

	}

	public void informarConsumosPorMes() {
		double[][] matriz = consolidadoDeGastos();
		Mes[] meses = Mes.values();
		System.out.printf("%11s", " ");
		for (Rubro rubro : rubros) {
			System.out.printf("%10.2s", rubro.getNombre());
		}
		System.out.println();
		for (int fila = 0; fila < matriz.length; fila++) {
			System.out.printf("%11s", meses[fila].toString());
			for (int i = 0; i < matriz[i].length; i++) {
				System.out.printf("%10.2f", matriz[fila][i]);
			}
			System.out.println();
		}

	}

}
