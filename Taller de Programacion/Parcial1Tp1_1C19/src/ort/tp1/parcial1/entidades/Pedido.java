/**
 * 
 */
package ort.tp1.parcial1.entidades;

import java.util.ArrayList;

/**
 * Clase que contiene un pedido generado.
 */
public class Pedido {

	private TipoPedido tipo;
	private ArrayList<Producto> productosList;
	private ArrayList<Integer> cantidadList;

	public Pedido(TipoPedido tipo) {
		
		this.tipo = tipo;
		this.productosList = new ArrayList<Producto>();
		this.cantidadList = new ArrayList<Integer>();
		
	}
	

	/**
	 * Permite agregar un producto al pedido
	 * 
	 * @param producto El {@link Producto} a agregar.
	 * @param cantidad La cantidadd del {@link Producto} a agregar
	 */
	public void agregarProducto(Producto producto, Integer cantidad) {

		if(this.buscarProducto(producto) == -1) {
			productosList.add(producto);
			cantidadList.add(cantidad);
		}else {
			int posRepetido = this.buscarProducto(producto);
			int cantActualizada = cantidadList.get(posRepetido) + cantidad;
			cantidadList.set(posRepetido, cantActualizada);
			
		}
		// buscar si el producto esta sumar cantidades
//		si no esta agregarlo
	}

	/**
	 * Saca un producto del pedido.
	 * 
	 * @param producto El {@link Producto} a sacar del pedido
	 * @param cantidad Cantidad del {@link Producto} a sacar del pedido
	 */
	public void sacarProducto(Producto producto, int cantidadASacar) {
		int posProductoSacar = this.buscarProducto(producto);
		if(cantidadASacar < cantidadList.get(posProductoSacar)) {
			
			int nuevaCanttidad = cantidadList.get(posProductoSacar) - cantidadASacar;
			cantidadList.set(posProductoSacar, nuevaCanttidad);
			
		}else {
			productosList.remove(posProductoSacar);
			cantidadList.remove(posProductoSacar);
		}
		
	}

	/**
	 * Devuelve el indice del producto buscado en la lista.
	 * 
	 * @param p {@link Producto}
	 * @return El indice >= 0 si encuentra el producto y -1 si no lo encuentra
	 */
	private int buscarProducto(Producto p) {
//completar
		int idx = -1;

		for (int i = 0; i < productosList.size(); i++) {
			if(productosList.get(i).equals(p)) {
				idx=i;
			}
			
		}
		
		
		return idx;
	}

	/**
	 * Indica la cantidad del producto dado.
	 * 
	 * @param producto {@link Producto} cuya cantidad se desea averiguar
	 * @return {@link Integer} conteniendo la cantidad del producto en el pedido -1
	 *         si no está el producto
	 */
	private int cantidadProducto(Producto producto) {
		int cantidad = -1;
		int posCantidad = this.buscarProducto(producto);
		if(posCantidad != -1){
			cantidad = cantidadList.get(posCantidad);
		}
		
		return cantidad;
	}

	/**
	 * Devuelve una estructura conteniendo las lineas del pedido
	 * 
	 * @return un la estructura conteniendo {@link LineaPedido}s
	 */
	private LineaPedido[] getTablaProductosPedidos() {
		//Completar
				LineaPedido[] lista = new LineaPedido[this.cantidadList.size()];

				for (int i = 0; i < productosList.size(); i++) {
					lista[i] = new LineaPedido(productosList.get(i), cantidadList.get(i));
				}

				return lista;
			}

	/**
	 * // * Calcula el importe del pedido
	 * 
	 * @return {@link Float} conteniendo el importe del pedido
	 */
	private float calcularImportePedido() {

		// Completar
		float importe = 0;
		
		for (int i = 0; i < productosList.size(); i++) {
			importe = importe + cantidadList.get(i) * productosList.get(i).getPrecio(tipo);
			
		}
		
		return importe;
	}

	public void mostrar() {
		// Muestro la tabla de productos y sus cantidades
//		System.out
//				.println("Cantidad \t\t Nombre\\t\tTipo De Producto\tPrecio Unitario\tTipo De Producto\tCertificadora ");
		System.out.printf(Mostrable.FORMATO_ENCABEZADO_CONSOLA, "Cantidad", "Nombre", "Tipo De Producto",
				"Precio Unitario", "Tipo De Producto", "tCertificadora");
		for (LineaPedido lp : this.getTablaProductosPedidos()) {
			lp.mostrar();
		}
		System.out.println("----------------------------------------------------------");
		// Muestro si es certificado o no
		if (this.isCertificadoSinTACC()) {
			System.out.println("El pedido es certificado sin TACC");
		} else {
			System.out.println("El pedido NO es certificado sin TACC");
		}
		System.out.println("----------------------------------------------------------");
		// Muestro el precio total
		System.out.printf("El precio total del pedido es: $ %5.2f\n", this.calcularImportePedido());
	}
}
