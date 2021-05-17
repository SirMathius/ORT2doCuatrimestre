package ar.edu.ort.tp1.pacial1.clases;

public class Sillon extends Mueble {

	private int cantidadDeCuerpos;
	private TelaSillon telaSillon;


	public Sillon(String modelo, float costoBase, float porcentajeGanancia,int cantidadDeCuerpos, TelaSillon telaSillon) {
		super(modelo, costoBase, porcentajeGanancia);
	
		this.cantidadDeCuerpos = cantidadDeCuerpos;
		this.telaSillon = telaSillon;
	}


	@Override
	public float calcularPrecioCosto() {
	
		//(costo base * cantidad de cuerpos * porcentaje adicional por tela)*/
		float precioCosto = super.getCostoBase() * cantidadDeCuerpos * telaSillon.getPorcentaje();
		return precioCosto;
	}


	@Override
	public void mostrar() {
		//FIXME mal manejo de herencia, este m�todo no deb�a estar sobreescrito en las clases derivadas, sino utilizar el m�todo getClass().getSimpleName()
		System.out.println("Mueble tipo: Sill�n - Modelo:" + super.getModelo()+" - Precio de venta:"+super.calcularPrecioVenta());		
	}
	

}
