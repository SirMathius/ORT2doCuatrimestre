
public class BicicletaElec extends Bicicleta {
	

	
	private int wattsPotencia;
	
	public BicicletaElec(String marca, String modelo, int cantKilometros, int wattsPotencia) {
		super(marca, modelo, cantKilometros);
		this.wattsPotencia = wattsPotencia;
	}

	public int getWattsPotencia() {
		return wattsPotencia;
	}
	
	

}
