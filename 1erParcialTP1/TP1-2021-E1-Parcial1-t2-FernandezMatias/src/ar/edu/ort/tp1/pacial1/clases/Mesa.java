package ar.edu.ort.tp1.pacial1.clases;

public class Mesa extends Mueble {

	private static final float COEFICIENTE_SUPERFICIE = 0.2f;
	private long largo;
	private long ancho;
	private TipoMesa tipoMesa;
	// TODO A completar

	public Mesa(String modelo, float costoBase, float porcentajeGanancia, long largo, long ancho, TipoMesa tipoMesa) {
		super(modelo, costoBase, porcentajeGanancia);
		
		this.largo = largo;
		this.ancho = ancho;
		this.tipoMesa = tipoMesa;
	
	}

	@Override
	public float calcularPrecioCosto() {

		//(costo base * multiplicador del tipo de mesa + 0.2 * largo * ancho)*/
		
		float costoBaseXTipo = super.getCostoBase() * tipoMesa.getMultiplicadorValor() ;
		float coeficienteXLargoAncho = COEFICIENTE_SUPERFICIE * largo * ancho;
		float precioCosto = costoBaseXTipo + coeficienteXLargoAncho;
		return precioCosto;
	}

	@Override
	public void mostrar() {
		System.out.println("Mueble tipo: Mesa - Modelo:" + super.getModelo()+" - Precio de venta:"+super.calcularPrecioVenta());
		
	}

	

}
