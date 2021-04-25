package ar.edu.ort.tp3.ejer4;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {

	private String cuil;

	private ArrayList<Electrodomestico> pedido;

	public Cliente(String cuil) {
		this.cuil = cuil;
		ArrayList<Electrodomestico> pedido = new ArrayList<>();
	}

	public ArrayList<Electrodomestico> hacerPedido(ArrayList<Electrodomestico> productos) {

		Scanner input = new Scanner(System.in);
		ArrayList<Electrodomestico> pedido = new ArrayList<>();
		int opcion = -1;
		String confirmar = "N";

		do {

			System.out.println("seleccione nº de producto (0 para finalizar)");

			opcion = input.nextInt() - 1;

			if (opcion > -1 && opcion < productos.size()) {
				System.out.println(productos.get(opcion));
				input.nextLine();

				System.out.println("Confirmar? S/N");

				confirmar = input.nextLine();

				if (confirmar.equalsIgnoreCase("S")) {
					pedido.add(productos.get(opcion));
					System.out.println("producto agregado");
				}
			} else if (opcion == -1) {
				System.out.println("pedido finalizado");
			} else {
				System.out.println("opcion invalida");
			}

		} while (opcion != -1);

		input.close();
		return pedido;
	}

	public ArrayList<Electrodomestico> getPedido() {
		return pedido;
	}

}
