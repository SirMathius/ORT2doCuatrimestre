package ar.edu.ort.tp1.tp5Ej1;

public class Anio {
	private String[] meses;
	private int[] cantidadDiasMes;
	private int[] diasMes;

	
	public Anio() {
		this.diasMes = new int[]{31,28,31,30,31,30,31,31,30,31,30,31};
		this.cantidadDiasMes = new int[]{0,31,59,90,120,151,181,212,243,273,304,334};
		this.meses = new String[]{"ENERO","FEREBRO","MARZO","ABRIL","MAYO","JUNIO","JULIO","AGOSTO","SEPTIEMBRE","OCTUBRE","NOVIEMBRE","DICIEMBRE"};
	}
		
	public String getNombreMes(int numeroMes) {
		if (numeroMes <= 12 && numeroMes > 0){
			return meses[numeroMes-1];
		}else{
			return null;
		}
	}
	
	public int diasTranscurridos(int numeroMes){
		int result = 0;
		result = this.cantidadDiasMes[numeroMes-1];
		return result;
		
		/*
		 1° VERSION:
		if (numeroMes > 0 && numeroMes <= 12){ 
			for (int i = 0; i<(numeroMes - 1); i++){
				result += diasMes[i];				
			}
		}
		return result;
		*/
	}
}
