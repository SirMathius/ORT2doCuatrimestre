package ar.edu.ort.tp1clase10;

import java.util.ArrayList;

public class ArreglosUniDim {

	private static final int _10 = 10;

	public static void main(String[] args) {

		// Arreglo 1 dim de enteros.
		int[] arregloEnteros = new int[_10];
		int tamanio = 23;
		int[] arregloEnteros2 = new int[tamanio];

		// Arreglo 1 dim de clases.
		ArrayList<Auto> autoList = new ArrayList<>();
		Auto[] autos = new Auto[autoList.size()];

		// Arreglo 1 dim String.
		String[] arregloStrings = new String[4];

		System.out.println(arregloStrings);

		// pongo valor en el elemento subindice 5
		arregloEnteros[5] = 3232;

		// leo el valor en una ubicacion
		System.out.println(arregloEnteros[5]);
		int variableEntera = arregloEnteros[5];

		int tamañoLeido = arregloEnteros.length;
		System.out.println("EL tamaño del vector es: " + arregloEnteros.length);

		// Array Index Out of Bounds Exception
		// arregloEnteros[10000] = 3232;
		// int nro = arregloEnteros[10000];

		String[] arrStringInicializado = { "elemento1", "elemento2", "elemento3" };

		
		//RECORRER Array
		
		//for
		for (int i = 0; i < arrStringInicializado.length; i++) {
			String string = arrStringInicializado[i];
			System.out.println(string);
		}

		//while
		int i = 0;
		while (i < arrStringInicializado.length) {
			String string = arrStringInicializado[i];
			System.out.println(string);
			i++;
		}
		
		//do while
		
		i = 0;
		do {
			String string = arrStringInicializado[i];
			System.out.println(string);
			i++;
		} while (i < arrStringInicializado.length);
		
		// for each
		
		for (String string : arrStringInicializado) {
			System.out.println(string);
		}
		
		
	}

	public int[] metodfoArregloInt() {

		return null;
	}

}
