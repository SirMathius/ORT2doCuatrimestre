package ar.edu.ort.tp1.clase2.clases;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	private String peli;
	private ArrayList<Funcion> funciones;
	

	public Cine(String nombre, String peli) {

		this.nombre = nombre;
		this.peli = peli;
		this.funciones = new ArrayList<Funcion>();
	}

	public boolean procesarEntradas(ArrayList<Entrada> entradasAProcesar) {
		int idx = 0;
		boolean entradasOk = true;
		
		while (idx < entradasAProcesar.size() && entradasOk) {
			entradasOk = procesarEntrada(entradasAProcesar.get(idx));
			idx++;
		}
		
		if (entradasOk) {
			//Marcar todos los asientos
			marcarTodosLosAsientos(entradasAProcesar);
		}
		
		return entradasOk;
	}

	private void marcarTodosLosAsientos(ArrayList<Entrada> entradasAProcesar) {
		for (Entrada entrada : entradasAProcesar) {
			Funcion f = buscarFuncion(entrada.getDia(), entrada.getHoraInicio());
			f.marcarAsiento(entrada.getFila(), entrada.getLetra());
		}
		
	}

	private boolean procesarEntrada(Entrada entrada) {
		
		boolean entradaValida = false;
		Funcion funcion = buscarFuncion(entrada.getDia(), entrada.getHoraInicio());
		//Encontré la función???
		if (funcion != null) {
			//Verificar Asiento.
			entradaValida = funcion.validarAsiento(entrada.getFila(), entrada.getLetra());
		}
		return entradaValida;
		// return funcion != null && funcion.validarAsiento(entrada.getFila(), entrada.getLetra());
	}

	private Funcion buscarFuncion(String dia, String horaInicio) {
		int idx = 0;
		Funcion buscada = null;
		while (buscada == null && idx < this.funciones.size() ) {
			if (this.funciones.get(idx).esTuDiaHora(dia, horaInicio)) {
				buscada = this.funciones.get(idx);
			}
			idx++;
		}
		
		return buscada;
	}
}
