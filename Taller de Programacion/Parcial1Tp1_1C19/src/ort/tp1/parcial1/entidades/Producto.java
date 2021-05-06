/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Un producto
 */
public abstract class Producto {

	private FamiliaProducto familiaProducto;
	private String nombre;
	private Float precio;
	

	public Producto(FamiliaProducto familiaProducto, String nombre, float precio) {
		this.familiaProducto = familiaProducto;
		this.nombre = nombre;
		this.precio = precio;
	}

	public float getPrecio(TipoPedido tipoPedido) {

		return this.precio;
	}

	public String getNombre() {
		return nombre;
	}

}
