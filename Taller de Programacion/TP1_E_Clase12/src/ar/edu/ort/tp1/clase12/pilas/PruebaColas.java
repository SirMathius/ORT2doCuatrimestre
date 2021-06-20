package ar.edu.ort.tp1.clase12.pilas;

import ar.edu.ort.tp1.tdas.implementaciones.ColaNodos;
import ar.edu.ort.tp1.tdas.interfaces.Cola;

public class PruebaColas {

	public static void main(String[] args) {

		Cola<Integer> colaEnteros = new ColaNodos<>();

		Cola<Integer> colaEnteros2 = new ColaNodos<>(10);

		colaEnteros.add(10);
		colaEnteros.add(1);
		colaEnteros.add(550);
		colaEnteros.add(100);

		int cant = contarElementos(colaEnteros);
		mostrarElementoEnCola(colaEnteros);
		System.out.println("-------");
		System.out.println(estaElemento(colaEnteros, 550));
		System.out.println("-------");
		mostrarElementoEnCola(colaEnteros);
		System.out.println("-------");
		sacarElemento(colaEnteros, 1);
		mostrarElementoEnCola(colaEnteros);

	}

	private static boolean estaElemento(Cola<Integer> cola, int buscado) {
		Integer centinela = null;
		Integer valor;
		boolean esta = false;

		cola.add(centinela);
		valor = cola.remove();
		while (valor != centinela) {
			esta = esta || valor == buscado;
			cola.add(valor);
			valor = cola.remove();
		}
		return esta;
	}
	
	private static int sacarElemento(Cola<Integer> cola, int buscado) {
		Integer centinela = null;
		Integer valor;
		Integer aSacar = null;

		cola.add(centinela);
		valor = cola.remove();
		while (valor != centinela) {
			if (aSacar == null && valor == buscado) {
				aSacar = valor;
			}else {
				cola.add(valor);
			}

			valor = cola.remove();
		}
		return aSacar;
	}

	private static void mostrarElementoEnCola(Cola<Integer> cola) {
		Integer centinela = null;
		Integer valor;

		cola.add(centinela);
		valor = cola.remove();
		while (valor != centinela) {
			System.out.println(valor);
			cola.add(valor);
			valor = cola.remove();
		}
	}

	private static int contarElementos(Cola<Integer> cola) {

		Integer centinela = null;
		Integer valor;
		int contador = 0;

		cola.add(centinela);
		valor = cola.remove();
		while (valor != centinela) {
			contador++;
			cola.add(valor);
			valor = cola.remove();
		}

		return contador;
	}
}
