package ar.edu.ort.tp5.pruebas;

import java.util.Iterator;

public class Matrices {

	public static void main(String[] args) {

		int[][] matrizEnteros = new int[10][3];
		// tipo [fila][columna]

		String[][] matrizStrings = { { "Hola", "Chau" }, { "Hello", "Bye" }, { "Shalom", "Shalom2" } };

		Auto[][] matrizAUto = new Auto[3][2];

		int[][] matrizCargada = { { 1, 2, 3 }, { 4, 5, 6, 12 }, { 7, 8, 9, 15, 54, 87, 366 }, { 10, 11 } };

		String valor = matrizStrings[2][1];
		System.out.println(valor);

		valor = matrizStrings[0][1];
		System.out.println(valor);

		matrizEnteros[2][1] = 22;
		System.out.println(matrizEnteros[2][1]);

		System.out.println("tam 1er dim: " + matrizEnteros.length);
		System.out.println("tam 2da dim: " + matrizEnteros[0].length);

		mostrarMatriz(matrizStrings);
		mostrarMatrizInvertida(matrizStrings);
		boolean esta = buscarElemento(matrizCargada, 555);
		System.out.println(esta ? "el valor buscado esta!" : "el valor buscado no esta!");

		/*
		 * public double[][] consolidadoDeGastos() { double[][] matriz = new
		 * double[Mes.values().length][rubros.size()];
		 * 
		 * for (int idxRubros = 0; idxRubros < rubros.size(); idxRubros++) {
		 * System.out.println(); Rubro r = rubros.get(idxRubros); for (int idxMeses = 0;
		 * idxMeses < Mes.values().length; idxMeses++) { matriz[idxMeses][idxRubros] =
		 * r.getTotalGastos(Mes.values()[idxMeses]);
		 * System.out.print(r.getTotalGastos(Mes.values()[idxMeses])+" "); } }
		 * 
		 * return matriz; }
		 * 
		 * 
		 * 
		 * public void informarConsumosPorMes() { double[][] matriz =
		 * consolidadoDeGastos(); double gasto = 0; Mes[] meses = Mes.values();
		 * System.out.printf("%11s", ""); for (Rubro r : rubros) { //
		 * System.out.print(" " + r.getNombre()); System.out.printf("%14s",
		 * r.getNombre()); } System.out.println(); for (int f = 0; f < matriz.length;
		 * f++) { // System.out.print("RUBRO"); System.out.printf("%11s",
		 * meses[f].getNombreMes()); for (int i = 0; i < matriz[i].length; i++) {
		 * System.out.printf("%14.2f", matriz[f][i]);
		 * 
		 * } System.out.println(); }
		 * 
		 * }
		 * 
		 */
	}

	private static void mostrarMatrizInvertida(String[][] matrix) {

		for (int idxCol = 0; idxCol < matrix[0].length; idxCol++) {

			for (int idxFila = 0; idxFila < matrix.length; idxFila++) {
				System.out.printf(matrix[idxFila][idxCol]);

				System.out.printf("\t");
			}
			System.out.println("\n");
		}

	}

	private static boolean buscarElemento(int[][] matrizCargada, int buscado) {

		boolean esta = false;
		int idxFila = 0;
		int idxCol;

		while (!esta && idxFila < matrizCargada.length) {
			idxCol = 0;
			while (!esta && idxCol < matrizCargada[idxFila].length) {
				esta = buscado == matrizCargada[idxFila][idxCol];
				idxCol++;
			}
			idxFila++;
		}

		return esta;
	}

	private static void mostrarMatriz(String[][] matrix) {

		for (int idxFila = 0; idxFila < matrix.length; idxFila++) {
			String[] unaFila = matrix[idxFila];
			for (int idxColumna = 0; idxColumna < unaFila.length; idxColumna++) {
				String valor = unaFila[idxColumna];
				System.out.printf(valor);
				System.out.printf("\t");
			}
			System.out.println();

		}

		System.out.println("------------------------");
		// forma Pro
		for (int dxFila = 0; dxFila < matrix.length; dxFila++) {
			for (int dxColumna = 0; dxColumna < matrix[dxFila].length; dxColumna++) {
				System.out.printf(matrix[dxFila][dxColumna]);

				System.out.printf("\t");

			}
			System.out.println();
		}

	}

}
