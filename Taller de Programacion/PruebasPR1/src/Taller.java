import java.util.ArrayList;

public class Taller {
	
	final private int MAX_KILOMETROS = 2000;
	final private int MAX_POTENCIA = 250;

	private ArrayList<Bicicleta> bicicletas;

	public Taller() {
		this.bicicletas = new ArrayList<>();
	}

	public void agregarBicicleta(String marca, String modelo, int uso) {
		
		Bicicleta bicicleta = new Bicicleta(marca, modelo, uso);
		this.bicicletas.add(bicicleta);
			
	}
	
	public void agregarBicicleta(String marca, String modelo, int uso, int volt) {
		
		Bicicleta bicicleta = new BicicletaElec(marca, modelo, uso, volt);
		this.bicicletas.add(bicicleta);
		
		
	}

	
	public int cantServiciosPosibles() {
		int serviciosPosibles = 0;

		for (Bicicleta bicicleta : bicicletas) {
			
			if (this.okParaServicio(bicicleta)) {
				serviciosPosibles++;
			}
		}

		return serviciosPosibles;
	}
	
	private boolean okParaServicio(Bicicleta bicicleta) {
		
		boolean ok = false;
		
		if(bicicleta instanceof BicicletaElec) {			
		//	BicicletaElec b = (BicicletaElec) bicicleta;
		//	ok = b.getWattsPotencia() <= MAX_POTENCIA && b.getCantKilometros() < MAX_KILOMETROS;
			
			ok= ((BicicletaElec)bicicleta).getWattsPotencia() <= MAX_POTENCIA 
					&& (bicicleta).getCantKilometros() <= MAX_KILOMETROS;
			
		} else {
			ok = bicicleta.getCantKilometros() < MAX_KILOMETROS;
		}
		
		return ok;
	}


}
