package ar.edu.ort.tp3.ejer5;

import java.util.ArrayList;

public class Jornada {

	private ArrayList<Partido> partidos;
	private int fecha;// 1,2...n

	public Jornada() {
		this.partidos = new ArrayList<>();

	}

	public Jornada(int fecha) {
		this.partidos = new ArrayList<>();
		this.fecha = fecha;
	}

	public void agregarPartido(Partido partido) {
		this.partidos.add(partido);
	}

	public void eliminarPartido(Partido partido) {
		this.partidos.remove(partido);
	}

	public ArrayList<Partido> getPartidos() {
		return partidos;
	}

	public int getFecha() {
		return fecha;
	}

	public void setFecha(int fecha) {
		this.fecha = fecha;
	}
}