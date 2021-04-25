package ar.edu.ort.tp3.ejer4;

import java.util.ArrayList;

public class Ticket implements Imprimible {
	
	private Cliente cliente;
	
	private Tienda tienda;

	private ArrayList<Electrodomestico> productosOfrecidos;

	public Ticket(Cliente cliente, Tienda tienda) {
		this.cliente = cliente;
		this.productosOfrecidos = tienda.getProductos();
	}

	private float sacarTotal(ArrayList<Electrodomestico> pedido) {
		float total = 0;
		for (Electrodomestico electrodomestico : pedido) {
			total = total + electrodomestico.getPrecio();
		}
		return total;
	}


	@Override
	public void imprimir() {

		ArrayList<Electrodomestico> pedido = new ArrayList<>();
		pedido = cliente.hacerPedido(this.productosOfrecidos);
		float total = this.sacarTotal(pedido);
		System.out.println("Ticket de venta");
		System.out.println("Articulos: ");
		for (Electrodomestico electrodomestico : pedido) {
			System.out.println(electrodomestico.toString());
		}
		System.out.println("Total: $" + total);

	}
}
