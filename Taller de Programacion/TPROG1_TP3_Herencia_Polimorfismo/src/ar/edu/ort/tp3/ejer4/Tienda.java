package ar.edu.ort.tp3.ejer4;

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

	public ArrayList<Electrodomestico> getProductos() {
		return this.productos;
	}

}
