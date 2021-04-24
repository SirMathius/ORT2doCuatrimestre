package ar.edu.ort.tp3.ejer3;

import java.util.ArrayList;
import java.util.Scanner;

public class Tienda {

	private ArrayList<Electrodomestico> productos;

	public Tienda() {
		this.productos = new ArrayList<Electrodomestico>();
	}

	public void agregarProductos(Electrodomestico e) {
		this.productos.add(e);
	}

	public void mostrarProductos() {
		System.out.println("Productos disponibles: ");

		for (int i = 0; i < productos.size(); i++) {
			System.out.printf((i + 1) + "- ");
			productos.get(i).mostrarDatos();
		}

	}

	public void mostrarPedido() {

		for (Electrodomestico electrodomestico : this.tomarPedido()) {
			System.out.println(electrodomestico);
		}

	}

	public ArrayList<Electrodomestico> tomarPedido() {

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
				
				if (confirmar == "S") {
					pedido.add(productos.get(opcion));
					System.out.println("producto agregado");
				}
			} else {
				System.out.println("opcion invalida");
			}
			

		} while (opcion != -1);

		input.close();
		return pedido;
	}

}
