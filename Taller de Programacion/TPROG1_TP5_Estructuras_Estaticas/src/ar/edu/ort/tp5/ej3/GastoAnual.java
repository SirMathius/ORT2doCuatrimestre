package ar.edu.ort.tp5.ej3;

import java.util.ArrayList;

public class GastoAnual {

	private ArrayList<Rubro> rubros;

	public GastoAnual(ArrayList<Rubro> rubros) {

		this.rubros = new ArrayList<>();

	}

	public void agregarGastos(Mes mes, String nombreRubro, double importe) throws RuntimeException {

		if (importe < 0) {
			throw new RuntimeException("Importe invalido");
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
		if (rubro != null) {
			gastoAcumulado = buscado.getGastoAcumulado();
		}

		return gastoAcumulado;

	}
	
	public void informarConsumosPorMes() {
		
	}


}
