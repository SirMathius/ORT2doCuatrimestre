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
		float precioCosto = super.getCostoBase() * cantidadDeCuerpos * telaSillon.getPorcentaje()/100;
		return precioCosto;
	}


	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: Sillón - Modelo:" + super.getModelo()+" - Precio de venta:"+super.calcularPrecioVenta());		
	}
	

}
