package ar.edu.ort.tp5.ej3;

public class Rubro {

	int TOTAL_MESES = Mes.values().length;
	
	private String nombre;
	private double[] gastosPorMes;
	
	
	public Rubro(String nombre) {
	
		this.nombre = nombre;
		inicializarGastos();
		
	}


	public String getNombre() {
		return nombre;
	}


	private void inicializarGastos() {

		this.gastosPorMes = new double [TOTAL_MESES];
	}
	
	public void agregarGasto(Mes mes, double importe) {
		gastosPorMes[mes.ordinal()] += importe;
	}
	
	public double getTotalGastos( Mes mes) {
		
		return gastosPorMes[mes.ordinal()];
	}
	
	public double getGastoAcumulado() {
		int gastoAcumulado = 0;
		for (int i = 0; i < gastosPorMes.length; i++) {
			gastoAcumulado += gastosPorMes[i];
		}
		return gastoAcumulado;
	}
}
