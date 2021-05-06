/**
 * 
 */
package ort.tp1.parcial1.entidades;

/**
 * Representa un producto sin tacc
 */
public class ProductoSinTacc extends Producto {

	private static final String NOMBRE_MOSTRABLE = "Producto Sin TACC";
	private String certificadoraSinTac;

	public ProductoSinTacc(FamiliaProducto familiaProducto, String nombre, float precio, String certificadora) {
		super(familiaProducto, nombre, precio);
		this.certificadoraSinTac = certificadora;
	}

}
