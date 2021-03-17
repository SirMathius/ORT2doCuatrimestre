package ar.edu.ort.tp1.clase2.clases;

import java.util.ArrayList;

public class Cine {

	private String nombre;
	private String pelicula;
	private ArrayList<Funcion> funciones;

	public Cine(String nombre, String peli) {

		this.nombre = nombre;
		this.pelicula = pelicula;
		this.funciones = new ArrayList<Funcion>();
	}

	public boolean procesarEntradas(ArrayList<Entrada> entradasAProcesar) {
		int idx = 0;
		boolean entradasProcesadas = true;

		while (idx < entradasAProcesar.size() && entradasProcesadas) {
			entradasProcesadas = procesarEntrada(entradasAProcesar.get(idx));
			idx++; 
		}
		
		
		if (entradasProcesadas) {
			
			masrcarTodosLosAsientos(entradasAProcesar);
			
		}
		
		return entradasProcesadas;
	}

	private void masrcarTodosLosAsientos(ArrayList<Entrada> entradasAProcesar) {

		for (Entrada entrada : entradasAProcesar) {
			Funcion f = buscarFuncion(entrada.getDia(), entrada.getHoraInicio());
			f.marcarAsiento(entrada.getFila(), entrada.getLetra());
		}
		
	}

	private boolean procesarEntrada(Entrada entrada) {
		
		boolean entradaValida = false;
		Funcion funcion = buscarFuncion(entrada.getDia(), entrada.getHoraInicio());;
		
		return funcion != null && funcion.validarAsiento(entrada.getFila(), entrada.getLetra());
	}

	private Funcion buscarFuncion(String dia, String horaInicio) {
		int idx = 0;
		Funcion buscada = null;
		while (idx < this.funciones.size() && buscada == null) {
			if (this.funciones.get(idx).esDiaYHora(dia, horaInicio)) {
				buscada = this.funciones.get(idx);
				
			}
			idx ++;
			
		}
		
		return buscada;
	}
}
