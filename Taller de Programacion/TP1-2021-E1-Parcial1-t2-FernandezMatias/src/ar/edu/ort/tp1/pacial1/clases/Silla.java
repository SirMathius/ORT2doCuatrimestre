package ar.edu.ort.tp1.pacial1.clases;

public class Silla extends Mueble {


	private static final int COEFICIENTE_SILLA = 3;
	private long alto;
	private MaterialSilla materialSilla;

	
	public Silla(String modelo, float costoBase, float porcentajeGanancia, long alto, MaterialSilla materialSilla) {
		super(modelo, costoBase, porcentajeGanancia);
		
		this.alto = alto;
		this.materialSilla =materialSilla;
		
		
	}


	@Override
	public float calcularPrecioCosto() {

		//(costo base + multiplicador del material * alto)*/
		
		float costoBase = super.getCostoBase();
		float materialSillaXAlto = materialSilla.getMultiplicadorValor()*alto;
		float precioCosto = costoBase + materialSillaXAlto;
		
		return precioCosto;
	}


	@Override
	public void mostrar() {
		//FIXME mal manejo de herencia, este método no debía estar sobreescrito en las clases derivadas, sino utilizar el método getClass().getSimpleName()
		System.out.println("Mueble tipo: Silla - Modelo:" + super.getModelo()+" - Precio de venta:"+super.calcularPrecioVenta());		
	}

}
