
public class Matrices {

	
	int [][] matrizEnteros = new int[10][3];
	//tipo [fila][columna]
	
	String [][] matrizStrings;
	
	Auto [][] matrizAUto;
	
	
	
	/*
	 public double[][] consolidadoDeGastos() {
		double[][] matriz = new double[Mes.values().length][rubros.size()];

		for (int idxRubros = 0; idxRubros < rubros.size(); idxRubros++) {
			System.out.println();
			Rubro r = rubros.get(idxRubros);
			for (int idxMeses = 0; idxMeses < Mes.values().length; idxMeses++) {
				matriz[idxMeses][idxRubros] = r.getTotalGastos(Mes.values()[idxMeses]);
				System.out.print(r.getTotalGastos(Mes.values()[idxMeses])+" ");
			}
		}

		return matriz;
	}



public void informarConsumosPorMes() {
		double[][] matriz = consolidadoDeGastos();
		double gasto = 0;
		Mes[] meses = Mes.values();
		System.out.printf("%11s", "");
		for (Rubro r : rubros) {
//			System.out.print(" " + r.getNombre());
			System.out.printf("%14s", r.getNombre());
		}
		System.out.println();
		for (int f = 0; f < matriz.length; f++) {
			// System.out.print("RUBRO");
			System.out.printf("%11s", meses[f].getNombreMes());
			for (int i = 0; i < matriz[i].length; i++) {
				System.out.printf("%14.2f", matriz[f][i]);

			}
			System.out.println();
		}

	}
 
	 */
}
