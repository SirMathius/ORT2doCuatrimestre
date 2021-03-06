package ar.edu.ort.tp1.clase2.clases;

import java.util.ArrayList;

public class Funcion {

	private String dia;
	private String horaInicio;
	private ArrayList<Asiento> asientos;

	public Funcion(String dia, String horaInicio) {
		this.dia = dia;
		this.horaInicio = horaInicio;
		this.asientos = new ArrayList<Asiento>();
	}

	public boolean esDiaYHora(String dia, String horaInicio) {

		return this.dia == dia && this.horaInicio == horaInicio;
	}

	public boolean validarAsiento(int fila, char letra) {

		Asiento asiento = this.buscarAsiento(fila, letra);
		
		return asiento != null && asiento.estaReservadoletra();
	}
	
	private Asiento buscarAsiento(int fila, char letra) {
		int idx = 0;
		Asiento buscado = null;
		while (idx < this.asientos.size() && buscado == null) {
			if (this.asientos.get(idx).esFilaYLetra(fila, letra)) {
				buscado = this.asientos.get(idx);
				
			}
			idx ++;
			
		}
		
		return buscado;
	}

	public void marcarAsiento(int fila, char letra) {
		Asiento a = this.buscarAsiento(fila, letra);
		if (a != null) {
			a.marcarCumplido();
		}
	}

}
