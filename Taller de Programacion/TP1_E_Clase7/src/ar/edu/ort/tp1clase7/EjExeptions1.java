package ar.edu.ort.tp1clase7;

import java.util.ArrayList;

public class EjExeptions1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int entero1 = 10;
		int entero2 = 0;
		ArrayList<String> strings = new ArrayList<String>();
		strings.add("string1");
		strings.add("string2");
		strings.add("string3");

		// Sale "Infinity"
		// System.out.println("El cociente es: " + (double)entero1 / (double)entero2);

		try {
			System.out.println("Antes de dividir");
			System.out.println("El cociente es: " + entero1 / entero2);
			System.out.println("Despeus de divivir");
			System.out.println(strings.get(5));
			System.out.println("Despues del get()");
		} catch (ArithmeticException e) {
			System.out.println("Hubo un error Aritmetico, pero no rompemos nada");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("Hubo un error IOB, pero no rompemos nada");
		} catch (Exception e) {
			System.out.println("Hubo un error, pero no rompemos nada");
		}

		System.out.println("Esto no lo ejecuto");

	}

}
