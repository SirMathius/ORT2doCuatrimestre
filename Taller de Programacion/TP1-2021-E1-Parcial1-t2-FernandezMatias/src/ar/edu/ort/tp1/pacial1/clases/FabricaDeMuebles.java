package ar.edu.ort.tp1.pacial1.clases;

import java.util.ArrayList;

public class FabricaDeMuebles implements Mostrable {

	private String nombre;
	private ArrayList<Mueble> mueblesFabricados;

	public FabricaDeMuebles(String nombre) {
		this.nombre = nombre;
		this.mueblesFabricados = new ArrayList<>();
	}

	public boolean fabricar(Mueble m) {
		//FIXME No resuelve lo pedido.
		boolean retorno = false;
		System.out.println("Fabricando el mueble:");
		m.mostrar();
		mueblesFabricados.add(m);

		return retorno;
	}

	public boolean superoCosto(double monto) {
		boolean seHaFabricado = false;
		int index = 0;
		//FIXME (while (!seHaFabricado &&....)
		while (seHaFabricado == false && index < mueblesFabricados.size()) {
			//FIXME tampoco hace falta este if:seHaFabricado = mueblesFabricados.get(index).calcularPrecioCosto() > monto  
			if (mueblesFabricados.get(index).calcularPrecioCosto() > monto) {

				seHaFabricado = true;

			}else {
				index++;
			}
		}

		return seHaFabricado;
	}

	@Override
	public void mostrar() {
//		FIXME SI bien no está mal querer modularizar aquí. esta haciendo dos ciclos sobre los productos fabricados.
		System.out.println("Fabrica de muebles: " + this.nombre);
		System.out.println(
				"La cantidad de sillas corresponde al " + this.porcentajeSillas() + "% del total de muebles fabricados");
		System.out.println("La venta total fue: " + this.ventaTotal());
	}

	private float porcentajeSillas() {

		float sillas = 0;
		float porcentajeSillas = 0;

		for (Mueble mueble : mueblesFabricados) {
			if (mueble instanceof Silla) {
				sillas++;
			}
		}

		//FIXME El 100 debe ir en constante.
		porcentajeSillas = (sillas* 100) / mueblesFabricados.size();

		return porcentajeSillas;
	}

	private float ventaTotal() {
		float ventaTotal = 0;

		for (Mueble mueble : mueblesFabricados) {
			ventaTotal = ventaTotal + mueble.calcularPrecioVenta();
		}

		return ventaTotal;
	}
}
