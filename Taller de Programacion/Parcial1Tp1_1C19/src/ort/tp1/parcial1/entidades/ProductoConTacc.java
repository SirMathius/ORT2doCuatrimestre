/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Representa un producto con tacc que puede estar en un pedido
 */
public class ProductoConTacc extends Producto {


	private static final String NOMBRE_MOSTRABLE = "Producto Con TACC";

	
	public ProductoConTacc(FamiliaProducto familiaProducto, String nombre, float precio) {
		super(familiaProducto, nombre, precio);
		// TODO Auto-generated constructor stub
	}
}
