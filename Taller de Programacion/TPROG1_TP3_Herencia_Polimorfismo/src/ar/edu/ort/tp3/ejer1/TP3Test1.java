package ar.edu.ort.tp3.ejer1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TP3Test1 {

	public static void main(String[] args) {

		/*
		 * Empleado jose = new Asalariado("Jose",30,10000); Empleado carlos = new
		 * SubContratado("Carlos", 23, 50, 100);
		 * 
		 * System.out.println(jose.toString()); System.out.println(carlos.toString());
		 */

		ArrayList<String> array_nombres = new ArrayList<>();
		ArrayList<Integer> array_cantidades = new ArrayList<>();
		ArrayList<Integer> array_precio = new ArrayList<>();

		array_nombres.add("Caramelos");
		array_cantidades.add(100);
		array_precio.add(1);

		array_nombres.add("Cigarrillos");
		array_cantidades.add(20);
		array_precio.add(200);

		array_nombres.add("Chicles");
		array_cantidades.add(500);
		array_precio.add(5);

		array_nombres.add("Galletitas");
		array_cantidades.add(10);
		array_precio.add(50);

		array_nombres.add("Alfajores");
		array_cantidades.add(30);
		array_precio.add(60);

		array_nombres.add("Gaseosa");
		array_cantidades.add(5);
		array_precio.add(150);

		mostrarProductos(array_nombres, array_cantidades, array_precio);

		ArrayList<String> array_nombresC = new ArrayList<>();
		ArrayList<Integer> array_cantidadesC = new ArrayList<>();
		ArrayList<Integer> array_precioC = new ArrayList<>();

		ingresarPedido(array_nombres, array_cantidades, array_precio, array_cantidadesC, array_nombresC, array_precioC);

		calcularOperacion(array_cantidadesC, array_nombresC, array_precioC);

		/**
		 * Imprimas el menu con los items que tengan stock. Tomar la seleccion del
		 * usuario, con la cantidad deseada hasta que ingrese 0 para salir tomar la
		 * cantidad con la que va a pagar imprimir la boleta con los items elegidos
		 * (nombre, precio base, cantidad y precio total), descontando el stock de cada
		 * uno mostrar el total, el pago recibo y el vuelto
		 */

		/**
		 * Una persona lleva la cuenta de sus gastos personales mensuales Quieren
		 * ingresar por mes cuanto dinero cobrò y cuanto dinero gastò por cada mes, se
		 * tiene que pedir ambos valores hasta la persona ingresa -1 el ingreso. (puede
		 * no haber tenido gastos ni ingresos un mes, pero no pueden ser negativos)
		 * cuando se terminan todos los meses, imprimir el resumen de ingresos y gastos,
		 * con el neto del mes y el balance
		 */

	}

	private static void calcularOperacion(ArrayList<Integer> array_cantidadesC, ArrayList<String> array_nombresC,
			ArrayList<Integer> array_precioC) {

		Scanner s = new Scanner(System.in);

		System.out.println("con cuanto va a pagar?");
		int pago = s.nextInt();
		int total = 0;

		for (int i = 0; i < array_nombresC.size(); i++) {
			System.out.println(array_nombresC.get(i) + " $" + array_precioC.get(i) + " X" + array_cantidadesC.get(i)
					+ " = $" + (array_cantidadesC.get(i) * array_precioC.get(i)));
			total = total + (array_cantidadesC.get(i) * array_precioC.get(i));
		}

		System.out.println("total a pagar = $" + total);
		System.out.println("pago recibido = $" + pago);
		System.out.println("vuelto = $" + (pago - total));

		s.close();
	}

	private static void ingresarPedido(ArrayList<String> array_nombres, ArrayList<Integer> array_cantidadesC,
			ArrayList<Integer> array_precio, ArrayList<Integer> array_cantidades, ArrayList<String> array_nombresC,
			ArrayList<Integer> array_precioC) {

		Scanner s = new Scanner(System.in);

		int cantidad = 1;
		int opcion = -1;
		int precio = 0;

		while (opcion != 0) {

			System.out.println("ingrese producto");
			opcion = s.nextInt();
			System.out.println("ingrese la cantidad");
			cantidad = s.nextInt();

			boolean noEsta = buscarProducto(opcion, array_nombres, array_nombresC);

			if(noEsta) {
				procesarItemNuevo(opcion, cantidad, array_nombres, array_cantidades, array_precio, array_cantidadesC, array_nombresC, array_precioC);
		//	} else {
		//		sumarItemRepetido(opcion, cantidad, array_nombres, array_cantidades, array_precio, array_cantidadesC, array_nombresC, array_precioC){
		//			
				}
			}
			


		}

	

	private static void sumarItemRepetido(int opcion, int cantidad, ArrayList<String> array_nombres,
			ArrayList<Integer> array_cantidades, ArrayList<Integer> array_precio, ArrayList<Integer> array_cantidadesC,
			ArrayList<String> array_nombresC, ArrayList<Integer> array_precioC) {
		if (opcion > 1) {
			int nuevaCantidad = array_cantidades.get(opcion - 1) - cantidad;
			array_cantidades.set(opcion - 1, nuevaCantidad);
			array_nombresC.add(array_nombres.get(opcion - 1));
			array_cantidadesC.add(cantidad);
			array_precioC.add(array_precio.get(opcion - 1));

		}			
	}

	private static void procesarItemNuevo(int opcion, int cantidad, ArrayList<String> array_nombres, ArrayList<Integer> array_cantidades,
			ArrayList<Integer> array_precio, ArrayList<Integer> array_cantidadesC, ArrayList<String> array_nombresC,
			ArrayList<Integer> array_precioC) {
		if (opcion > 1) {
			int nuevaCantidad = array_cantidades.get(opcion - 1) - cantidad;
			array_cantidades.set(opcion - 1, nuevaCantidad);
			array_nombresC.add(array_nombres.get(opcion - 1));
			array_cantidadesC.add(cantidad);
			array_precioC.add(array_precio.get(opcion - 1));

		}		
	}

	private static boolean buscarProducto(int opcion, ArrayList<String> array_nombres,
			ArrayList<String> array_nombresC) {
		boolean noEsta = true;
		for (String producto : array_nombresC) {
			if (producto.equals(array_nombres.get(opcion))) {
				noEsta = false;
			}
		}

		return noEsta;
	}

	private static void mostrarProductos(ArrayList<String> array_nombres, ArrayList<Integer> array_cantidades,
			ArrayList<Integer> array_precio) {
		for (int i = 0; i < array_nombres.size(); i++) {
			System.out.println((i + 1) + ") " + array_nombres.get(i) + ": " + array_cantidades.get(i) + " - $ "
					+ array_precio.get(i));

		}
	}

}
