package ar.edu.ort.tp1.tp5Ej3;

import java.util.ArrayList;

public class GastoAnual {

	private ArrayList<Rubro> rubros;

	public GastoAnual() {
		this.rubros = new ArrayList<Rubro>();
	}

	public void agregarGasto(MES mes, String nombreRubro, double importe){
		if(importe>0){
			Rubro rubro = obtenerRubro(nombreRubro);
			rubro.agregarGastos(mes, importe);			
		} else{
			System.out.println("El monto debe ser mayor a cero!");
		}		
	}

	private Rubro obtenerRubro(String nombreRubro){
		Rubro rubro = buscarRubro(nombreRubro);
		if (rubro==null){
			this.rubros.add(new Rubro(nombreRubro));
			rubro = rubros.get(this.rubros.size()-1);
		} 
		return rubro;
	}

	private Rubro buscarRubro(String nombreRubro){
		Rubro rubro = null;
		int i=0;
		
		while(i<this.rubros.size() && rubro == null){
			if (this.rubros.get(i).getNombre().equals(nombreRubro)){
				rubro = this.rubros.get(i);
			}
			i++;
		}
		return rubro;
	}

	private double[][] consolidadoDeGastos(){
		double[][] gastosConsolidados =	new double[MES.values().length][rubros.size()];

		for (int i=0; i<gastosConsolidados.length; i++) {
			for (int j=0; j<gastosConsolidados[i].length; j++) {
				gastosConsolidados[i][j]=rubros.get(j).getTotalGastos(MES.values()[i]);
			}
		}
		return gastosConsolidados;
	}

	public double gastoAcumulado(MES mes){
		double[][] gastosConsolidados = consolidadoDeGastos();
		double gastoAcumulado=0;
		for (int i = 0; i<gastosConsolidados[mes.ordinal()].length; i++) {
			gastoAcumulado+=gastosConsolidados[mes.ordinal()][i];
		}
		return gastoAcumulado;
	}

	public double gastoAcumulado(String nombreRubro){
		double gastoAcumulado=0;
		Rubro rubro = buscarRubro(nombreRubro);
		if (rubro!=null){
			gastoAcumulado = rubro.getTotal();
		} 
		return gastoAcumulado;
	}

	public void informarConsumosPorMes(){
		for (MES mes : MES.values()) {
			System.out.println(mes);
			for (int j=0; j<rubros.size(); j++) {
				System.out.println(rubros.get(j).getNombre()+" = "
						+rubros.get(j).getTotalGastos(mes));
			}
			System.out.println("El total acumulado en el mes es de: "+gastoAcumulado(mes));
			System.out.println();
		}
	}

	public void informarPromedioMensualPorRubro(){
		double acumulador=0 , promedio=0;
		for (int j=0; j<rubros.size(); j++){
			acumulador = 0;
			for (MES mes : MES.values()) {
				acumulador += rubros.get(j).getTotalGastos(mes);
			}
			promedio=acumulador/MES.values().length;
			System.out.println("El promedio anual de: "+ rubros.get(j).getNombre() + " es de: "+promedio);
		}
	}


	public void informarMesMayorConsumo(){
		ArrayList<Double> listMax = new ArrayList<Double>();
		ArrayList<String> listRubroMax = new ArrayList<String>();
		ArrayList<MES> listMesMax = new ArrayList<MES>();
		Double max = 0.0;
		int posMax = 0;
		MES mesMax = MES.ENERO;
		for (int j=0; j<rubros.size(); j++){
			for (MES mes : MES.values()) {
				if(max < rubros.get(j).getTotalGastos(mes) ) {
					max = rubros.get(j).getTotalGastos(mes);
					posMax = j;
					mesMax = mes;
				}
			}
			max = 0.0;
			listMax.add(rubros.get(posMax).getTotalGastos(mesMax));
			listRubroMax.add(rubros.get(posMax).getNombre());
			listMesMax.add(mesMax);

		}
		System.out.println("Mes maximo por cada rubro:");
		for (int i = 0; i < listMax.size(); i++) {
			System.out.println("El rubro: " + listRubroMax.get(i) + 
					" gasto: " + listMax.get(i) + " en el mes: " + listMesMax.get(i));
		}
	}
}
